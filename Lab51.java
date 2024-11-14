class Classroom {
    double length;
    double width;

    // Constructor for square classrooms
    Classroom(double side) {
        this.length = side;
        this.width = side;
    }

    // Constructor for rectangular classrooms
    Classroom(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    double calculateArea() {
        return length * width;
    }
}

public class Classrooms {
    public static void main(String[] args) {
        Classroom classroom1 = new Classroom(10); // Square classroom with side 10
        Classroom classroom2 = new Classroom(10, 20); // Rectangular classroom with length 10 and width 20
        Classroom classroom3 = new Classroom(15, 25); // Rectangular classroom with length 15 and width 25

        System.out.println("Area of Classroom 1: " + classroom1.calculateArea());
        System.out.println("Area of Classroom 2: " + classroom2.calculateArea());
        System.out.println("Area of Classroom 3: " + classroom3.calculateArea());
    }
}
