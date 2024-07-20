package conditionals;
/**
 * if _else_nested
 */
public class if_else_nested {

    public static void main(String[] args) {
        
        int a = 7 , b = 3, c = 1;
        if(a>b)
        {
            if(a>c){
                System.out.println("value of a is greater="+a);
            }
            else{
                System.out.println("value of c is greater = "+ c);
            }
        }
        else{
            if(b>c){
                System.out.println("value of b is greater = "+b);
            }
            else{
                System.out.println("value of c is greater = "+c);
            }
        }
    }
}