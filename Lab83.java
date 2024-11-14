import java.util.Scanner;

// Define an abstract class 'Land'
abstract class Land {
    abstract double calculateArea();
}

// Define a class 'RectangularLand' that extends the abstract class 'Land'
class RectangularLand extends Land {
    double length;
    double width;

    // Constructor
    RectangularLand(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implement the 'calculateArea' method
    @Override
    double calculateArea() {
        return length * width;
    }
}

// Define a class 'CircularLand' that extends the abstract class 'Land'
class CircularLand extends Land {
    double radius;

    // Constructor
    CircularLand(double radius) {
        this.radius = radius;
    }

    // Implement the 'calculateArea' method
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Define a class 'TriangularLand' that extends the abstract class 'Land'
class TriangularLand extends Land {
    double base;
    double height;

    // Constructor
    TriangularLand(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Implement the 'calculateArea' method
    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

// Main class
public class Lab83 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the shape of the land (1: Rectangular, 2: Circular, 3: Triangular): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter length and width of the rectangular land: ");
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                Land rectangularLand = new RectangularLand(length, width);
                System.out.println("Area of rectangular land: " + rectangularLand.calculateArea());
                break;

            case 2:
                System.out.println("Enter radius of the circular land: ");
                double radius = scanner.nextDouble();
                Land circularLand = new CircularLand(radius);
                System.out.println("Area of circular land: " + circularLand.calculateArea());
                break;

            case 3:
                System.out.println("Enter base and height of the triangular land: ");
                double base = scanner.nextDouble();
                double height = scanner.nextDouble();
                Land triangularLand = new TriangularLand(base, height);
                System.out.println("Area of triangular land: " + triangularLand.calculateArea());
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close();
    }
}
