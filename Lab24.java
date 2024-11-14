import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in kg:");
        double weight = scanner.nextDouble();
        System.out.println("Enter your height in meters:");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);
        System.out.printf("Your BMI is %.2f.\n", bmi);

        if (bmi < 15) {
            System.out.println("You are in the starvation category.");
        } else if (bmi < 17.5) {
            System.out.println("You are in the anorexic category.");
        } else if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi < 25) {
            System.out.println("You have an ideal BMI.");
        } else if (bmi < 30) {
            System.out.println("You are overweight.");
        } else if (bmi < 40) {
            System.out.println("You are obese.");
        } else {
            System.out.println("You are morbidly obese.");
        }
    }
}
