package oops.polymorphism;
/**
 * mthd_ovrld_comtm
 */
public class mthd_ovrld_comtm {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
   
    public double add(double a, double b) {
        return a + b;
    }
    

    public String add(String a, String b) {
        return a + b;
    }
    public static void main(String[] args) {
        mthd_ovrld_comtm calc = new mthd_ovrld_comtm();
        
        System.out.println(calc.add(5, 10));      
        System.out.println(calc.add(5, 10, 15)); 
        System.out.println(calc.add(3.5, 2.5));      
        System.out.println(calc.add("Hello, ", "Java"));
    }
}