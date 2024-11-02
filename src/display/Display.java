package display;

// display class to represent monitor attributes and provide comparison methods
public class Display {

    private int width;
    private int height;
    private float ppi;
    private String model;

    // constructor to initialize display attributes
    public Display(int width, int height, float ppi, String model) {
        this.width = width;
        this.height = height;
        this.ppi = ppi;
        this.model = model;
    }

    // method to compare display size (based on width * height) and print verbose output
    public void compareSize(Display other) {
        int thisSize = this.width * this.height;
        int otherSize = other.width * other.height;

        // output for size comparison
        if (thisSize > otherSize) {
            System.out.println(this.model + " is larger than " + other.model + " based on size.");
        } else if (thisSize < otherSize) {
            System.out.println(other.model + " is larger than " + this.model + " based on size.");
        } else {
            System.out.println(this.model + " and " + other.model + " have the same size.");
        }
    }

    // method to compare display sharpness (ppi) and print verbose output
    public void compareSharpness(Display other) {
        // output for sharpness comparison
        if (this.ppi > other.ppi) {
            System.out.println(this.model + " is sharper than " + other.model + " based on PPI.");
        } else if (this.ppi < other.ppi) {
            System.out.println(other.model + " is sharper than " + this.model + " based on PPI.");
        } else {
            System.out.println(this.model + " and " + other.model + " have the same sharpness.");
        }
    }

    // method to compare both size and sharpness and print a combined comparison
    public void compareWithMonitor(Display other) {
        System.out.println("Comparing " + this.model + " with " + other.model + ":");
        this.compareSize(other);
        this.compareSharpness(other);
        System.out.println();
    }
}