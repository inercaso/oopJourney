import java.util.ArrayList;
import java.util.List;

public class IndividualContainer {
    // created the container itself for storing individuals
    private List<Individual> individuals;

    // constr
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
}