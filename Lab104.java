import java.util.ArrayList;
import java.util.Scanner;

public class Lab104 {
    private ArrayList<String> list;

    public Lab104() {
        list = new ArrayList<>();
    }

    public void insert(String item) {
        list.add(item);
    }

    public void delete(String item) {
        list.remove(item);
    }

    public boolean checkItem(String item) {
        return list.contains(item);
    }

    public void display() {
        System.out.println("Shopping List: " + list);
    }

    public static void main(String[] args) {
        Lab104 shoppingList = new Lab104();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command:\n1. Insert\n2. Delete\n3. Check\n4. Display\n5. Exit");
            int command = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (command == 5) {
                break;
            } else if (command == 1) {
                System.out.println("Enter item to insert:");
                String item = scanner.nextLine();
                shoppingList.insert(item);
            } else if (command == 2) {
                System.out.println("Enter item to delete:");
                String item = scanner.nextLine();
                shoppingList.delete(item);
            } else if (command == 3) {
                System.out.println("Enter item to check:");
                String item = scanner.nextLine();
                System.out.println("Contains " + item + "? " + shoppingList.checkItem(item));
            } else if (command == 4) {
                shoppingList.display();
            } else {
                System.out.println("Invalid command. Please try again.");
            }
        }

        scanner.close();
    }
}
