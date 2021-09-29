import java.util.ArrayList;

public class Services {

    public static ArrayList<Variables> varArray = new ArrayList();

    public static void doCreateVariable(String identifier, String type, String value) {

        Integer index = null;


        for (int i = 0; i < varArray.size(); i++) {
            if (identifier.equals(varArray.get(i).getIdentifier())) {
                index = i;
            }
        }

        switch (type) {
            case "int":
                IntegerVar integerVar = new IntegerVar(Integer.parseInt(value), identifier);
                if (index != null) {
                    varArray.set(index, integerVar);
                } else {
                    varArray.add(integerVar);
                }
                break;
            case "double":
                DoubleVar doubleVar = new DoubleVar(Double.parseDouble(value), identifier);
                if (index != null) {
                    varArray.set(index, doubleVar);
                } else {
                    varArray.add(doubleVar);
                }
                break;
            case "float":
                FloatVar floatVar = new FloatVar(Float.parseFloat(value), identifier);
                if (index != null) {
                    varArray.set(index, floatVar);
                } else {
                    varArray.add(floatVar);
                }
                break;
            case "long":
                LongVar longVar = new LongVar(Long.parseLong(value), identifier);
                if (index != null) {
                    varArray.set(index, longVar);
                } else {
                    varArray.add(longVar);
                }
                break;
            case "string":
                StringVar stringVar = new StringVar(value, identifier);
                if (index != null) {
                    varArray.set(index, stringVar);
                } else {
                    varArray.add(stringVar);
                }
                break;
            case "boolean":
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

}