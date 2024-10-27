import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Classifier {
    private List<Universe> universes;  // list to store all universes
    private Map<String, Integer> scores;  // map to store scores for each universe

    // constructor receives universes as parameter
    public Classifier(List<Universe> universes) {
        this.universes = universes;
        scores = new HashMap<>();
    }

    // classify an individual by calculating
    public String classify(Individual individual) {
        scores.clear();  // clear scores

        for (Universe universe : universes) {
            int score = universe.calculateScore(individual);
            scores.put(universe.getName(), score);
            System.out.println("Score for " + universe.getName() + ": " + score);  // debug print
        }

        // find the universe with the highest score
        String bestMatch = findMaxScore();
        System.out.println("Best match for individual " + individual.getId() + ": " + bestMatch);  // debug print

        return bestMatch;
    }

    // helper method to find the universe with the highest score
    private String findMaxScore() {
        String maxUniverse = null;
        int maxScore = 0;  // setting a minimum threshold of 0

        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            if (entry.getValue() > maxScore) {  // only consider positive scores
                maxScore = entry.getValue();
                maxUniverse = entry.getKey();
            }
        }

        return maxUniverse != null ? maxUniverse : "Unknown";
    }
}