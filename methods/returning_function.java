package methods;
/**
 * returning_function
 */
public class returning_function {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        
        int a = 10 , b = 20;

        System.out.println("the sum is "+ add(a,b));
    }
}