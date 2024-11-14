import java.util.Scanner;

// Define an interface 'Cost'
interface Cost {
    double calculateCost();
}

// Define an abstract class 'Land'
abstract class Land {
    abstract double calculateArea();
}

// Define a class 'RectangularLand' that extends the abstract class 'Land' and implements the 'Cost' interface
class RectangularLand extends Land implements Cost {
    double length;
    double width;
    double costPerUnitArea;

    // Constructor
    RectangularLand(double length, double width, double costPerUnitArea) {
        this.length = length;
        this.width = width;
        this.costPerUnitArea = costPerUnitArea;
    }

    // Implement the 'calculateArea' method
    @Override
    double calculateArea() {
        return length * width;
    }

    // Implement the 'calculateCost' method
    @Override
    public double calculateCost() {
        return calculateArea() * costPerUnitArea;
    }
}

// Define a class 'CircularLand' that extends the abstract class 'Land' and implements the 'Cost' interface
class CircularLand extends Land implements Cost {
    double radius;
    double costPerUnitArea;

    // Constructor
    CircularLand(double radius, double costPerUnitArea) {
        this.radius = radius;
        this.costPerUnitArea = costPerUnitArea;
    }

    // Implement the 'calculateArea' method
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implement the 'calculateCost' method
    @Override
    public double calculateCost() {
        return calculateArea() * costPerUnitArea;
    }
}

// Define a class 'TriangularLand' that extends the abstract class 'Land' and implements the 'Cost' interface
class TriangularLand extends Land implements Cost {
    double base;
    double height;
    double costPerUnitArea;

    // Constructor
    TriangularLand(double base, double height, double costPerUnitArea) {
        this.base = base;
        this.height = height;
        this.costPerUnitArea = costPerUnitArea;
    }

    // Implement the 'calculateArea' method
    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }

    // Implement the 'calculateCost' method
    @Override
    public double calculateCost() {
        return calculateArea() * costPerUnitArea;
    }
}

// Main class
public class Lab84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the shape of the land (1: Rectangular, 2: Circular, 3: Triangular): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter length, width and cost per unit area of the rectangular land: ");
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                double costPerUnitArea1 = scanner.nextDouble();
                RectangularLand rectangularLand = new RectangularLand(length, width, costPerUnitArea1);
                System.out.println("Area of rectangular land: " + rectangularLand.calculateArea());
                System.out.println("Cost of rectangular land: " + rectangularLand.calculateCost());
                break;

            case 2:
                System.out.println("Enter radius and cost per unit area of the circular land: ");
                double radius = scanner.nextDouble();
                double costPerUnitArea2 = scanner.nextDouble();
                CircularLand circularLand = new CircularLand(radius, costPerUnitArea2);
                System.out.println("Area of circular land: " + circularLand.calculateArea());
                System.out.println("Cost of circular land: " + circularLand.calculateCost());
                break;

            case 3:
                System.out.println("Enter base, height and cost per unit area of the triangular land: ");
                double base = scanner.nextDouble();
                double height = scanner.nextDouble();
                double costPerUnitArea3 = scanner.nextDouble();
                TriangularLand triangularLand = new TriangularLand(base, height, costPerUnitArea3);
                System.out.println("Area of triangular land: " + triangularLand.calculateArea());
                System.out.println("Cost of triangular land: " + triangularLand.calculateCost());
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close();
    }
}
