package task_4.crema_and_creatives;

class SyrupCappuccino extends Coffee {
    private int mlOfMilk;
    private SyrupType syrup;

    public SyrupCappuccino(Intensity coffeeIntensity, int mlOfMilk, SyrupType syrup) {
        super(coffeeIntensity, "Syrup Cappuccino");
        this.mlOfMilk = mlOfMilk;
        this.syrup = syrup;
    }

    @Override
    public void makeCoffee() {
        System.out.println("--- Coffee Machine is working ... ---");
        System.out.println("> Making: " + getName());
        prepareBase();
        System.out.println("Adding " + mlOfMilk + " mls of milk");
        System.out.println("Adding syrup: " + syrup);
        System.out.println("> Dispensing: " + getName());
        System.out.println("[" + getName() + " is ready! Enjoy! ☕]");
    }
}