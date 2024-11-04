package task_2;

public class Main {
    public static void main(String[] args) {
        // check if a file path is provided as a command-line argument
        if (args.length == 0) {
            System.out.println("Please provide a file path as a command-line argument.");
            return;
        }

        // get the file path from command-line arguments
        String filePath = args[0];

        // create a FileReader instance and read file content
        FileReader fileReader = new FileReader();
        String text = fileReader.readFileIntoString(filePath);

        if (text.isEmpty()) {
            System.out.println("Failed to read file content.");
            return;
        }

        // create TextData instance and print text data info
        TextData textData = new TextData(filePath, text);
        System.out.println(textData);
    }
}