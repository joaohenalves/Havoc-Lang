import java.util.ArrayList;

public class FileInterpreter {

    public FileInterpreter(ArrayList<String> file) {
        for (int i = 0; i < file.size(); i++) {
            if (file.get(i).equals("testando")) {
                System.out.println("AE CARAIO DEU CERTO");
            }
        }
    }

}