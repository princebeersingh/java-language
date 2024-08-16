package oops.polymorphism;
/**
 * mthd_ovrrd_runtm
 */
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class mthd_ovrrd_runtm {

    public static void main(String[] args) {
        Animal myAnimal = new Animal();  
        Animal myDog = new Dog();        
        Animal myCat = new Cat();       
        
        myAnimal.sound(); 
        myDog.sound();     
        myCat.sound();   
    }
}