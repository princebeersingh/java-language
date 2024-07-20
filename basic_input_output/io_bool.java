package basic_input_output;
import java.util.Scanner;

/**
 * io_bool
 */
public class io_bool {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter bool :");

        boolean x = sc.hasNextBoolean();

        System.out.println("value is : "+x);
        sc.close();
    }
}