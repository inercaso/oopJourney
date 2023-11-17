package task_4.crema_and_creatives;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeInput {

    public static Map<String, Object> getProperties(Scanner scanner, CoffeeType coffeeType) {
        Map<String, Object> properties = new HashMap<>();

        // get the intensity
        System.out.print("How intense would you like your coffee? (LIGHT/NORMAL/STRONG): ");
        String intensityInput = scanner.nextLine().toUpperCase();
        Intensity intensity = Intensity.valueOf(intensityInput);
        properties.put("intensity", intensity);

        // get specific properties
        switch (coffeeType) {
            case CAPPUCCINO -> {
                System.out.print("How much milk would you like? (in mls): ");
                int milk = scanner.nextInt();
                scanner.nextLine();
                properties.put("milk", milk);
            }
            case PUMPKIN_SPICE_LATTE -> {
                System.out.print("How much milk would you like? (in mls): ");
                int milk = scanner.nextInt();
                scanner.nextLine();
                properties.put("milk", milk);

                System.out.print("How much pumpkin spice would you like? (in mgs): ");
                int pumpkinSpice = scanner.nextInt();
                scanner.nextLine();
                properties.put("pumpkinSpice", pumpkinSpice);
            }
            case AMERICANO -> {
                System.out.print("How much water would you like? (in mls): ");
                int water = scanner.nextInt();
                scanner.nextLine();
                properties.put("water", water);
            }
            case SYRUP_CAPPUCCINO -> {
                System.out.print("How much milk would you like? (in mls): ");
                int milk = scanner.nextInt();
                scanner.nextLine();
                properties.put("milk", milk);

                System.out.print("What syrup would you like? (MACADAMIA, VANILLA, COCONUT, CARAMEL, CHOCOLATE, POPCORN): ");
                String syrupInput = scanner.nextLine().toUpperCase();
                SyrupType syrup = SyrupType.valueOf(syrupInput);
                properties.put("syrup", syrup);
            }
            default -> throw new IllegalArgumentException("Unknown coffee type!");
        }

        return properties;
    }
}