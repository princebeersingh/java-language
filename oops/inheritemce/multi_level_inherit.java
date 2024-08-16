package oops.inheritemce;
/**
 * multi_level_inherit
 */
class Animal{
    String name;
    public Animal (String name){
        this.name = name;
    }
    public  void  ispet()
    {
        System.out.println(name + " is my pet.");
    }
}
class Dog extends Animal{
   public Dog(String name)
    {
        super(name);
    }
    public  void bark()
    {
        System.out.println(name + " barks loudly.");
    }
}
class Breed extends Dog{
   public Breed(String name)
    {
        super(name);
    }
    public  void isBreed()
    {
        System.out.println(name + " is a german shephard.");
    }
}
public class multi_level_inherit {
    public static void main(String[] args) {
        Breed d = new Breed("Jack");

        d.ispet();   
        d.bark();  
        d.isBreed(); 
    }
    
}