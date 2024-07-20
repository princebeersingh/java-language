package basic_input_output;
import java.util.Scanner;

/**
 * io_float
 */
public class io_float {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");

        float num = sc.nextFloat();

        System.out.println("number is : "+ num);
        sc.close();
    }
}