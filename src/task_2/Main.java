package task_2;

public class Main {
    public static void main(String[] args) {
        // create a generic coffee
        Coffee genericCoffee = new Coffee(Intensity.LIGHT, "Generic Coffee");
        System.out.println("--- Generic Coffee ---");
        genericCoffee.printCoffeeDetails();
        System.out.println();

        // create a cappuccino
        Cappuccino cappuccino = new Cappuccino(Intensity.NORMAL, 50);
        System.out.println("--- Cappuccino ---");
        cappuccino.printCoffeeDetails();
        System.out.println();

        // create an americano
        Americano americano = new Americano(Intensity.STRONG, 200);
        System.out.println("--- Americano ---");
        americano.printCoffeeDetails();
        System.out.println();

        // create a pumpkin spice latte
        PumpkinSpiceLatte pumpkinSpiceLatte = new PumpkinSpiceLatte(Intensity.NORMAL, 100, 25);
        System.out.println("--- Pumpkin Spice Latte ---");
        pumpkinSpiceLatte.printCoffeeDetails();
        System.out.println();

        // create a syrup cappuccino
        SyrupCappuccino syrupCappuccino = new SyrupCappuccino(Intensity.LIGHT, 60, SyrupType.CARAMEL);
        System.out.println("--- Syrup Cappuccino ---");
        syrupCappuccino.printCoffeeDetails();
    }
}