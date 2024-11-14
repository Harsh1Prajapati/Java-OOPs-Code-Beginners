import java.util.*;

class Equipment {
    String name;
    int id;
    String unitSize;
    int totalNumber;
    double price;
    String utilization;

    Equipment(String name, int id, String unitSize, int totalNumber, double price, String utilization) {
        this.name = name;
        this.id = id;
        this.unitSize = unitSize;
        this.totalNumber = totalNumber;
        this.price = price;
        this.utilization = utilization;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Unit Size: " + unitSize);
        System.out.println("Total Number: " + totalNumber);
        System.out.println("Price: " + price);
        System.out.println("Utilization: " + utilization);
    }
}

class Library {
    List<Equipment> equipments = new ArrayList<>();

    void addEquipment(Equipment equipment) {
        equipments.add(equipment);
    }

    void displayAllEquipments() {
        for (Equipment equipment : equipments) {
            equipment.display();
            System.out.println("--------------------");
        }
    }

    void displayEquipmentById(int id) {
        for (Equipment equipment : equipments) {
            if (equipment.id == id) {
                equipment.display();
                return;
            }
        }
        System.out.println("No equipment found with ID: " + id);
    }

    void displayTotalCost() {
        double totalCost = 0;
        for (Equipment equipment : equipments) {
            totalCost += equipment.price * equipment.totalNumber;
        }
        System.out.println("Total cost of all equipment: " + totalCost);
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();

        // Add some equipment
        library.addEquipment(new Equipment("Microscope", 1, "Small", 10, 500.0, "High"));
        library.addEquipment(new Equipment("Telescope", 2, "Large", 5, 1000.0, "Medium"));
        library.addEquipment(new Equipment("Computer", 3, "Medium", 20, 800.0, "High"));

        // Display all equipment
        library.displayAllEquipments();

        // Display equipment by ID
        library.displayEquipmentById(2);

        // Display total cost
        library.displayTotalCost();
    }
}
