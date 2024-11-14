package mypackage;

public class Fact
{
	public long factorial(int n )
	{
	int i;
	long f;
	f = 1;
	for(i=1;i<=n;i++)
	{
		f = f * i;
	}
	return(f);
	}
}