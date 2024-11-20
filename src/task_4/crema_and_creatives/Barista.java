package task_4.crema_and_creatives;

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

        make(); // prepare all orders
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
        System.out.print("\nWhat coffee would you like to order today? (1-4): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        CoffeeType coffeeType = switch (choice) {
            case 1 -> CoffeeType.CAPPUCCINO;
            case 2 -> CoffeeType.PUMPKIN_SPICE_LATTE;
            case 3 -> CoffeeType.AMERICANO;
            case 4 -> CoffeeType.SYRUP_CAPPUCCINO;
            default -> throw new IllegalArgumentException("Invalid choice! Please pick a coffee from the menu.");
        };

        collectCoffeeProperties(coffeeType);
    }

    private void collectCoffeeProperties(CoffeeType coffeeType) {
        System.out.println("\n--- Customizing Your Coffee ---");

        Intensity intensity = getIntensity(); // chooses intensity
        switch (coffeeType) {
            case CAPPUCCINO -> {
                System.out.print("How much milk would you like in your cappuccino? (in mls): ");
                int milk = scanner.nextInt();
                scanner.nextLine();
                orders.add(new Cappuccino(intensity, milk));
            }
            case PUMPKIN_SPICE_LATTE -> {
                System.out.print("How much milk should we add to your latte? (in mls): ");
                int milk = scanner.nextInt();
                scanner.nextLine();
                System.out.print("How much pumpkin spice would you like? (in mgs): ");
                int pumpkinSpice = scanner.nextInt();
                scanner.nextLine();
                orders.add(new PumpkinSpiceLatte(intensity, milk, pumpkinSpice));
            }
            case AMERICANO -> {
                System.out.print("How much water would you like in your americano? (in mls): ");
                int water = scanner.nextInt();
                scanner.nextLine();
                orders.add(new Americano(intensity, water));
            }
            case SYRUP_CAPPUCCINO -> {
                System.out.print("How much milk would you like in your cappuccino? (in mls): ");
                int milk = scanner.nextInt();
                scanner.nextLine();
                SyrupType syrup = getSyrupType(); // chooses syrup type
                orders.add(new SyrupCappuccino(intensity, milk, syrup));
            }
        }
    }

    private Intensity getIntensity() {
        System.out.println("\nWhat level of intensity do you prefer for your coffee? ><");
        System.out.println("1. LIGHT (A gentle, mellow taste)");
        System.out.println("2. NORMAL (Balanced and rich)");
        System.out.println("3. STRONG (Bold and powerful)");
        System.out.print("Enter your choice (1-3): ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        return switch (choice) {
            case 1 -> Intensity.LIGHT;
            case 2 -> Intensity.NORMAL;
            case 3 -> Intensity.STRONG;
            default -> throw new IllegalArgumentException("Invalid choice for intensity! Please try again.");
        };
    }

    private SyrupType getSyrupType() {
        System.out.println("\nWhat syrup would you like in your cappuccino? ><");
        System.out.println("1. MACADAMIA (Nutty and delightful)");
        System.out.println("2. VANILLA (Sweet and classic)");
        System.out.println("3. COCONUT (Tropical and creamy)");
        System.out.println("4. CARAMEL (Rich and buttery)");
        System.out.println("5. CHOCOLATE (Decadent and smooth)");
        System.out.println("6. POPCORN (Salty and unique)");
        System.out.print("Enter your choice (1-6): ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        return switch (choice) {
            case 1 -> SyrupType.MACADAMIA;
            case 2 -> SyrupType.VANILLA;
            case 3 -> SyrupType.COCONUT;
            case 4 -> SyrupType.CARAMEL;
            case 5 -> SyrupType.CHOCOLATE;
            case 6 -> SyrupType.POPCORN;
            default -> throw new IllegalArgumentException("Invalid choice for syrup type! Please try again.");
        };
    }

    public void make() {
        System.out.println("\n--- Barista is making your coffees! ---");
        for (Coffee coffee : orders) {
            coffee.makeCoffee();
            System.out.println();
        }
    }
}
