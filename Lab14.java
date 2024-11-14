import java.util.Scanner;
public class MarksCalculator
{
public static void main(String args[])
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter marks in Physics:");
double physicsMarks = scanner.nextDouble();
System.out.print("Enter marks in Chemistry:");
double chemistryMarks = scanner.nextDouble();
System.out.print("Enter marks in Maths:");
double mathsMarks = scanner.nextDouble();
System.out.print("Enter marks in Biology:");
double biologyMarks = scanner.nextDouble();

double maxMarks = 100.0;
double pcmbAverage = (physicsMarks + chemistryMarks + mathsMarks + biologyMarks)/4;
double pcmAverage = (physicsMarks + chemistryMarks + mathsMarks)/3;
double pcbAverage = (physicsMarks + chemistryMarks + biologyMarks)/3;

System.out.println("Average marks in PCMB:"+ pcmbAverage);
System.out.println("Average marks in PCM:"+ pcmAverage);
System.out.println("Average marks in PCB:"+ pcbAverage);
scanner.close();
}
}