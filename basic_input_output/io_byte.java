package basic_input_output;
import java.util.Scanner;

/**
 * io_byte
 */
public class io_byte {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner( System.in );

        System.out.println("Enter byte value :");

        byte x = scanner.nextByte();

        System.out.println("byte value is "+x);
        scanner.close();
    }
}