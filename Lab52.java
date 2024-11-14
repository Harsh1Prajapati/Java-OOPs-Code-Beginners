class Geometry {
    // Method to calculate volume of a cuboid
    double volume(double length, double width, double height) {
        return length * width * height;
    }

    // Method to calculate volume of a cone
    double volume(double radius, double height) {
        return (Math.PI * Math.pow(radius, 2) * height) / 3;
    }

    // Method to calculate volume of a sphere
    double volume(double radius) {
        return (4/3) * Math.PI * Math.pow(radius, 3);
    }
}

public class Geometrys {
    public static void main(String[] args) {
        Geometry geometry = new Geometry();

        double cuboidVolume = geometry.volume(10, 20, 30);
        System.out.println("Volume of Cuboid: " + cuboidVolume);

        double coneVolume = geometry.volume(10, 20);
        System.out.println("Volume of Cone: " + coneVolume);

        double sphereVolume = geometry.volume(10);
        System.out.println("Volume of Sphere: " + sphereVolume);
    }
}
