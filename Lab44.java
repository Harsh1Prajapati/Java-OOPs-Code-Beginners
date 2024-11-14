import java.util.*;

class MenuItem {
    String foodItem;
    int prepTime;
    int calories;

    // Constructor
    MenuItem(String foodItem, int prepTime, int calories) {
        this.foodItem = foodItem;
        this.prepTime = prepTime;
        this.calories = calories;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<MenuItem> menu = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter details for menu item " + i + ":");
            System.out.println("Enter food item:");
            String foodItem = scanner.nextLine();
            System.out.println("Enter preparation time (in minutes):");
            int prepTime = scanner.nextInt();
            System.out.println("Enter calories:");
            int calories = scanner.nextInt();
            scanner.nextLine();  // consume newline left-over
            menu.add(new MenuItem(foodItem, prepTime, calories));
        }

        // Display the menu card
        System.out.println(String.format("%-20s %-20s %-20s", "Food Item", "Preparation Time", "Calories"));
        for (MenuItem item : menu) {
            System.out.println(String.format("%-20s %-20d %-20d", item.foodItem, item.prepTime, item.calories));
        }
    }
}
