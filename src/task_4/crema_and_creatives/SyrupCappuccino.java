package task_4.crema_and_creatives;

class SyrupCappuccino extends Cappuccino {
    private final SyrupType syrup;

    public SyrupCappuccino(Intensity coffeeIntensity, int mlOfMilk, SyrupType syrup) {
        super(coffeeIntensity, mlOfMilk);
        this.syrup = syrup;
    }

    @Override
    protected void getCoffeeDetails() {
        super.getCoffeeDetails();
        System.out.println("Syrup: " + syrup);
    }

    public void makeSyrupCappuccino() {
        prepareCoffee();
    }
}
