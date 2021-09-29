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
                lines.add(line);
            }

            input.close();

            for (int i = 0; i < lines.size(); i++) {
                System.out.println("Linha " + i + ": " + lines.get(i));
            }


            FileInterpreter f = new FileInterpreter(lines);



        } catch (Exception e) {
            System.out.println("Nao foi possivel abrir o arquivo.");
            e.printStackTrace();
        }
    }
}