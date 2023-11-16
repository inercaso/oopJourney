package task_4.crema_and_creatives;

class PumpkinSpiceLatte extends Coffee {
    private final int mlOfMilk;
    private final int mgOfPumpkinSpice;

    PumpkinSpiceLatte(Intensity coffeeIntensity, int mlOfMilk, int mgOfPumpkinSpice) {
        super(coffeeIntensity, "Pumpkin Spice Latte");
        this.mlOfMilk = mlOfMilk;
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    @Override
    public void makeCoffee() {
        System.out.println("--- Coffee Machine is working ... ---");
        System.out.println("> Making: " + getName());
        prepareBase();
        System.out.println("Adding " + mlOfMilk + " mls of milk");
        System.out.println("Adding " + mgOfPumpkinSpice + " mls of pumpkin spice");
        System.out.println("> Dispensing: " + getName());
        System.out.println("[" + getName() + " is ready! Enjoy! ☕]");
    }
}
