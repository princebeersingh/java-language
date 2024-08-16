import java.io.FileWriter;
import java.io.IOException;

/**
 * ioTest4
 */
public class ioTest4 {

    public static void main(String[] args) {
        String filePath = "input.txt";
        String txtx = """
                mai tera sharmaya hu
                jo bhi mai ban paya hu
                raste mil jate h manjile mil jati h 
                tumse hi tumse hi 
                """;
        try (FileWriter fw = new FileWriter(filePath)) {
            fw.write(txtx);
            System.out.println("200");
        } catch (IOException e) {
           System.out.println(e.getStackTrace());
        }
    }
}