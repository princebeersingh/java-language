package inheritemce;
 class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}

 class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " is barking");
    }
}
 public class single_inheritence{
    public static void main(String[] args) {
        Dog d = new Dog("Jack");

        d.eat();    // Calling eat() method inherited from Animal
        d.sleep();  // Calling sleep() method inherited from Animal

        d.bark();   // Calling bark() method from Dog
    }
 }

