package loops_with_control;
/**
 * continue_loop
 */
public class continue_loop {

    
    public static void main(String[] args) {
        for(int x = 1; x <= 10; x++)
        {
            if ( x == 6) continue;
            System.out.println(x);
        }
    }
}