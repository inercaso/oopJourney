import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Classifier {
    private List<Universe> universes;  // list to store all universes
    private Map<String, Integer> scores;  // map to store scores for each universe

    // constructor used to initialize universes
    public Classifier() {
        universes = new ArrayList<>();
        scores = new HashMap<>();

        // adding universes to the list
        universes.add(new Universe("Star Wars", "Kashyyyk", "Endor", new String[][] {
                {"HAIRY", "TALL"},  // wookie
                {"SHORT", "HAIRY"}  // ewok
        }, 400, 60));

        universes.add(new Universe("Marvel", "Asgard", null, new String[][] {
                {"BLONDE", "TALL"}  // asgardian
        }, 5000, null));

        universes.add(new Universe("Hitchhiker's Guide", "Betelgeuse", "Vogsphere", new String[][] {
                {"EXTRA_ARMS", "EXTRA_HEAD"},  // betelgeusian
                {"GREEN", "BULKY"}  // vogon
        }, 100, 200));

        universes.add(new Universe("Lord of the Rings", "Earth", null, new String[][] {
                {"BLONDE", "POINTY_EARS"},  // elf
                {"SHORT", "BULKY"}  // warf
        }, null, 200));
    }

    // classify an individual by calculating
    public String classify(Individual individual) {
        scores.clear();  // clear scores

        for (Universe universe : universes) {
            int score = universe.calculateScore(individual);
            scores.put(universe.getName(), score);
        }

        // find the universe with the highest score
        return findMaxScore();
    }

    // helper method to find the universe with the highest score
    private String findMaxScore() {
        String maxUniverse = null;
        int maxScore = -1;

        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            if (entry.getValue() > maxScore) {
                maxScore = entry.getValue();
                maxUniverse = entry.getKey();
            }
        }

        return maxUniverse != null ? maxUniverse : "Unknown";
    }
}