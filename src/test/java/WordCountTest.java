import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

class WordCountTest {

    @Test
    void stringWithMultipleUniqueWords() {
        String document = "This is a sample string";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("This", 1);
        expected.put("is", 1);
        expected.put("a", 1);
        expected.put("sample", 1);
        expected.put("string", 1);
        expected.put("Number of lines", 1);
        expected.put("Number of characters", 19);
        Map<String, Integer> actual = WordCount.getWordCount(document);
        assertEquals(expected, actual);
    }

    @Test
    public void emptyStringTestCase() {
        String text = "";
        Map<String, Integer> expectedWordCounts = new HashMap<>();
        expectedWordCounts.put("Number of lines", 0);
        expectedWordCounts.put("Number of characters", 0);
        Map<String, Integer> wordCounts = WordCount.getWordCount(text);

        assertEquals(expectedWordCounts, wordCounts);
    }

    @Test
    public void stringWithSingleWord() {
        String text = "Hello";
        Map<String, Integer> expectedWordCounts = new HashMap<>();
        expectedWordCounts.put("Hello", 1);
        expectedWordCounts.put("Number of lines", 1);
        expectedWordCounts.put("Number of characters", 5);
        Map<String, Integer> wordCounts = WordCount.getWordCount(text);

        assertEquals(expectedWordCounts, wordCounts);
    }

    @Test
    public void stringWithMultipleSeparators() {
        String text = "This\tis\na\tsample text\n" +
                "with spaces\tand\ttabs\n" +
                "as\nseparators";
        Map<String, Integer> expectedWordCounts = new HashMap<>();
        expectedWordCounts.put("This", 1);
        expectedWordCounts.put("is", 1);
        expectedWordCounts.put("a", 1);
        expectedWordCounts.put("sample", 1);
        expectedWordCounts.put("text", 1);
        expectedWordCounts.put("with", 1);
        expectedWordCounts.put("spaces", 1);
        expectedWordCounts.put("and", 1);
        expectedWordCounts.put("tabs", 1);
        expectedWordCounts.put("as", 1);
        expectedWordCounts.put("separators", 1);
        expectedWordCounts.put("Number of lines", 5);
        expectedWordCounts.put("Number of characters", 46);
        Map<String, Integer> wordCounts = WordCount.getWordCount(text);

        assertEquals(expectedWordCounts, wordCounts);
    }

    @Test
    public void stringWithRepeatedWords() {
        String text = "hello world hello world";
        Map<String, Integer> expectedWordCounts = new HashMap<>();
        expectedWordCounts.put("hello", 2);
        expectedWordCounts.put("world", 2);
        expectedWordCounts.put("Number of lines", 1);
        expectedWordCounts.put("Number of characters", 20);

        Map<String, Integer> wordCounts = WordCount.getWordCount(text);

        assertEquals(expectedWordCounts, wordCounts);
    }

    @Test
    public void stringWithNumbers() {
        String text = "Hello 123 world 456";
        Map<String, Integer> expectedWordCounts = new HashMap<>();
        expectedWordCounts.put("Hello", 1);
        expectedWordCounts.put("123", 1);
        expectedWordCounts.put("world", 1);
        expectedWordCounts.put("456", 1);
        expectedWordCounts.put("Number of lines", 1);
        expectedWordCounts.put("Number of characters", 16);

        Map<String, Integer> wordCounts = WordCount.getWordCount(text);

        assertEquals(expectedWordCounts, wordCounts);
    }

    @Test// set a timeout of 5 seconds
    public void testGetWordCountWithLargeInput() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append("largeinput ");
        }
        String text = sb.toString();
        Map<String, Integer> expectedOutput = new HashMap<>();
        expectedOutput.put("largeinput", 1000000);
        expectedOutput.put("Number of lines", 1);
        expectedOutput.put("Number of characters", 10000000);
        Map<String, Integer> actualOutput = WordCount.getWordCount(text);
        assertEquals(expectedOutput, actualOutput);
}

    @Test
    public void stringWithMultipleLines() {
        String text = "This is the first line.\nThis is the second line.\nAnd this is the third line.";
        Map<String, Integer> expectedWordCounts = new HashMap<>();
        expectedWordCounts.put("This", 2);
        expectedWordCounts.put("is", 3);
        expectedWordCounts.put("the", 3);
        expectedWordCounts.put("first", 1);
        expectedWordCounts.put("line.", 3);
        expectedWordCounts.put("second", 1);
        expectedWordCounts.put("third", 1);
        expectedWordCounts.put("And", 1);
        expectedWordCounts.put("this", 1);
        expectedWordCounts.put("Number of lines", 3);
        expectedWordCounts.put("Number of characters", 61);

        Map<String, Integer> wordCounts = WordCount.getWordCount(text);

        assertEquals(expectedWordCounts, wordCounts);
    }

    @Test
    public void stringWithPunctuation() {
        String text = "Hello! It's a beautiful day";
        Map<String, Integer> expectedWordCounts= new HashMap<>();
        expectedWordCounts.put("Hello!", 1);
        expectedWordCounts.put("It's", 1);
        expectedWordCounts.put("a", 1);
        expectedWordCounts.put("beautiful", 1);
        expectedWordCounts.put("day", 1);
        expectedWordCounts.put("Number of lines", 1);
        expectedWordCounts.put("Number of characters", 23);
        Map<String, Integer> wordCounts = WordCount.getWordCount(text);

        assertEquals(expectedWordCounts, wordCounts);
    }

    @Test
    public void stringWithMixedCharacters() {
        String text = "HELLO WORLD hello world";
        Map<String, Integer> expectedWordCounts = new HashMap<>();
        expectedWordCounts.put("hello", 1);
        expectedWordCounts.put("world", 1);
        expectedWordCounts.put("HELLO", 1);
        expectedWordCounts.put("WORLD", 1);
        expectedWordCounts.put("Number of lines", 1);
        expectedWordCounts.put("Number of characters", 20);
        Map<String, Integer> wordCounts = WordCount.getWordCount(text);
        assertEquals(expectedWordCounts, wordCounts);
    }

    @Test
    void stringWithSpecialCharacters() {
        String document = "This! is @#$%^&*() a sample document.";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("This!", 1);
        expected.put("is", 1);
        expected.put("@#$%^&*()", 1);
        expected.put("a", 1);
        expected.put("sample", 1);
        expected.put("document.", 1);
        expected.put("Number of lines", 1);
        expected.put("Number of characters", 32);
        Map<String, Integer> actual = WordCount.getWordCount(document);
        assertEquals(expected, actual);
    }
}
