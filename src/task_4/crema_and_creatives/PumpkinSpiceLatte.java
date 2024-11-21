package task_4.crema_and_creatives;

class PumpkinSpiceLatte extends Cappuccino {
    private final int mgOfPumpkinSpice;

    public PumpkinSpiceLatte(Intensity coffeeIntensity, int mlOfMilk, int mgOfPumpkinSpice) {
        super(coffeeIntensity, mlOfMilk);
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    @Override
    protected void getCoffeeDetails() {
        super.getCoffeeDetails();
        System.out.println("Pumpkin Spice: " + mgOfPumpkinSpice + " mgs");
    }

    public void makePumpkinSpiceLatte() {
        prepareCoffee();
    }
}
