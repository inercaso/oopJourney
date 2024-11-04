import org.json.JSONArray;
import org.json.JSONObject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        // reading input
        String filePath = "src/input.json";
        String fileContent = FileReaderUtil.readFile(filePath);

        // parsing as json object
        JSONObject jsonObject = new JSONObject(fileContent);

        if (jsonObject.has("data")) {
            JSONArray individualsArray = jsonObject.getJSONArray("data");

            // create IndividualContainer to store individuals
            IndividualContainer individualContainer = new IndividualContainer();

            // define universes with specific criteria
            List<Universe> universes = new ArrayList<>();
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
                    {"SHORT", "BULKY"}  // dwarf
            }, null, 200));

            // initialize classifier with universes
            Classifier classifier = new Classifier(universes);

            // map each JSON object to an Individual object and then add to container
            Map<String, List<Individual>> classifiedIndividuals = new HashMap<>();
            for (int i = 0; i < individualsArray.length(); i++) {
                Individual individual = getIndividual(individualsArray, i);
                individualContainer.addIndividual(individual);

                // classify the individual
                String classification = classifier.classify(individual);

                // add the individual to the corresponding universe list
                classifiedIndividuals.computeIfAbsent(classification, k -> new ArrayList<>()).add(individual);
            }

            // view to handle writing to files
            View view = new View();
            view.writeToJson(classifiedIndividuals);  // outputs to JSON files per universe

        } else {
            System.err.println("Error: 'data' key not found in JSON.");
        }
    }

    private static Individual getIndividual(JSONArray individualsArray, int i) {
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

        return new Individual(id, isHumanoid, planet, age, traits);
    }
}