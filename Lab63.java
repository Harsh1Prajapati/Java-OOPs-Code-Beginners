import java.util.*;

class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

class PCM extends Student {
    int marksInPhysics;
    int marksInChemistry;
    int marksInMaths;

    PCM(String name, int rollNo, int marksInPhysics, int marksInChemistry, int marksInMaths) {
        super(name, rollNo);
        this.marksInPhysics = marksInPhysics;
        this.marksInChemistry = marksInChemistry;
        this.marksInMaths = marksInMaths;
    }
}

class Results extends PCM {
    int totalInPCM;
    double averageInPCM;

    Results(String name, int rollNo, int marksInPhysics, int marksInChemistry, int marksInMaths) {
        super(name, rollNo, marksInPhysics, marksInChemistry, marksInMaths);
        this.totalInPCM = marksInPhysics + marksInChemistry + marksInMaths;
        this.averageInPCM = (double) totalInPCM / 3;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks in Physics: " + marksInPhysics);
        System.out.println("Marks in Chemistry: " + marksInChemistry);
        System.out.println("Marks in Maths: " + marksInMaths);
        System.out.println("Total in PCM: " + totalInPCM);
        System.out.println("Average in PCM: " + averageInPCM);
    }
}

public class StudentsPCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Results> students = new ArrayList<>();

        System.out.println("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Roll No: ");
            int rollNo = scanner.nextInt();
            System.out.println("Marks in Physics: ");
            int marksInPhysics = scanner.nextInt();
            System.out.println("Marks in Chemistry: ");
            int marksInChemistry = scanner.nextInt();
            System.out.println("Marks in Maths: ");
            int marksInMaths = scanner.nextInt();
            scanner.nextLine(); // consume newline left-over

            students.add(new Results(name, rollNo, marksInPhysics, marksInChemistry, marksInMaths));
        }

        // Display all records
        for (Results student : students) {
            student.display();
            System.out.println();
        }
    }
}
