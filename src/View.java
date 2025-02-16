import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class View {

    // method to group individuals by universe
    public void writeToJson(Map<String, List<Individual>> classifiedIndividuals) {
        String outputFolder = "output/";

        // iterate through each universe
        for (Map.Entry<String, List<Individual>> entry : classifiedIndividuals.entrySet()) {
            String universe = entry.getKey();  // e.g., "Star Wars Universe"
            List<Individual> individuals = entry.getValue();

            // create the JSON array of individuals
            JSONArray jsonArray = new JSONArray();
            for (Individual individual : individuals) {
                JSONObject jsonObject = convertIndividualToJson(individual);
                jsonArray.put(jsonObject);
            }

            // write the JSON array to a file named after the universe
            String fileName = outputFolder + universe.replace(" ", "_").toLowerCase() + ".json";
            try (FileWriter file = new FileWriter(fileName)) {
                file.write(jsonArray.toString(4));
                file.flush();
                System.out.println("Successfully written to: " + fileName);
            } catch (IOException e) {
                System.err.println("Error writing to file: " + fileName);
                e.printStackTrace();
            }
        }
    }

    // method to convert an individual object to a JSONObject
    private JSONObject convertIndividualToJson(Individual individual) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", individual.getId());
        jsonObject.put("isHumanoid", individual.getIsHumanoid());
        jsonObject.put("planet", individual.getPlanet());
        jsonObject.put("age", individual.getAge());
        jsonObject.put("traits", individual.getTraits() != null ? new JSONArray(individual.getTraits()) : null);
        return jsonObject;
    }
}