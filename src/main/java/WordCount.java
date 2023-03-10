import java.util.*;

public class WordCount {
    public static Map<String, Integer> getWordCount(String text) {
        // Create a map to store the word counts
        Map<String, Integer> wordCounts = new HashMap<>();

        // Replace all punctuation with spaces and split into words
        text = text.replaceAll("[^a-zA-Z0-9\\s]", " ");
        String[] words = text.split("\\s+");



        // Iterate over the words and count the frequency of each unique word
        for (String word : words) {
            if(!word.equals("")) {
                if (wordCounts.containsKey(word)) {
                    wordCounts.put(word, wordCounts.get(word) + 1);
                } else {
                    wordCounts.put(word, 1);
                }
            }
        }

        return wordCounts;
    }

    public static void main(String[] args) {
        String text = "This is a, Sample Document!";
        Map<String, Integer> wordCounts = getWordCount(text);

        // Print the word counts
        for (String word : wordCounts.keySet()) {
            System.out.println(word + ": " + wordCounts.get(word));
        }
    }
}