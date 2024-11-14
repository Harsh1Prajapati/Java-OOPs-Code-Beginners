import java.util.Scanner;

public class Exponent
{
	public static void main(String args[])
	{
		int n,i,j;
		long fact;fact=1;
		double p,t,s;s=1.0;
		float x;

		Scanner in1 = new Scanner(System.in);

		System.out.print("\n\n\t Pl. Enter Total terms to Generate:");
		n = in1.nextInt();
		System.out.print("\n\n\t Pl. Enter Value of x:");
		x = in1.nextFloat();
		
		for(i=1;i<=n;i++)
		{
			p = Math.pow(x,i);
			for(j=1;j<=i;j++)
			{
				fact=fact*j;
			}
				t=p/fact;
				s=s+t;
		}
		
		System.out.print("\n\n\t Exponential Series: " +s);
	}
}