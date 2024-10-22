import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

                // view to handle writing to files
                View view = new View();

                // map each JSON object to an Individual object and then add to container
                Map<String, List<Individual>> classifiedIndividuals = new HashMap<>();  // to store individuals by universe
                for (int i = 0; i < individualsArray.length(); i++) {
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

                    // add the individual to the corresponding universe list
                    classifiedIndividuals.computeIfAbsent(classification, k -> new ArrayList<>()).add(individual);
                }

                // write the grouped individuals to JSON files using the View class
                view.writeToJson(classifiedIndividuals);

            } else {
                System.err.println("Error: 'data' key not found in JSON.");
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}