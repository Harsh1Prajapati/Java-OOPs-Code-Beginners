import java.util.Scanner;
import mypackage.Fact;

class Lab94
{ 
	public static void main(String args[])
	{
	Scanner in1 = new Scanner(System.in);
	int n,r;
	long nf,rf,pf;
	Fact f = new Fact();
	System.out.print("\n\t Please Enter n : ");
	n = in1.nextInt();
	System.out.print("\n\t Please Enter r : ");
	r = in1.nextInt();
	nf = f.factorial(n);
	rf = f.factorial(n-r);
	pf = nf/rf;
	System.out.print("\n\t Permutation = " +pf);
	}
}