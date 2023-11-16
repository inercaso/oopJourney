package task_4.crema_and_creatives;

class Cappuccino extends Coffee {
    private final int mlOfMilk;

    Cappuccino(Intensity coffeeIntensity, int mlOfMilk) {
        super(coffeeIntensity, "Cappuccino");
        this.mlOfMilk = mlOfMilk;
    }

    @Override
    public void makeCoffee() {
        System.out.println("--- Coffee Machine is working ... ---");
        System.out.println("> Making: " + getName());
        prepareBase(); // Call the shared preparation step
        System.out.println("Adding " + mlOfMilk + " mls of milk");
        System.out.println("> Dispensing: " + getName());
        System.out.println("[" + getName() + " is ready! Enjoy! ☕]");
    }
}
