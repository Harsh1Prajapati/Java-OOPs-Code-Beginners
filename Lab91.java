import java.util.Scanner;

class Lab91
{
	public static void main(String args[])
	{
	Scanner in1 = new Scanner(System.in);
	int a,b,c; b = 0;a = 100;
	
	try
	{
	System.out.print("\n\t Please Enter Integer Data");
	b = in1.nextInt();
	System.out.print("\n\t Data Entered is " + b);
	c = a/b;
	System.out.print("\n\t c = " +c);
	}

	catch(ArithmeticException e)
	{
	System.out.print("\n\t Division by zero");
	}
	catch(Exception InputMismatchException)
	{
	System.out.print("\n\t Invaild Input");
	}
	
	System.out.print("\n\t Remaining code in Main( ) ");
	}
}