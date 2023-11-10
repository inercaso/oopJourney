package task_3;

public class SyrupCappuccino extends Coffee {
    private int mlOfMilk;
    private SyrupType syrup;

    public SyrupCappuccino(Intensity coffeeIntensity, int mlOfMilk, SyrupType syrup) {
        super(coffeeIntensity, "Syrup Cappuccino");
        this.mlOfMilk = mlOfMilk;
        this.syrup = syrup;
    }

    public SyrupCappuccino makeSyrupCappuccino() {
        System.out.println("--- Coffee Machine is working ... ---");
        System.out.println("> Making: " + getName());
        prepareBase(); // shared step
        System.out.println("Adding " + mlOfMilk + " mls of milk");
        System.out.println("Adding syrup: " + syrup);
        System.out.println("> Dispensing: " + getName());
        System.out.println("[" + getName() + " is ready! Enjoy!]");
        return new SyrupCappuccino(coffeeIntensity, mlOfMilk, syrup);
    }
}
