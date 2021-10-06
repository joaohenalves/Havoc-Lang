import java.util.Scanner;

public class FileInterpreter {

    public static Scanner scan = new Scanner(System.in);

    public static void doInterpretateFile(String[][] file, int start, int end) {

        for (int i = start; i < end; i++) { // Percorre o arquivo

            if (file[i].length == 0) {
                continue;
            }

            if (Services.varTypes.contains(file[i][0])) { // Verifica se a linha se inicia com o nome de um tipo de dado e armazena a variável

                if (file[i].length == 4) { // verifica se a linha de inicialização da variável já possui um valor atribuido. Se não houver, inicializa com valor padrão
                    Services.doCreateVariable(file[i][1], file[i][0], file[i][3]);
                } else {
                    Services.doCreateVariable(file[i][1], file[i][0], "default");
                }

            } else if (file[i][0].equals("input")) { // Identifica se há um comando de entrada de dados

                for (int o = 0; o < Services.varArray.size(); o++) {
                    if (Services.varArray.get(o).getIdentifier().equals(file[i][1])) {
                        Services.varArray.get(o).setValue(scan.nextLine());
                    }
                } 

            } else if (file[i][0].equals("print")) { // Identifica se há um comando de saída de dados.
                if (Services.doDetectVariable(file[i][1]) != -1) { // Verifica se o que foi digitado foi um nome de váriável e busca o valor da mesma
                        System.out.println(Services.varArray.get(Services.doDetectVariable(file[i][1])).getValue());
                 } else {
                    System.out.println(file[i][1]);
                }

            } else if (Services.doDetectVariable(file[i][0]) != -1) { 

                if (file[i].length == 3 && file[i][1].equals("=")) { // Detecta uma simples atribuição de variável (Só para variáveis já inicializadas)
                    Services.varArray.get(Services.doDetectVariable(file[i][0])).setValue(file[i][2]);
                    continue;
                }

                String temp1, temp2;

                if (Services.doDetectVariable(file[i][2]) != -1) { // Detecta uma atribuição de valor de uma variável, busca se ambos operandos da expressão são variáveis instanciadas ou não
                    temp1 = Services.varArray.get(Services.doDetectVariable(file[i][2])).getValue();
                } else {
                    temp1 = file[i][2];
                }

                if (Services.doDetectVariable(file[i][4]) != -1) {
                    temp2 = Services.varArray.get(Services.doDetectVariable(file[i][4])).getValue();
                } else {
                    temp2 = file[i][4];
                }

                Services.operationDetector(file[i][3], Services.varArray.get(Services.doDetectVariable(file[i][0])), temp1, temp2); // Encaminha os dois valores a serem atribuidos na variável a uma função que detecta qual a operação desejada
            
            } else if (file[i][0].equals("for")) { // Detecta um laço "for", executa em um loop a leitura do arquivo somente nas linhas correspondentes ao laço declarado no arquivo de entrada

                int endingIndex = 0;

                for (int x = i + 1; x < end; x++) {
                    if (file[x][0].equals("endFor")) {
                        endingIndex = x;
                        break;
                    }
                }

                Services.doCreateVariable(file[i][1], "int", file[i][4]);

                int loopAux1 = 0;
                int loopAux2 = 0;

                if (Services.doDetectVariable(file[i][4]) != -1) {
                    loopAux1 = Integer.parseInt(Services.varArray.get(Services.doDetectVariable(file[i][4])).getValue());
                } else {
                    loopAux1 = Integer.parseInt(file[i][4]);
                }
                if (Services.doDetectVariable(file[i][6]) != -1) {
                    loopAux2 = Integer.parseInt(Services.varArray.get(Services.doDetectVariable(file[i][6])).getValue());
                } else {
                    loopAux2 = Integer.parseInt(file[i][6]);
                }
                for (int n = loopAux1; n < loopAux2; n += Integer.parseInt(file[i][8])) {
                    doInterpretateFile(file, i + 1, endingIndex);
                    Services.operationDetector("+", Services.varArray.get(Services.doDetectVariable(file[i][1])), Services.varArray.get(Services.doDetectVariable(file[i][1])).getValue(), file[i][8]);
                }

                Services.varArray.remove(Services.varArray.get(Services.doDetectVariable(file[i][1])));

                i = endingIndex;

            } else if (file[i][0].equals("if")) {

                boolean comparisonResult = false;
                int endIf = i;

                if (file[i].length > 5) {
                    comparisonResult = Services.doCompareVariables(file[i][1], file[i][3], file[i][5], file[i][2]);
                } else {
                    comparisonResult = Services.doCompareVariables(file[i][1], file[i][3], "null", file[i][2]);
                }

                for (int o = i + 1; o < file.length; o++) {
                    if (file[o][0].equals("endIf")) {
                        break;
                    } else {
                        endIf++;
                    }
                }

                if (comparisonResult) {
                    continue;
                } else {
                    i = endIf + 1;
                }

            }
        }           
    }
}
