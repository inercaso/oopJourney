package task_4.crema_and_creatives;

class Americano extends Coffee {
    private final int mlOfWater;

    public Americano(Intensity coffeeIntensity, int mlOfWater) {
        super(coffeeIntensity, "Americano");
        this.mlOfWater = mlOfWater;
    }

    @Override
    protected void getCoffeeDetails() {
        System.out.println("Water: " + mlOfWater + " mls");
    }

    public void makeAmericano() {
        prepareCoffee();
    }
}
