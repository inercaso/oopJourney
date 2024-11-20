package task_4.crema_and_creatives;

class SyrupCappuccino extends Cappuccino {
    private final SyrupType syrup;

    public SyrupCappuccino(Intensity coffeeIntensity, int mlOfMilk, SyrupType syrup) {
        super(coffeeIntensity, mlOfMilk);
        this.syrup = syrup;
    }

    @Override
    public void makeCoffee() {
        System.out.println("--- Coffee Machine is working ... ---");
        System.out.println("> Making: Syrup Cappuccino");
        prepareBase();
        System.out.println("Adding " + mlOfMilk + " mls of milk");
        System.out.println("Adding syrup: " + syrup);
        System.out.println("> Dispensing: Syrup Cappuccino");
        System.out.println("[Syrup Cappuccino is ready! Enjoy! ☕]");
    }
}
