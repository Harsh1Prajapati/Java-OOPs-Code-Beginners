import java.util.Scanner;

public class MeritStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int n = scanner.nextInt();

        int[][] students = new int[n][2];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter roll number for student " + (i + 1) + ":");
            students[i][0] = scanner.nextInt();

            System.out.println("Enter marks for student " + (i + 1) + ":");
            students[i][1] = scanner.nextInt();
        }

        // Sort students array in descending order of marks
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (students[i][1] < students[j][1]) {
                    int[] temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        // Display the merit list
        System.out.println("Merit List:");
        for (int i = 0; i < n; i++) {
            System.out.println("Roll No: " + students[i][0] + ", Marks: " + students[i][1]);
        }

        scanner.close();
    }
}
