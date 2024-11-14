import java.util.Scanner;

// Custom exception class
class InvalidAgeException extends Exception {
    InvalidAgeException(String s) {
        super(s);
    }
}

// Employee class
class Employee {
    String name;
    String department;
    int age;
    int experience;

    // Employee class constructor
    Employee(String name, String department, int age, int experience) throws InvalidAgeException {
        if (age < 18 || age > 16) {
            throw new InvalidAgeException("Age must be between 16 and 18");
        }
        this.name = name;
        this.department = department;
        this.age = age;
        this.experience = experience;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Age: " + age);
        System.out.println("Experience: " + experience);
    }
}

public class Lab93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee name:");
        String name = scanner.nextLine();

        System.out.println("Enter employee department:");
        String department = scanner.nextLine();

        System.out.println("Enter employee age:");
        int age = scanner.nextInt();

        System.out.println("Enter employee experience:");
        int experience = scanner.nextInt();

        try {
            Employee emp = new Employee(name, department, age, experience);
            emp.display();
        } catch (InvalidAgeException ex) {
            System.out.println("Exception caught: " + ex.getMessage());
        }
    }
}
