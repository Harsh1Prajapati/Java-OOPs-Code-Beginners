public class DistanceCalculator
{
public static void main (String args[])
{
int length = 100;
int width = 75;
int roundsPerDay = 12;
int oneRoundDistance = 2*(length+width);
int distanceInWeek = oneRoundDistance*roundsPerDay*7;
int distanceInMonth = distanceInWeek*4;
int distanceInYear = distanceInMonth*12;
System.out.println("Distance traveled in 1 week:"+distanceInWeek+" meters");
System.out.println("Distance traveled in 1 month:"+distanceInMonth+" meters");
System.out.println("Distance traveled in 1 year:"+distanceInYear+" meters");
}
}