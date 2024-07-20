package basic_input_output;
import java.util.Scanner;

/**
 * io_integer
 */
public class io_integer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number : ");

        int num1=sc.nextInt();

        System.out.println("number is : "+num1);
        sc.close();
    }
}