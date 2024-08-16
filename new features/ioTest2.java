import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ioTest2
 */
public class ioTest2 {

    public static void main(String[] args) {
        String filePath= "input.txt";
        String txtx="""  
        cjecnpmco[ewm[comw[ocmpoewm[oc]]]]
        wdnondod e cke ce
        dnjdood ep d
        edjieone ioc
        dned ne""";
        try (FileOutputStream fos=new FileOutputStream(filePath)) {
            byte[] B=txtx.getBytes();
            fos.write(B);
           System.out.println("200");
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}