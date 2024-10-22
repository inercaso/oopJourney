public class Individual {
    private int id;
    private Boolean isHumanoid; // Can be null, so use Boolean instead of boolean
    private String planet;
    private Integer age; // Use Integer to allow null values
    private String[] traits;

    // the constructor
    public Individual(int id, Boolean isHumanoid, String planet, Integer age, String[] traits) {
        this.id = id;
        this.isHumanoid = isHumanoid;
        this.planet = planet;
        this.age = age;
        this.traits = traits;
    }

    public int getId() {
        return id;
    }

    public Boolean getIsHumanoid() {
        return isHumanoid;
    }

    public String getPlanet() {
        return planet;
    }

    public Integer getAge() {
        return age;
    }

    public String[] getTraits() {
        return traits;
    }

    // method for printing details
    @Override
    public String toString() {
        return "Individual{id=" + id +
                ", isHumanoid=" + isHumanoid +
                ", planet='" + planet + '\'' +
                ", age=" + age +
                ", traits=" + String.join(", ", traits) + "}";
    }
}
