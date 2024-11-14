import java.util.*;

class Employee {
    String name;
    int age;
    String username;

    public Employee(String name, int age, String username) {
        this.name = name;
        this.age = age;
        this.username = username;
    }
}

class EmployeeManager {
    List<Employee> employees = new ArrayList<>();

    public void addEmployee(String name, int age, String username) {
        employees.add(new Employee(name, age, username));
    }

    public void displayEmployees() {
        for (Employee e : employees) {
            System.out.println("Name: " + e.name + ", Age: " + e.age + ", Username: " + e.username);
        }
    }
}

public class Employees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();

        System.out.println("Enter the number of employees:");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over

        for (int i = 0; i < n; i++) {
            System.out.println("Enter name for employee " + (i + 1) + ":");
            String name = scanner.nextLine();

            System.out.println("Enter age for employee " + (i + 1) + ":");
            int age = scanner.nextInt();
            scanner.nextLine(); // consume newline left-over

            String username;
            while (true) {
                System.out.println("Enter username for employee " + (i + 1) + ":");
                username = scanner.nextLine();

                if (username.length() >= 8 && username.matches("[a-zA-Z]*")) {
                    break;
                } else {
                    System.out.println("Username must be at least 8 characters long and can't contain digits or special characters. Please try again.");
                }
            }

            manager.addEmployee(name, age, username);
        }

        System.out.println("\nEmployee Details:");
        manager.displayEmployees();

        scanner.close();
    }
}
