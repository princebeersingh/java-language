package oops.inheritemce;
/**
 * hierarchical_inherit
 */

class Animal{
    String name;
    public Animal(String name)
    {
        this.name = name;
    }
    public void about()
    {
        System.out.println(name + " is my pet.");
    }
}
class Dog extends Animal{
    public Dog(String name)
    {
        super(name);
    }
    public void bark()
    {
        System.out.println(name + " is barking.");
    }
}
class Cat extends Animal{
    public Cat(String name)
    {
        super(name);
    }
    public void sleep()
    {
        System.out.println(name + " is sleeping");
    }
}

public class hierarchical_inherit {

    public static void main(String[] args) {
        Dog d = new Dog("buddy");
        d.about();
        d.bark();

        Cat c = new Cat("julie");
        c.about();
        c.sleep();
    }
}