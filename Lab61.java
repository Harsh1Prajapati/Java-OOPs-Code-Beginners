import java.util.Scanner;

public class Combination{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total number of items (n): ");
        int n = scanner.nextInt();
        System.out.println("Enter the number of items to choose (r): ");
        int r = scanner.nextInt();
        System.out.println("The value of " + n + "C" + r + " is " + nCr(n, r));
    }

    static int nCr(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }
}
