import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        try {
            ArrayList<String> lines = new ArrayList();
            File file = new File(args[0]);
            Scanner input = new Scanner(file);

            while (input.hasNextLine()) {
                String line = input.nextLine();
                if (line.length() > 0) {
                    lines.add(line);
                }
            }

            input.close();

            String[][] fileReady = new String[lines.size()][];

            for (int i = 0; i < lines.size(); i++) { // Transforma o arquivo em uma matriz, elimiando os espaços e concatenando strings compostas por duas ou mais palavras que foram separadas por espaço
                String stringBuilder = "";
                String[] temp1 = lines.get(i).split("\\s+");
                ArrayList<String> temp2 = new ArrayList();
                boolean stringFound = false;
                for (int j = 0; j < temp1.length; j++) {
                    if (temp1[j].startsWith("\"") && !(temp1[j].substring(temp1[j].length() - 1).equals("\""))) {
                        stringBuilder = stringBuilder.concat(temp1[j]);
                        stringFound = true;
                        continue;
                    } else if (stringFound) {
                        stringBuilder = stringBuilder.concat(" ").concat(temp1[j]);
                        if (temp1[j].substring(temp1[j].length() - 1).equals("\"")) {
                                stringFound = false;
                        }
                    }
                    if (!temp1[j].equals("") && stringBuilder.equals("")) {
                        temp2.add(temp1[j]);
                    } else if (!stringBuilder.equals("") && !stringFound) {
                        temp2.add(stringBuilder);
                        stringBuilder = "";
                    }
                }

                String[] temp3 = new String[temp2.size()];
                for (int l = 0; l < temp2.size(); l++) {
                    temp3[l] = temp2.get(l);
                }
                fileReady[i] = temp3;
            }

            FileInterpreter.doInterpretateFile(fileReady, 0, fileReady.length);

        } catch (Exception e) {
            System.out.println("Nao foi possivel abrir o arquivo.");
            e.printStackTrace();
        }
    }
}