package basic_input_output;
import java.util.Scanner;

/**
 * io_short
 */
public class io_short {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        System.out.println("Enter sort val in range : ");

        short x = scanner.nextShort();

        System.out.println("Value is "+x);
        scanner.close();
    }
}