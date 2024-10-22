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

                // creates an IndividualContainer to store individuals
                IndividualContainer individualContainer = new IndividualContainer();

                // maps each JSON object to an Individual object and then adds to container
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

                    // ind object creation
                    Individual individual = new Individual(id, isHumanoid, planet, age, traits);

                    // adding the individual to the container
                    individualContainer.addIndividual(individual);
                }

                System.out.println("\nOdd & Even");
                individualContainer.printIds(); // print only the ids
                System.out.println();

                individualContainer.printEvenIds(); // print individuals with even ids
                System.out.println();

                individualContainer.printOddIds(); // print individuals with odd ids

            } else {
                System.err.println("Error: 'data' key not found in JSON.");
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}