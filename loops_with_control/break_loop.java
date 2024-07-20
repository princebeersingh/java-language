package loops_with_control;
/**
 * break_loop
 */
public class break_loop {

    
    public static void main(String[] args) {
        for(int x = 1; x <= 10; x++)
        {
            if ( x == 5) break;
            System.out.println(x);
        }
    }
}