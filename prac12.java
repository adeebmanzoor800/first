import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class prac12 {
    public static void main(String[] args) {
        // Define the file path
        String filePath = "skiilcaptian.txt";

        // Read the file contents and count the occurrences of "Java"
        int count = countOccurrences(filePath, "Java");

        // Print the total count to the console
        System.out.println("Total occurrences of 'Java': " + count);
    }

    private static int countOccurrences(String filePath, String java) {
        int count = 0;

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (word.equalsIgnoreCase(java)) {
                        count++;
                    }
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        }

        return count;
    }
}
