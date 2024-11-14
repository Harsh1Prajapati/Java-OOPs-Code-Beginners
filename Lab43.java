import java.util.Scanner;

class Complex {
    double real;
    double imag;

    // Constructor
    Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Method to add two Complex numbers
    Complex add(Complex b) {
        return new Complex(this.real + b.real, this.imag + b.imag);
    }

    // Method to subtract two Complex numbers
    Complex subtract(Complex b) {
        return new Complex(this.real - b.real, this.imag - b.imag);
    }

    // Method to display a Complex number
    void display() {
        System.out.println(this.real + " + " + this.imag + "i");
    }
}

public class ComplexNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter real and imaginary parts of the first complex number:");
        double real1 = scanner.nextDouble();
        double imag1 = scanner.nextDouble();

        System.out.println("Enter real and imaginary parts of the second complex number:");
        double real2 = scanner.nextDouble();
        double imag2 = scanner.nextDouble();

        Complex c1 = new Complex(real1, imag1);
        Complex c2 = new Complex(real2, imag2);

        Complex sum = c1.add(c2);
        Complex difference = c1.subtract(c2);

        System.out.println("Sum:");
        sum.display();

        System.out.println("Difference:");
        difference.display();
    }
}
