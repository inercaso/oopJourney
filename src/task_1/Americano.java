package task_1;

// additional water amount
public class Americano extends Coffee {
    private int mlOfWater; // amount of water in milliliters

    public Americano(Intensity coffeeIntensity, int mlOfWater) {
        super(coffeeIntensity, "Americano");
        this.mlOfWater = mlOfWater;
    }

    // getter for water amount
    public int getMlOfWater() {
        return mlOfWater;
    }

    // setter for water amount
    public void setMlOfWater(int mlOfWater) {
        this.mlOfWater = mlOfWater;
    }

    @Override
    public String toString() {
        return super.toString() + ", water: " + mlOfWater + "ml";
    }
}