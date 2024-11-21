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

    public void prepareCoffee() {
        System.out.println("--- Coffee Machine is working ... ---");
        System.out.println("> Making: " + getName());
        System.out.println("Coffee intensity: " + getCoffeeIntensity());
        getCoffeeDetails(); // Call subclass-specific details
        System.out.println("> Dispensing: " + getName());
        System.out.println("[" + getName() + " is ready! Enjoy! ☕]");
    }

    protected abstract void getCoffeeDetails();
}