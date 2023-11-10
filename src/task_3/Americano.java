package task_3;

public class Americano extends Coffee {
    private int mlOfWater;

    public Americano(Intensity coffeeIntensity, int mlOfWater) {
        super(coffeeIntensity, "Americano");
        this.mlOfWater = mlOfWater;
    }

    public Americano makeAmericano() {
        System.out.println("--- Coffee Machine is working ... ---");
        System.out.println("> Making: " + getName());
        prepareBase(); // shared step
        System.out.println("Adding " + mlOfWater + " mls of water");
        System.out.println("> Dispensing: " + getName());
        System.out.println("[" + getName() + " is ready! Enjoy!]");
        return new Americano(coffeeIntensity, mlOfWater);
    }
}
