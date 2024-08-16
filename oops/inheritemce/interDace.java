package oops.inheritemce;
/**
 * interDace
 */

interface Area {
    static final float pi = 3.14F;
    float area(int x ,int y);
}

class Circle implements Area {
    public float area( int x,int y)
    {
        return (pi*x*x);
    }
    
}
class Rectangle implements Area{
    public float area(int x,int y)
    {
        return x*y;
    }
}

public class interDace {

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r.area(3, 4));
        Circle c = new Circle();
        System.out.println(c.area(3,3));
    }
}