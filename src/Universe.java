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
        String planet = individual.getPlanet();
        String[] traits = individual.getTraits();
        Boolean isHumanoid = individual.getIsHumanoid();
        Integer age = individual.getAge();

        // base planet score
        if (planet != null && (planet.equals(primaryPlanet) ||
                (secondaryPlanet != null && planet.equals(secondaryPlanet)))) {
            score += 50;
        }

        // trait matching
        if (traits != null) {
            for (String[] traitsSet : traitsSets) {
                if (hasAllTraits(individual, traitsSet)) {
                    score += 30;
                }
            }
        }

        // universe-specific scoring
        if (name.equals("Star Wars")) {
            // prioritize hairy or short creatures from kashyyyk or endor
            if (traits != null && (hasAnyTrait(traits, "HAIRY") || hasAnyTrait(traits, "SHORT"))) {
                score += 20;
            }
        } else if (name.equals("Marvel")) {
            // prioritize tall, blonde humanoids
            if (isHumanoid != null && isHumanoid &&
                    traits != null && hasAllTraits(individual, new String[]{"BLONDE", "TALL"})) {
                score += 40;
            }
        } else if (name.equals("Lord of the Rings")) {
            // prioritize earth-based creatures with specific traits or very old humanoids
            if ((traits != null &&
                    (hasAnyTrait(traits, "POINTY_EARS") ||
                            (hasAnyTrait(traits, "SHORT") && hasAnyTrait(traits, "BULKY")))) ||
                    (isHumanoid != null && isHumanoid && traits != null && hasAnyTrait(traits, "BULKY"))) {
                score += 35;
            }
            // additional score for very old humanoids
            if (isHumanoid != null && isHumanoid && age != null && age > 7000) {
                score += 40;
            }
        } else if (name.equals("Hitchhiker's Guide")) {
            // prioritize extra features, green creatures, and non-humanoids with bulky trait
            if (traits != null &&
                    (hasAnyTrait(traits, "EXTRA_ARMS") ||
                            hasAnyTrait(traits, "EXTRA_HEAD") ||
                            hasAnyTrait(traits, "GREEN") ||
                            (isHumanoid != null && !isHumanoid && hasAnyTrait(traits, "BULKY")))) {
                score += 45;
            }
        }

        return score;
    }

    // helper method to check if individual has any of the specified traits
    private boolean hasAnyTrait(String[] individualTraits, String trait) {
        for (String t : individualTraits) {
            if (t.equals(trait)) {
                return true;
            }
        }
        return false;
    }

    // helper method to check if individual has all required traits
    private boolean hasAllTraits(Individual individual, String[] requiredTraits) {
        if (individual.getTraits() == null) return false;

        for (String required : requiredTraits) {
            boolean found = false;
            for (String trait : individual.getTraits()) {
                if (trait.equals(required)) {
                    found = true;
                    break;
                }
            }
            if (!found) return false;
        }
        return true;
    }

    // getter for the name of the universe
    public String getName() {
        return name;
    }
}