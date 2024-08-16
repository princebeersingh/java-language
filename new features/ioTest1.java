import java.io.FileInputStream;
import java.io.IOException;

/**
 * ioTest
 */
public class ioTest1 {

    public static void main(String[] args) {
        String filePath="input.txt";
        try(FileInputStream fis = new FileInputStream(filePath))
        {
            int bytT;
            while ((bytT=fis.read())!=-1) {
                System.out.print((char)bytT);
            }
        }
       catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}