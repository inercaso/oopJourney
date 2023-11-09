package task_2;

public class Americano extends Coffee {
    private int mlOfWater; // amount of water in milliliters

    public Americano(Intensity coffeeIntensity, int mlOfWater) {
        super(coffeeIntensity, "Americano");
        this.mlOfWater = mlOfWater;
    }

    @Override
    public void printCoffeeDetails() {
        // reuse parent method to print shared details
        super.printCoffeeDetails();
        // add americano-specific details
        System.out.println("Americano water: " + mlOfWater + " ml");
    }
}