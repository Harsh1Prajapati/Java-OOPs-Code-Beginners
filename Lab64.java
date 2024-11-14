import java.util.*;
import java.time.*;

class Student {
    String name;
    int rollNo;
    String purpose;
    LocalTime entryTime;
    LocalTime exitTime;

    Student(String name, int rollNo, String purpose, LocalTime entryTime, LocalTime exitTime) {
        this.name = name;
        this.rollNo = rollNo;
        this.purpose = purpose;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
    }

    Duration getTimeSpent() {
        return Duration.between(entryTime, exitTime);
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Purpose: " + purpose);
        System.out.println("Entry Time: " + entryTime);
        System.out.println("Exit Time: " + exitTime);
        System.out.println("Time Spent in Lab: " + getTimeSpent().toHours() + " hours and " + getTimeSpent().toMinutesPart() + " minutes");
    }
}

public class LabApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        System.out.println("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Roll No: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine(); // consume newline left-over
            System.out.println("Purpose: ");
            String purpose = scanner.nextLine();
            System.out.println("Entry Time (HH:MM format): ");
            LocalTime entryTime = LocalTime.parse(scanner.nextLine());
            System.out.println("Exit Time (HH:MM format): ");
            LocalTime exitTime = LocalTime.parse(scanner.nextLine());

            students.add(new Student(name, rollNo, purpose, entryTime, exitTime));
        }

        // Display all records
        for (Student student : students) {
            student.display();
            System.out.println();
        }
    }
}
