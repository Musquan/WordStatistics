import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;

public class WordCount {
    public static Map<String, Integer> getWordCount(String text) {
        // Create a map to store the word counts
        Map<String, Integer> wordCounts = new HashMap<>();
        // Initialize counters for lines and characters
        int numLines = 0;
        int numChars = 0;

        // Split the text into lines using the newline character
        String[] lines = text.split("\n");

        // Iterate over the lines and split each line into words
        for (String line : lines) {
            if(!line.equals("")) {
                numLines++; // Increment line count
            }
            String[] words = line.split("\\s+");
            for (String word : words) {
                numChars += word.length(); //Increment character count
                if (!word.equals("")) {
                    if (wordCounts.containsKey(word)) {
                        wordCounts.put(word, wordCounts.get(word) + 1);
                    } else {
                        wordCounts.put(word, 1);
                    }
                }
            }
        }
        // Add the line count and character count to the map
        wordCounts.put("Number of lines", numLines);
        wordCounts.put("Number of characters", numChars);
        return wordCounts;
    }
    public static void main(String[] args) {
        String text = args[0];
        Map<String, Integer> wordCounts = getWordCount(text);
        // Print the word counts
        for (String word : wordCounts.keySet()) {
            if (!word.equals("Number of lines") && !word.equals("Number of characters")) {
                System.out.println(word + ": " + wordCounts.get(word));
            }
        }
        // Print the line count and character count
        int numLines = wordCounts.get("Number of lines");
        int numChars = wordCounts.get("Number of characters");
        System.out.println("Number of lines: " + numLines);
        System.out.println("Number of characters: " + numChars);
    }
}


