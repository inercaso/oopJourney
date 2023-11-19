package task_4.crema_and_creatives;

class SyrupCappuccino extends Coffee {
    private final int mlOfMilk;
    private final SyrupType syrup;

    public SyrupCappuccino(Intensity coffeeIntensity, int mlOfMilk, SyrupType syrup) {
        super(coffeeIntensity, "Syrup Cappuccino");
        this.mlOfMilk = mlOfMilk;
        this.syrup = syrup;
    }

    public void makeSyrupCappuccino() {
        System.out.println("--- Coffee Machine is working ... ---");
        System.out.println("> Making: " + getName());
        System.out.println("Coffee intensity: " + getCoffeeIntensity());
        System.out.println("Adding " + mlOfMilk + " mls of milk");
        System.out.println("Adding syrup: " + syrup);
        System.out.println("> Dispensing: " + getName());
        System.out.println("[" + getName() + " is ready! Enjoy! ☕]");
    }
}
