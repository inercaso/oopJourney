public class Universe {
    private String name;
    private String primaryPlanet;
    private String secondaryPlanet;
    private String[][] traitsSets;
    private Integer primaryAgeLimit;
    private Integer secondaryAgeLimit;

    // constructor to initialize the universe
    public Universe(String name, String primaryPlanet, String secondaryPlanet, String[][] traitsSets,
                    Integer primaryAgeLimit, Integer secondaryAgeLimit) {
        this.name = name;
        this.primaryPlanet = primaryPlanet;
        this.secondaryPlanet = secondaryPlanet;
        this.traitsSets = traitsSets;
        this.primaryAgeLimit = primaryAgeLimit;
        this.secondaryAgeLimit = secondaryAgeLimit;
    }

    // method to calculate score for an individual
    public int calculateScore(Individual individual) {
        int score = 0;

        // check if the individual's planet matches this universe
        if (primaryPlanet.equals(individual.getPlanet()) || (secondaryPlanet != null && secondaryPlanet.equals(individual.getPlanet()))) {
            score += 10;
        }

        // check the individual's traits
        for (String[] traitsSet : traitsSets) {
            if (hasTraits(individual, traitsSet)) {
                score += 5;
            }
        }

        // check the individual's age
        if (individual.getAge() != null) {
            if (primaryPlanet.equals(individual.getPlanet()) && primaryAgeLimit != null && individual.getAge() <= primaryAgeLimit) {
                score += 5;
            }
            if (secondaryPlanet != null && secondaryPlanet.equals(individual.getPlanet()) && secondaryAgeLimit != null && individual.getAge() <= secondaryAgeLimit) {
                score += 5;
            }
        }

        return score;
    }

    // method to check if the individual has required traits
    private boolean hasTraits(Individual individual, String[] traitsSet) {
        if (individual.getTraits() == null) return false;

        for (String trait : traitsSet) {
            boolean found = false;
            for (String individualTrait : individual.getTraits()) {
                if (individualTrait.equals(trait)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    // getter for the name of the universe
    public String getName() {
        return name;
    }
}