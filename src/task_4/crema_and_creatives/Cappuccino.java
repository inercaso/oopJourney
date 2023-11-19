package task_4.crema_and_creatives;

class Cappuccino extends Coffee {
    private final int mlOfMilk;

    public Cappuccino(Intensity coffeeIntensity, int mlOfMilk) {
        super(coffeeIntensity, "Cappuccino");
        this.mlOfMilk = mlOfMilk;
    }

    public void makeCappuccino() {
        System.out.println("--- Coffee Machine is working ... ---");
        System.out.println("> Making: " + getName());
        System.out.println("Coffee intensity: " + getCoffeeIntensity());
        System.out.println("Adding " + mlOfMilk + " mls of milk");
        System.out.println("> Dispensing: " + getName());
        System.out.println("[" + getName() + " is ready! Enjoy! ☕]");
    }
}
