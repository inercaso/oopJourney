package task_2;

public class PumpkinSpiceLatte extends Cappuccino {
    private int mgOfPumpkinSpice; // amount of pumpkin spice in milligrams

    public PumpkinSpiceLatte(Intensity coffeeIntensity, int mlOfMilk, int mgOfPumpkinSpice) {
        super(coffeeIntensity, mlOfMilk);
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    @Override
    public void printCoffeeDetails() {
        // reuse parent method to print shared details
        super.printCoffeeDetails();
        // add pumpkin spice latte-specific details
        System.out.println("Pumpkin Spice: " + mgOfPumpkinSpice + " mg");
    }
}