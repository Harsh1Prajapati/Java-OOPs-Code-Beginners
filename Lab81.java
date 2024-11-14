// Using final with variables
class FinalVariableDemo {
    final int MAX_VALUE = 99;
    void myMethod() { 
        System.out.println("MAX_VALUE: " + MAX_VALUE);
        // Uncommenting the following line would result in a compilation error
        // MAX_VALUE = 101; // Compilation Error: cannot assign a value to final variable MAX_VALUE
    } 
}

// Using final with methods
class XYZ {
    final void demo() {
        System.out.println("XYZ Class Method");
    }
}

class ABC extends XYZ {
    // Uncommenting the following method would result in a compilation error
    // void demo() { // Compilation Error: ABC cannot override final method from XYZ
    //     System.out.println("ABC Class Method");
    // }
}

// Using final with classes
final class FinalClass {
    void display() {
        System.out.println("FinalClass Method");
    }
}

// Uncommenting the following class would result in a compilation error
// class ExtendedClass extends FinalClass { // Compilation Error: cannot inherit from final FinalClass
//     // methods and fields
// }

public class Lab81 {
    public static void main(String[] args) {
        FinalVariableDemo varDemo = new FinalVariableDemo();
        varDemo.myMethod();

        ABC abc = new ABC();
        abc.demo();

        FinalClass finalClass = new FinalClass();
        finalClass.display();
    }
}
