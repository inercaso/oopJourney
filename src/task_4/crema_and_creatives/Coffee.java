package task_4.crema_and_creatives;

abstract class Coffee {
    protected final String name;
    protected final Intensity coffeeIntensity;

    Coffee(Intensity coffeeIntensity, String name) {
        this.coffeeIntensity = coffeeIntensity;
        this.name = name;
    }

    public void prepareCoffee() {
        System.out.println("--- Coffee Machine is working ... ---");
        System.out.println("> Making: " + name); // Access fields directly
        System.out.println("Coffee intensity: " + coffeeIntensity); // Access fields directly
        getCoffeeDetails();
        System.out.println("> Dispensing: " + name); // Access fields directly
        System.out.println("[" + name + " is ready! Enjoy! ☕]");
    }

    protected abstract void getCoffeeDetails();
}
