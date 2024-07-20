package methods;
import java.util.Scanner;

/**
 * basic_funtion
 */
public class basic_funtion {

    public static void greet(String val)
    {
        System.out.println("hi "+val);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        greet(s);
        scanner.close();
    }
}