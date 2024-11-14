public class MarksinMSE
{
public static void main(String args[])
{
int a,b,c;
a=Integer.parseInt(args[0]);
System.out.println("Entered Marks of Examination-1 in OOP: " +a);
b=Integer.parseInt(args[1]);
System.out.println("Entered Marks of Examination-2 in OOP: " +b);
c=Integer.parseInt(args[2]);
System.out.println("Entered Marks of Examination-3 in OOP: " +c);

if(a>c && b>c)
{ System.out.println("1st Highest Marks Obtained in Examination: "+a+" \n2nd Highest Marks Obtained in Examination: "+b);
}
if(b>a && c>a)
{ System.out.println("1st Highest Marks Obtained in Examination: "+b+" \n2nd Highest Marks Obtained in Examination: "+c);
}
if(c>b && a>b)
{ System.out.println("1st Highest Marks Obtained in Examination: "+a+" \n2nd Highest Marks Obtained in Examination: "+b);
}
if(a>20 && b>20 && c>20)
{ System.out.println("Maximum Marsk is 20 Invalid Input");
}
}
}