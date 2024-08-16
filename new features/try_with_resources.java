import java.io.FileOutputStream;

/**
 * try_with
 */
public class try_with_resources {

    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("file1.txt")) {
            String text = "Hello World. This is my java program";
            byte arr[] = text.getBytes();
            fos.write(arr);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Resource are closed and message has been written into the file1.txt");
    }
}