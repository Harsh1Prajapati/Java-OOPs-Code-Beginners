import java.util.Scanner;

public class NeonAmstrongNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();

        if (isNeon(num)) {
            System.out.println(num + " is a Neon number.");
        } else if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is neither a Neon nor an Armstrong number.");
        }
    }

    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;

        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }

        return sum == num;
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int result = 0;
        int n = 0;

        while (originalNum != 0) {
            originalNum /= 10;
            ++n;
        }

        originalNum = num;

        while (originalNum != 0) {
            int remainder = originalNum % 10;
            result += Math.pow(remainder, n);
            originalNum /= 10;
        }

        return result == num;
    }
}
