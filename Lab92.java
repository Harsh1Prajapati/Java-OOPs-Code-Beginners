import java.util.Scanner;

public class Lab92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your PAN number:");
        String pan = scanner.nextLine();
        System.out.println("Encrypted PAN number: " + encryptPan(pan));
    }

    private static String encryptPan(String pan) {
        StringBuilder encryptedPan = new StringBuilder();
        for (char c : pan.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                c = (char) ((c - base + 4) % 26 + base);
            } else if (Character.isDigit(c)) {
                c = (char) ((c - '0' + 4) % 10 + '0');
            }
            encryptedPan.append(c);
        }
        return encryptedPan.toString();
    }
}
