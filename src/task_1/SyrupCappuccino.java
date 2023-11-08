package task_1;

// additional syrup type
public class SyrupCappuccino extends Cappuccino {
    private SyrupType syrup; // type of syrup

    public SyrupCappuccino(Intensity coffeeIntensity, int mlOfMilk, SyrupType syrup) {
        super(coffeeIntensity, mlOfMilk);
        this.syrup = syrup;
    }

    // getter for syrup type
    public SyrupType getSyrup() {
        return syrup;
    }

    // setter for syrup type
    public void setSyrup(SyrupType syrup) {
        this.syrup = syrup;
    }

    @Override
    public String toString() {
        return super.toString() + ", syrup: " + syrup;
    }
}
