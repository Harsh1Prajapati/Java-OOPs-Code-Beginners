import java.time.LocalTime;
import java.time.Duration;
import java.util.Scanner;

public class FlightTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter take-off time (HH MM SS):");
        LocalTime takeOffTime = LocalTime.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        System.out.println("Enter landing time (HH MM SS):");
        LocalTime landingTime = LocalTime.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        Duration flightDuration = Duration.between(takeOffTime, landingTime);

        long hours = flightDuration.toHours();
        long minutes = flightDuration.toMinutes() % 60;
        long seconds = flightDuration.getSeconds() % 60;

        System.out.printf("Total flight time: %02d:%02d:%02d\n", hours, minutes, seconds);
    }
}
