package task_4.crema_and_creatives;

class Americano extends Coffee {
    private final int mlOfWater;

    public Americano(Intensity coffeeIntensity, int mlOfWater) {
        super(coffeeIntensity, "Americano");
        this.mlOfWater = mlOfWater;
    }

    public void makeAmericano() {
        System.out.println("--- Coffee Machine is working ... ---");
        System.out.println("> Making: " + getName());
        System.out.println("Coffee intensity: " + getCoffeeIntensity());
        System.out.println("Adding " + mlOfWater + " mls of water");
        System.out.println("> Dispensing: " + getName());
        System.out.println("[" + getName() + " is ready! Enjoy! ☕]");
    }
}
