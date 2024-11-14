import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount in Indian Rupees:");
        double rupees = scanner.nextDouble();

        System.out.println("Select the currency you want to convert to:");
        System.out.println("1. USA Dollar");
        System.out.println("2. Euro");
        System.out.println("3. Bhary Dinar");
        System.out.println("4. Saudi Dinar");
        System.out.println("5. Umani Dinar");
        int choice = scanner.nextInt();

        double conversionRate;
        String currency;
        switch (choice) {
            case 1:
                conversionRate = 0.013; // Conversion rate from INR to USD
                currency = "USA Dollar";
                break;
            case 2:
                conversionRate = 0.012; // Conversion rate from INR to Euro
                currency = "Euro";
                break;
            case 3:
                conversionRate = 0.0050; // Conversion rate from INR to Bhary Dinar
                currency = "Bhary Dinar";
                break;
            case 4:
                conversionRate = 0.049; // Conversion rate from INR to Saudi Dinar
                currency = "Saudi Dinar";
                break;
            case 5:
                conversionRate = 0.0050; // Conversion rate from INR to Umani Dinar
                currency = "Umani Dinar";
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        double convertedAmount = rupees * conversionRate;
        System.out.printf("The amount in %s is: %.2f\n", currency, convertedAmount);
    }
}
