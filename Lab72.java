// Base class
class Base {
    // Base class constructor
    Base() {
        System.out.println("Base class constructor called");
    }

    // Overloaded Base class constructor
    Base(String msg) {
        System.out.println("Base class overloaded constructor called with message: " + msg);
    }

    // Method to be overridden
    void display() {
        System.out.println("Base class display method");
    }
}

// Derived class
class Derived extends Base {
    // Derived class constructor
    Derived() {
        // Implicit call to super() happens here
        System.out.println("Derived class constructor called");
    }

    // Overloaded Derived class constructor
    Derived(String msg) {
        super(msg); // Calling Base class overloaded constructor
        System.out.println("Derived class overloaded constructor called");
    }

    // Overriding display() method
    @Override
    void display() {
        System.out.println("Derived class display method");
    }
}

public class Lab72 {
    public static void main(String[] args) {
        // Creating object of derived class (This will call the constructors)
        Derived obj1 = new Derived();
        obj1.display(); // This calls the overridden method in Derived class

        // Creating object of derived class with argument (This will call the overloaded constructors)
        Derived obj2 = new Derived("Hello");
        obj2.display(); // This calls the overridden method in Derived class
    }
}
