package basic_input_output;
import java.util.Scanner;

/**
 * io_string
 */
public class io_string {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        System.out.println("Enter name ");

        String name = sc.nextLine();

        System.out.println("name is "+name);
        sc.close();
    }
}