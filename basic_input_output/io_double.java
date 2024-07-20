package basic_input_output;
import java.util.Scanner;

/**
 * io_double
 */
public class io_double {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter double : ");

        double x = scanner.nextDouble();

        System.out.println("value is "+x);
        scanner.close();
    }
}