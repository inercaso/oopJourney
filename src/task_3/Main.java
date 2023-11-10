package task_3;

public class Main {
    public static void main(String[] args) {
        Cappuccino cappuccino = new Cappuccino(Intensity.NORMAL, 50);
        cappuccino.makeCappuccino();

        System.out.println();

        PumpkinSpiceLatte pumpkinSpiceLatte = new PumpkinSpiceLatte(Intensity.NORMAL, 100, 50);
        pumpkinSpiceLatte.makePumpkinSpiceLatte();

        System.out.println();

        Americano americano = new Americano(Intensity.STRONG, 200);
        americano.makeAmericano();

        System.out.println();

        SyrupCappuccino syrupCappuccino = new SyrupCappuccino(Intensity.LIGHT, 60, SyrupType.CARAMEL);
        syrupCappuccino.makeSyrupCappuccino();
    }
}
