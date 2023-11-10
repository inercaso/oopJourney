package task_3;

public class Coffee {
    protected Intensity coffeeIntensity; // intensity of the coffee
    protected final String name;        // name of the coffee

    public Coffee(Intensity coffeeIntensity, String name) {
        this.coffeeIntensity = coffeeIntensity;
        this.name = name;
    }

    // shared preparation step: setting intensity
    public final void prepareBase() {
        System.out.println("Coffee intensity: " + coffeeIntensity);
    }

    // getter for the coffee name
    public String getName() {
        return name;
    }
}
