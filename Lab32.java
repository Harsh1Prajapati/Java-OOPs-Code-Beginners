import java.util.Scanner;

class Binary {
public static void main(String args[])
{
 Scanner scanner = new Scanner(System.in);
 System.out.println("\nEnter a Positive Decimal Integer: ");
 int decimal=scanner.nextInt();
 String binary=Integer.toBinaryString(decimal);
 System.out.println("\nThe Binary Representaion is: "+binary);
}
}