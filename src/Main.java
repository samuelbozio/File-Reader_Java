import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File file = new File("file.txt");

        try (FileReader fr = new FileReader(file)) {

            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
            FileWriter fw = new FileWriter(file);
            fw.write("Olá, mundo!");
            fw.flush();

            int i;
            while ((i=fr.read()) != -1) {
                System.out.print((char) i);
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }



    }
}