package oops.inheritemce;


interface InterfaceA {
    default void method() {
        System.out.println("Default method from InterfaceA");
    }
}

interface InterfaceB {
    default void method() {
        System.out.println("Default method from InterfaceB");
    }
}

class MyClass implements InterfaceA, InterfaceB {
    // @Override
    public void method() {
        // Resolving conflict by providing specific implementation
        System.out.println("Method implementation in MyClass");
    }
}

public class Main {
    public static void main(String[] args) {
        InterfaceA objA = new MyClass();
        objA.method();
        
        InterfaceB objB = new MyClass();
        objB.method();
        
        MyClass obj = new MyClass();
        obj.method();  // Calls the overridden method in MyClass
    }
}
