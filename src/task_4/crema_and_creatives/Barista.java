package task_4.crema_and_creatives;

import java.util.Scanner;

public class Barista {
    private final Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println("***********************************************");
        System.out.println("  Welcome to Crema & Creatives - Where Coffee ");
        System.out.println("         Meets Your Imagination! ☕");
        System.out.println("***********************************************");

        while (true) {
            displayMenu();
            makeOrder();

            System.out.print("Would you like to order another coffee? (yes/no): ");
            String more = scanner.nextLine();
            if (more.equalsIgnoreCase("no")) {
                break;
            }
        }

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

    private void makeOrder() {
        System.out.print("\nWhat coffee would you like to order today? (1-4): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        Intensity intensity = getIntensity();

        switch (choice) {
            case 1 -> {
                System.out.print("How much milk would you like in your cappuccino? (in mls): ");
                int milk = scanner.nextInt();
                scanner.nextLine();
                new Cappuccino(intensity, milk).makeCappuccino();
            }
            case 2 -> {
                System.out.print("How much milk should we add to your latte? (in mls): ");
                int milk = scanner.nextInt();
                scanner.nextLine();
                System.out.print("How much pumpkin spice would you like? (in mgs): ");
                int pumpkinSpice = scanner.nextInt();
                scanner.nextLine();
                new PumpkinSpiceLatte(intensity, milk, pumpkinSpice).makePumpkinSpiceLatte();
            }
            case 3 -> {
                System.out.print("How much water would you like in your americano? (in mls): ");
                int water = scanner.nextInt();
                scanner.nextLine();
                new Americano(intensity, water).makeAmericano();
            }
            case 4 -> {
                System.out.print("How much milk would you like in your cappuccino? (in mls): ");
                int milk = scanner.nextInt();
                scanner.nextLine();
                SyrupType syrup = getSyrupType();
                new SyrupCappuccino(intensity, milk, syrup).makeSyrupCappuccino();
            }
            default -> System.out.println("Invalid choice! Please try again.");
        }
    }

    private Intensity getIntensity() {
        System.out.println("\nWhat level of intensity do you prefer for your coffee?");
        System.out.println("1. LIGHT");
        System.out.println("2. NORMAL");
        System.out.println("3. STRONG");
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
        System.out.println("\nWhat syrup would you like in your cappuccino?");
        System.out.println("1. MACADAMIA");
        System.out.println("2. VANILLA");
        System.out.println("3. COCONUT");
        System.out.println("4. CARAMEL");
        System.out.println("5. CHOCOLATE");
        System.out.println("6. POPCORN");
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
            default -> throw new IllegalArgumentException("Invalid choice for syrup! Please try again.");
        };
    }
}