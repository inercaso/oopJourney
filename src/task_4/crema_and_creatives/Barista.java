package task_4.crema_and_creatives;

import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Barista {
    private final List<Coffee> orders = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println("***********************************************");
        System.out.println("  Welcome to Crema & Creatives - Where Coffee ");
        System.out.println("         Meets Your Imagination! ☕");
        System.out.println("***********************************************");

        while (true) {
            displayMenu();
            takeOrder();

            System.out.print("Would you like to order another coffee? (yes/no): ");
            String more = scanner.nextLine();
            if (more.equalsIgnoreCase("no")) {
                break;
            }
        }

        make();
        System.out.println("\n***********************************************");
        System.out.println("   Thank you for visiting Crema & Creatives!");
        System.out.println("  We hope your coffee is as creative as you! ☕");
        System.out.println("***********************************************");
    }

    private void displayMenu() {
        System.out.println("\n--- Today's Menu ---");
        System.out.println("1. CAPPUCCINO");
        System.out.println("2. PUMPKIN_SPICE_LATTE");
        System.out.println("3. AMERICANO");
        System.out.println("4. SYRUP_CAPPUCCINO");
    }

    private void takeOrder() {
        System.out.print("\nChoose your coffee (1-4): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        CoffeeType coffeeType = switch (choice) {
            case 1 -> CoffeeType.CAPPUCCINO;
            case 2 -> CoffeeType.PUMPKIN_SPICE_LATTE;
            case 3 -> CoffeeType.AMERICANO;
            case 4 -> CoffeeType.SYRUP_CAPPUCCINO;
            default -> throw new IllegalArgumentException("Invalid choice!");
        };

        // get specific properties
        Map<String, Object> properties = CoffeeInput.getProperties(scanner, coffeeType);

        addOrder(coffeeType, properties);
    }

    // preparing da coffee
    public void addOrder(CoffeeType coffeeType, Map<String, Object> properties) {
        Coffee coffee = switch (coffeeType) {
            case CAPPUCCINO -> new Cappuccino(
                    (Intensity) properties.get("intensity"),
                    (int) properties.get("milk")
            );
            case PUMPKIN_SPICE_LATTE -> new PumpkinSpiceLatte(
                    (Intensity) properties.get("intensity"),
                    (int) properties.get("milk"),
                    (int) properties.get("pumpkinSpice")
            );
            case AMERICANO -> new Americano(
                    (Intensity) properties.get("intensity"),
                    (int) properties.get("water")
            );
            case SYRUP_CAPPUCCINO -> new SyrupCappuccino(
                    (Intensity) properties.get("intensity"),
                    (int) properties.get("milk"),
                    (SyrupType) properties.get("syrup")
            );
        };
        orders.add(coffee);
        System.out.println(coffee.getName() + " has been added to your orders!");
    }

    public void make() {
        System.out.println("\n--- Barista is making your coffees! ---");
        for (Coffee coffee : orders) {
            coffee.makeCoffee();
            System.out.println();
        }
    }
}
