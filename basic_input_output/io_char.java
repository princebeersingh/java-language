package basic_input_output;
import java.util.Scanner;

/**
 * io_char
 */
public class io_char {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter char :");

        char x = scanner.next().charAt(7);

        System.out.println("char is "+x);
        scanner.close();
    }
}