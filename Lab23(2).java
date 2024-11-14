import java.util.Scanner;

public class Cosx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value for x:");
        double x = scanner.nextDouble();
        System.out.println("Enter the number of terms:");
        int terms = scanner.nextInt();

        double sum = 0.0;
        for (int i = 0; i < terms; i++) {
            sum += Math.pow(-1, i) * Math.pow(x, 2 * i) / factorial(2 * i);
        }

        System.out.println("The Taylor series approximation for cos(" + x + ") is " + sum);
    }

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

