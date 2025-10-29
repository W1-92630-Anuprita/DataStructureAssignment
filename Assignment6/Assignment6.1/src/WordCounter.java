import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {

    public static Map<String, Integer> countWordsInLine(String line) {
        Map<String, Integer> wordCounts = new HashMap<>();
        String[] words = line.split("\\W+");
        for (String word : words) {
            if (!word.isEmpty()) {
                word = word.toLowerCase();
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }
        return wordCounts;
    }

    public static Map<String, Integer> countWordsInFile(String filePath) {
        Map<String, Integer> wordCounts = new HashMap<>();
        // Use try-with-resources to automatically close the Scanner
        try (Scanner fileScanner = new Scanner(new File(filePath))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                Map<String, Integer> lineCounts = countWordsInLine(line);
                for (Map.Entry<String, Integer> entry : lineCounts.entrySet()) {
                    wordCounts.put(entry.getKey(),
                            wordCounts.getOrDefault(entry.getKey(), 0) + entry.getValue());
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: The file was not found at the specified path.");
            e.printStackTrace();
        }
        return wordCounts;
    }

    public static void main(String[] args) {
        String line = "Java is great. Java is versatile. Java is powerful!";
        Map<String, Integer> lineCount = countWordsInLine(line);
        System.out.println("Word count for line: " + lineCount);


        String filePath = "src/example.txt";
        Map<String, Integer> fileCount = countWordsInFile(filePath);
        System.out.println("Word count for file: " + fileCount);
    }
}

