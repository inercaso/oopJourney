package task_4.crema_and_creatives;

abstract class Coffee {
    protected final String name;
    protected final Intensity coffeeIntensity;

    Coffee(Intensity coffeeIntensity, String name) {
        this.coffeeIntensity = coffeeIntensity;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Intensity getCoffeeIntensity() {
        return coffeeIntensity;
    }

}
