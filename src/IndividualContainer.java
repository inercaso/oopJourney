import java.util.ArrayList;
import java.util.List;

public class IndividualContainer {
    // created the container itself for storing individuals
    private List<Individual> individuals;

    // constructor
    public IndividualContainer() {
        this.individuals = new ArrayList<>();
    }

    // adding an individual to the container
    public void addIndividual(Individual individual) {
        individuals.add(individual);
    }

    // retrieving all individuals
    public List<Individual> getIndividuals() {
        return individuals;
    }

    // prints all of them in the container
    public void printAll() {
        for (Individual individual : individuals) {
            System.out.println(individual);
        }
    }

    // printing only the ids
    public void printIds() {
        System.out.println("Individual IDs:");
        for (Individual individual : individuals) {
            System.out.println("ID: " + individual.getId());
        }
    }

    // filtering individuals with even ids
    public void printEvenIds() {
        System.out.println("Individuals with Even IDs:");
        for (Individual individual : individuals) {
            if (individual.getId() % 2 == 0) {
                System.out.println(individual);
            }
        }
    }

    // filtering individuals with odd ids
    public void printOddIds() {
        System.out.println("Individuals with Odd IDs:");
        for (Individual individual : individuals) {
            if (individual.getId() % 2 != 0) {
                System.out.println(individual);
            }
        }
    }
}