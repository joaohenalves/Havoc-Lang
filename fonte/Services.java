
import java.util.ArrayList;

public class Services {

    public static ArrayList<Variables> varArray = new ArrayList();

    public static ArrayList<String> varTypes = new ArrayList();

    static {
        varTypes.add("int");
        varTypes.add("double");
        varTypes.add("float");
        varTypes.add("long");
        varTypes.add("string");
        varTypes.add("boolean");
    }


    public static void doCreateVariable(String identifier, String type, String value) { // Função instanciadora de variáveis

        Integer index = null;

        for (int i = 0; i < varArray.size(); i++) { // Detecta se já existe uma variável com o mesmo nome. Se houver, sobreescreve
            if (identifier.equals(varArray.get(i).getIdentifier())) {
                index = i;
            }
        }

        switch (type) {
            case "int":
                if (value.equals("default")) {
                    value = "0";
                }
                IntegerVar integerVar = new IntegerVar(Integer.parseInt(value), identifier);
                if (index != null) {
                    varArray.set(index, integerVar);
                } else {
                    varArray.add(integerVar);
                }
                break;
            case "double":
                if (value.equals("default")) {
                    value = "0";
                }
                DoubleVar doubleVar = new DoubleVar(Double.parseDouble(value), identifier);
                if (index != null) {
                    varArray.set(index, doubleVar);
                } else {
                    varArray.add(doubleVar);
                }
                break;
            case "float":
                if (value.equals("default")) {
                    value = "0";
                }
                FloatVar floatVar = new FloatVar(Float.parseFloat(value), identifier);
                if (index != null) {
                    varArray.set(index, floatVar);
                } else {
                    varArray.add(floatVar);
                }
                break;
            case "long":
                if (value.equals("default")) {
                    value = "0";
                }
                LongVar longVar = new LongVar(Long.parseLong(value), identifier);
                if (index != null) {
                    varArray.set(index, longVar);
                } else {
                    varArray.add(longVar);
                }
                break;
            case "string":
                if (value.equals("default")) {
                    value = "";
                }
                StringVar stringVar = new StringVar(value, identifier);
                if (index != null) {
                    varArray.set(index, stringVar);
                } else {
                    varArray.add(stringVar);
                }
                break;
            case "boolean":
                if (value.equals("default")) {
                    value = "false";
                }
                BooleanVar booleanVar = new BooleanVar(Boolean.parseBoolean(value), identifier);
                if (index != null) {
                    varArray.set(index, booleanVar);
                } else {
                    varArray.add(booleanVar);
                }
                break;
            default:
                System.out.println("Erro ao criar a variável!");
        }
    }

    public static void operationDetector(String op, Variables var, String value1, String value2) { // Detecta qual operação matemática o algoritmo deseja executar
        switch (op) {
            case "+":
                var.sumOperation(value1, value2);
                break;
            case "-":
                var.subOperation(value1, value2);
                break;
            case "*":
                var.multOperation(value1, value2);
                break;
            case "/":
                var.divOperation(value1, value2);
                break;
            case "%":
                var.moduleOperation(value1, value2);
                break;
        }
    }

    public static boolean doCompareVariables(String value1, String value2, String value3, String op) { // Comparação de variáveis para condicionais

        if (Services.doDetectVariable(value1) != -1) {
            value1 = Services.varArray.get(Services.doDetectVariable(value1)).getValue();
        }
        if (Services.doDetectVariable(value2) != -1) {
            value2 = Services.varArray.get(Services.doDetectVariable(value2)).getValue();
        }

        switch (op) {
            case ">":
                if (Integer.parseInt(value1) > Integer.parseInt(value2)) {
                    return true;
                } else {
                    return false;
                }
            case "<":
                if (Integer.parseInt(value1) < Integer.parseInt(value2)) {
                    return true;
                } else {
                    return false;
                }
            case "==":
                if (Integer.parseInt(value1) == Integer.parseInt(value2)) {
                    return true;
                } else {
                    return false;
                }
            case ">=":
                if (Integer.parseInt(value1) >= Integer.parseInt(value2)) {
                    return true;
                } else {
                    return false;
                }
            case "<=":
                if (Integer.parseInt(value1) <= Integer.parseInt(value2)) {
                    return true;
                } else {
                    return false;
                }
            case "!=":
                if (Integer.parseInt(value1) != Integer.parseInt(value2)) {
                    return true;
                } else {
                    return false;
                }
            case "%":
                if (Integer.parseInt(value1) % Integer.parseInt(value2) == Integer.parseInt(value3)) {
                    return true;
                } else {
                    return false;
                }
            default:
                return false;
        }
    }

    public static int doDetectVariable(String identifier) { // Detecta se uma palavra do arquivo corresponde a um nome de variável existente
        for (int i = 0; i < Services.varArray.size(); i++) {
            if (Services.varArray.get(i).getIdentifier().equals(identifier)) {
                return i;
            } else {
                continue;
            }
        }
        return -1;
    }
}