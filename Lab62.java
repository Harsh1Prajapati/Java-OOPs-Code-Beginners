import java.util.*;

class Employee {
    String name;
    int ID;

    Employee(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }
}

class Salary extends Employee {
    double grossSalary;
    String panCardNumber;

    Salary(String name, int ID, double grossSalary, String panCardNumber) {
        super(name, ID);
        this.grossSalary = grossSalary;
        this.panCardNumber = panCardNumber;
    }

    double calculateIncomeTax() {
        // Placeholder income tax calculation
        return grossSalary * 0.3;
    }
}

class Personal extends Salary {
    String aadharNo;
    int age;
    int experience;
    String department;

    Personal(String name, int ID, double grossSalary, String panCardNumber, String aadharNo, int age, int experience, String department) {
        super(name, ID, grossSalary, panCardNumber);
        this.aadharNo = aadharNo;
        this.age = age;
        this.experience = experience;
        this.department = department;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("PAN Card Number: " + panCardNumber);
        System.out.println("Aadhar Number: " + aadharNo);
        System.out.println("Age: " + age);
        System.out.println("Experience: " + experience);
        System.out.println("Department: " + department);
        System.out.println("Income Tax: " + calculateIncomeTax());
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Personal> employees = new ArrayList<>();

        System.out.println("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("ID: ");
            int ID = scanner.nextInt();
            System.out.println("Gross Salary: ");
            double grossSalary = scanner.nextDouble();
            System.out.println("PAN Card Number: ");
            String panCardNumber = scanner.next();
            System.out.println("Aadhar Number: ");
            String aadharNo = scanner.next();
            System.out.println("Age: ");
            int age = scanner.nextInt();
            System.out.println("Experience: ");
            int experience = scanner.nextInt();
            scanner.nextLine(); // consume newline left-over
            System.out.println("Department: ");
            String department = scanner.nextLine();

            employees.add(new Personal(name, ID, grossSalary, panCardNumber, aadharNo, age, experience, department));
        }

        // Display all records
        for (Personal employee : employees) {
            employee.display();
            System.out.println();
        }
    }
}
