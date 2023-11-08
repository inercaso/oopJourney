package task_1;

// additional milk amount
public class Cappuccino extends Coffee {
    protected int mlOfMilk; // amount of milk in milliliters

    public Cappuccino(Intensity coffeeIntensity, int mlOfMilk) {
        super(coffeeIntensity, "Cappuccino");
        this.mlOfMilk = mlOfMilk;
    }

    // getter for milk amount
    public int getMlOfMilk() {
        return mlOfMilk;
    }

    // setter for milk amount
    public void setMlOfMilk(int mlOfMilk) {
        this.mlOfMilk = mlOfMilk;
    }

    @Override
    public String toString() {
        return super.toString() + ", milk: " + mlOfMilk + "ml";
    }
}