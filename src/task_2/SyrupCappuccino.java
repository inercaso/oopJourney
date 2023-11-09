package task_2;

// subclass of cappuccino, represents cappuccino with syrup
public class SyrupCappuccino extends Cappuccino {
    private SyrupType syrup; // type of syrup used

    public SyrupCappuccino(Intensity coffeeIntensity, int mlOfMilk, SyrupType syrup) {
        super(coffeeIntensity, mlOfMilk);
        this.syrup = syrup;
    }

    @Override
    public void printCoffeeDetails() {
        // reuse parent method to print shared and cappuccino-specific details
        super.printCoffeeDetails();
        // add syrup-specific details
        System.out.println("Syrup: " + syrup);
    }
}