package task_1;

public class Coffee {
    protected Intensity coffeeIntensity; // coffee intensity level
    protected final String name;        // coffee type name (constant)

    public Coffee(Intensity coffeeIntensity, String name) {
        this.coffeeIntensity = coffeeIntensity;
        this.name = name;
    }

    // getter for coffee intensity
    public Intensity getCoffeeIntensity() {
        return coffeeIntensity;
    }

    // setter for coffee intensity
    public void setCoffeeIntensity(Intensity coffeeIntensity) {
        this.coffeeIntensity = coffeeIntensity;
    }

    // getter for coffee name
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "coffee: " + name + ", intensity: " + coffeeIntensity;
    }
}