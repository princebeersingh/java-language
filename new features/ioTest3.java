import java.io.FileReader;
import java.io.IOException;

/**
 * ioT
 */
public class ioTest3 {

    public static void main(String[] args) {
        String filePath="input.txt";
        try (FileReader fr =  new FileReader(filePath)) {
            int b;
            while ((b=fr.read())!=-1) {
                System.out.print((char )b);
            }
            
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}