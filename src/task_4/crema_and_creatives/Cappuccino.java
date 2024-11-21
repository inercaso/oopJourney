package task_4.crema_and_creatives;

class Cappuccino extends Coffee {
    protected final int mlOfMilk;

    public Cappuccino(Intensity coffeeIntensity, int mlOfMilk) {
        super(coffeeIntensity, "Cappuccino");
        this.mlOfMilk = mlOfMilk;
    }

    @Override
    protected void getCoffeeDetails() {
        System.out.println("Milk: " + mlOfMilk + " mls");
    }

    public void makeCappuccino() {
        prepareCoffee();
    }
}
