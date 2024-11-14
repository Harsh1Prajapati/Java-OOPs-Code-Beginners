import java.util.*;

class Voter {
    String name;
    String gender;
    int age;
    String panId;
    String aadharId;

    public Voter(String name, String gender, int age, String panId, String aadharId) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.panId = panId;
        this.aadharId = aadharId;
    }
}

class VoterManager {
    List<Voter> voters = new ArrayList<>();
    int maleCount = 0;
    int femaleCount = 0;

    public void addVoter(String name, String gender, int age, String panId, String aadharId) {
        if (age >= 18) { // Check if voter is eligible
            voters.add(new Voter(name, gender, age, panId, aadharId));
            if (gender.equalsIgnoreCase("male")) {
                maleCount++;
            } else if (gender.equalsIgnoreCase("female")) {
                femaleCount++;
            }
        }
    }

    public void displayVoters() {
        for (Voter v : voters) {
            System.out.println("Name: " + v.name + ", Gender: " + v.gender + ", Age: " + v.age + ", PAN ID: " + v.panId + ", Aadhar ID: " + v.aadharId);
        }
        System.out.println("Percentage of Male Voters: " + (100.0 * maleCount / voters.size()) + "%");
        System.out.println("Percentage of Female Voters: " + (100.0 * femaleCount / voters.size()) + "%");
    }
}

public class VoteManagers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VoterManager manager = new VoterManager();

        System.out.println("Enter the number of voters:");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over

        for (int i = 0; i < n; i++) {
            System.out.println("Enter name for voter " + (i + 1) + ":");
            String name = scanner.nextLine();

            System.out.println("Enter gender for voter " + (i + 1) + ":");
            String gender = scanner.nextLine();

            System.out.println("Enter age for voter " + (i + 1) + ":");
            int age = scanner.nextInt();
            scanner.nextLine(); // consume newline left-over

            System.out.println("Enter PAN ID for voter " + (i + 1) + ":");
            String panId = scanner.nextLine();

            System.out.println("Enter Aadhar ID for voter " + (i + 1) + ":");
            String aadharId = scanner.nextLine();

            manager.addVoter(name, gender, age, panId, aadharId);
        }

        System.out.println("\nVoter Details:");
        manager.displayVoters();

        scanner.close();
    }
}
