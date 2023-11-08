package task_1;

// additional spice amount
public class PumpkinSpiceLatte extends Cappuccino {
    private int mgOfPumpkinSpice; // amount of pumpkin spice in milligrams

    public PumpkinSpiceLatte(Intensity coffeeIntensity, int mlOfMilk, int mgOfPumpkinSpice) {
        super(coffeeIntensity, mlOfMilk);
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    // getter for pumpkin spice amount
    public int getMgOfPumpkinSpice() {
        return mgOfPumpkinSpice;
    }

    // setter for pumpkin spice amount
    public void setMgOfPumpkinSpice(int mgOfPumpkinSpice) {
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    @Override
    public String toString() {
        return super.toString() + ", pumpkin spice: " + mgOfPumpkinSpice + "mg";
    }
}