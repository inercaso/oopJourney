import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // reads the input.json file
            String filePath = "src/input.json";
            String fileContent = FileReaderUtil.readFile(filePath);

            // parsing the content as a JSON object
            JSONObject jsonObject = new JSONObject(fileContent);

            JSONArray individualsArray = jsonObject.getJSONArray("data");

            // prints each JSON object separately
            for (int i = 0; i < individualsArray.length(); i++) {
                JSONObject individual = individualsArray.getJSONObject(i);
                System.out.println("Individual JSON Object " + (i + 1) + ": " + individual);
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
