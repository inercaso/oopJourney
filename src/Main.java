import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // reading input
            String filePath = "src/input.json";
            String fileContent = FileReaderUtil.readFile(filePath);

            // parsing as json object
            JSONObject jsonObject = new JSONObject(fileContent);

            if (jsonObject.has("data")) {
                JSONArray individualsArray = jsonObject.getJSONArray("data");

                // create IndividualContainer to store individuals
                IndividualContainer individualContainer = new IndividualContainer();

                // classifier
                Classifier classifier = new Classifier();

                // map each JSON object to an Individual object and then add to container
                for (int i = 0; i < 2; i++) {  // testing with 2 entries for now
                    JSONObject individualJson = individualsArray.getJSONObject(i);

                    int id = individualJson.getInt("id");
                    Boolean isHumanoid = individualJson.has("isHumanoid") ? individualJson.getBoolean("isHumanoid") : null;
                    String planet = individualJson.optString("planet", null);
                    Integer age = individualJson.has("age") ? individualJson.getInt("age") : null;

                    // convert to a string array
                    JSONArray traitsArray = individualJson.optJSONArray("traits");
                    String[] traits = null;
                    if (traitsArray != null) {
                        traits = new String[traitsArray.length()];
                        for (int j = 0; j < traitsArray.length(); j++) {
                            traits[j] = traitsArray.getString(j);
                        }
                    }

                    // individual object creation
                    Individual individual = new Individual(id, isHumanoid, planet, age, traits);
                    individualContainer.addIndividual(individual);

                    // classify the individual
                    String classification = classifier.classify(individual);
                    System.out.println("Individual ID: " + id + " classified as: " + classification);
                }

            } else {
                System.err.println("Error: 'data' key not found in JSON.");
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}