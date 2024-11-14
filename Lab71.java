import java.util.*;

// Superclass Employee
class Employee {
    String name;
    int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
}

// Subclass Manager
class Manager extends Employee {
    int numberOfProjectsManaged;
    int numberOfTeamsManaged;
    int experience;

    public Manager(String name, int employeeId, int numberOfProjectsManaged, int numberOfTeamsManaged, int experience) {
        super(name, employeeId);
        this.numberOfProjectsManaged = numberOfProjectsManaged;
        this.numberOfTeamsManaged = numberOfTeamsManaged;
        this.experience = experience;
    }
}

// Subclass Developer
class Developer extends Employee {
    String projectDetails;
    String platform;
    int numberOfProjectsCompleted;
    int numberOfProjectsGained;

    public Developer(String name, int employeeId, String projectDetails, String platform, int numberOfProjectsCompleted, int numberOfProjectsGained) {
        super(name, employeeId);
        this.projectDetails = projectDetails;
        this.platform = platform;
        this.numberOfProjectsCompleted = numberOfProjectsCompleted;
        this.numberOfProjectsGained = numberOfProjectsGained;
    }
}

// Subclass Tester
class Tester extends Employee {
    String projectDetails;
    String platform;
    int numberOfProjectsOngoing;
    int numberOfProjectsCompared;

    public Tester(String name, int employeeId, String projectDetails, String platform, int numberOfProjectsOngoing, int numberOfProjectsCompared) {
        super(name, employeeId);
        this.projectDetails = projectDetails;
        this.platform = platform;
        this.numberOfProjectsOngoing = numberOfProjectsOngoing;
        this.numberOfProjectsCompared = numberOfProjectsCompared;
    }
}

// Main class
public class ProjectManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the details of the manager:");
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Employee ID:");
        int employeeId = scanner.nextInt();
        System.out.println("Number of Projects Managed:");
        int numberOfProjectsManaged = scanner.nextInt();
        System.out.println("Number of Teams Managed:");
        int numberOfTeamsManaged = scanner.nextInt();
        System.out.println("Experience:");
        int experience = scanner.nextInt();
        Manager manager = new Manager(name, employeeId, numberOfProjectsManaged, numberOfTeamsManaged, experience);

        scanner.nextLine(); // consume newline left-over

        System.out.println("\nEnter the details of the developer:");
        System.out.println("Name:");
        name = scanner.nextLine();
        System.out.println("Employee ID:");
        employeeId = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over
        System.out.println("Project Details:");
        String projectDetails = scanner.nextLine();
        System.out.println("Platform:");
        String platform = scanner.nextLine();
        System.out.println("Number of Projects Completed:");
        int numberOfProjectsCompleted = scanner.nextInt();
        System.out.println("Number of Projects Gained:");
        int numberOfProjectsGained = scanner.nextInt();
        Developer developer = new Developer(name, employeeId, projectDetails, platform, numberOfProjectsCompleted, numberOfProjectsGained);

        scanner.nextLine(); // consume newline left-over

        System.out.println("\nEnter the details of the tester:");
        System.out.println("Name:");
        name = scanner.nextLine();
        System.out.println("Employee ID:");
        employeeId = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over
        System.out.println("Project Details:");
        projectDetails = scanner.nextLine();
        System.out.println("Platform:");
        platform = scanner.nextLine();
        System.out.println("Number of Projects Ongoing:");
        int numberOfProjectsOngoing = scanner.nextInt();
        System.out.println("Number of Projects Compared:");
        int numberOfProjectsCompared = scanner.nextInt();
        Tester tester = new Tester(name, employeeId, projectDetails, platform, numberOfProjectsOngoing, numberOfProjectsCompared);

        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Employee ID: " + manager.employeeId);
        System.out.println("Number of Projects Managed: " + manager.numberOfProjectsManaged);
        System.out.println("Number of Teams Managed: " + manager.numberOfTeamsManaged);
        System.out.println("Experience: " + manager.experience + " years");

        System.out.println("\nDeveloper Details:");
        System.out.println("Name: " + developer.name);
        System.out.println("Employee ID: " + developer.employeeId);
        System.out.println("Project Details: " + developer.projectDetails);
        System.out.println("Platform: " + developer.platform);
        System.out.println("Number of Projects Completed: " + developer.numberOfProjectsCompleted);
        System.out.println("Number of Projects Gained: " + developer.numberOfProjectsGained);

        System.out.println("\nTester Details:");
        System.out.println("Name: " + tester.name);
        System.out.println("Employee ID: " + tester.employeeId);
        System.out.println("Project Details: " + tester.projectDetails);
        System.out.println("Platform: " + tester.platform);
        System.out.println("Number of Projects Ongoing: " + tester.numberOfProjectsOngoing);
        System.out.println("Number of Projects Compared: " + tester.numberOfProjectsCompared);
    }
}
