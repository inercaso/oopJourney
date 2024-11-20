package task_4.crema_and_creatives;

class PumpkinSpiceLatte extends Cappuccino {
    private final int mgOfPumpkinSpice;

    public PumpkinSpiceLatte(Intensity coffeeIntensity, int mlOfMilk, int mgOfPumpkinSpice) {
        super(coffeeIntensity, mlOfMilk);
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    @Override
    public void makeCoffee() {
        System.out.println("--- Coffee Machine is working ... ---");
        System.out.println("> Making: Pumpkin Spice Latte");
        prepareBase();
        System.out.println("Adding " + mlOfMilk + " mls of milk");
        System.out.println("Adding " + mgOfPumpkinSpice + " mls of pumpkin spice");
        System.out.println("> Dispensing: Pumpkin Spice Latte");
        System.out.println("[Pumpkin Spice Latte is ready! Enjoy! ☕]");
    }
}
