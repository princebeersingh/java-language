package conditionals;
/**
 * if_else_ledder
 */
public class if_else_ledder {

    public static void main(String[] args) {
        
        String s = "hi", s1 = "hi";
        String s2 = new String("hi");

        if(s==s2)
        {
            System.out.println("hi man");
        }
        else if(s==s1)
        {
            System.out.println("koi bat ni");
        }
        else{
            System.out.println("not equal");
        }
    }
}