import java.util.Scanner;

class Decimal {
 public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter an 8 bit Binary number:");
	String binary = sc.nextLine();
	int decimal = Integer.parseInt(binary,2);
	System.out.println("Decimal equivalent:"+ decimal);
	
	int countOnes = 0, countZeros = 0;
	for (char c : binary.toCharArray()) {
		if (c == '1') {
			countOnes++;
		} else if (c == '0') {
			countZeros++;
		}
	}
	
	System.out.println("Number of 1's: " + countOnes);
	System.out.println("Number of 0's: " + countZeros);
	}
}