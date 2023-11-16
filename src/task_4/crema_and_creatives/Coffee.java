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

    // a shared method for setting coffee intensity
    public final void prepareBase() {
        System.out.println("Coffee intensity: " + coffeeIntensity);
    }

    // method for specific coffee preparation
    public abstract void makeCoffee();
}
