package task_2;

public class Cappuccino extends Coffee {
    private int mlOfMilk; // amount of milk in milliliters

    public Cappuccino(Intensity coffeeIntensity, int mlOfMilk) {
        super(coffeeIntensity, "Cappuccino");
        this.mlOfMilk = mlOfMilk;
    }

    @Override
    public void printCoffeeDetails() {
        // reuse parent method to print shared details
        super.printCoffeeDetails();
        // add cappuccino-specific details
        System.out.println("Cappuccino milk: " + mlOfMilk + " mg");
    }
}