import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

class WordCountTest {

    @Test
    void getWordCount() {
        String document = "This is a sample document";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("This", 1);
        expected.put("is", 1);
        expected.put("a", 1);
        expected.put("sample", 1);
        expected.put("document", 1);
        Map<String, Integer> actual = WordCount.getWordCount(document);
        assertEquals(expected, actual);
    }
    @Test
    public void emptyStringTestCase() {
        String text = "";
        Map<String, Integer> expectedWordCounts = new HashMap<>();

        Map<String, Integer> wordCounts = WordCount.getWordCount(text);

        assertEquals(expectedWordCounts, wordCounts);
    }
    @Test
    public void singleWordTestCase() {
        String text = "hello";
        Map<String, Integer> expectedWordCounts = new HashMap<>();
        expectedWordCounts.put("hello", 1);

        Map<String, Integer> wordCounts = WordCount.getWordCount(text);

        assertEquals(expectedWordCounts, wordCounts);
    }
    @Test
    public void SeparatorsTestCase() {
        String text = "This\tis\na\tsample text\nwith spaces\tand\ttabs\nas\nseparators";
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

        Map<String, Integer> wordCounts = WordCount.getWordCount(text);

        assertEquals(expectedWordCounts, wordCounts);
    }
    @Test
    public void repeatedWordsTestCase() {
        String text = "the quick brown fox jumps over the lazy dog the dog jumps over the brown fox jumps";
        Map<String, Integer> expectedWordCounts = new HashMap<>();
        expectedWordCounts.put("the", 4);
        expectedWordCounts.put("quick", 1);
        expectedWordCounts.put("brown", 2);
        expectedWordCounts.put("fox", 2);
        expectedWordCounts.put("jumps", 3);
        expectedWordCounts.put("over", 2);
        expectedWordCounts.put("lazy", 1);
        expectedWordCounts.put("dog", 2);

        Map<String, Integer> wordCounts = WordCount.getWordCount(text);

        assertEquals(expectedWordCounts, wordCounts);
    }
    @Test
    public void multipleSpaceTestCase() {
        String text = "This   is   a    sample   text  with   multiple    space    separators";
        Map<String, Integer> expectedWordCounts = new HashMap<>();
        expectedWordCounts.put("This", 1);
        expectedWordCounts.put("is", 1);
        expectedWordCounts.put("a", 1);
        expectedWordCounts.put("sample", 1);
        expectedWordCounts.put("text", 1);
        expectedWordCounts.put("with", 1);
        expectedWordCounts.put("multiple", 1);
        expectedWordCounts.put("space", 1);
        expectedWordCounts.put("separators", 1);

        Map<String, Integer> wordCounts = WordCount.getWordCount(text);

        assertEquals(expectedWordCounts, wordCounts);
    }
    @Test
    public void numbersTestCase() {
        String text = "This is a sample text with numbers like 123 and 456";
        Map<String, Integer> expectedWordCounts = new HashMap<>();
        expectedWordCounts.put("This", 1);
        expectedWordCounts.put("is", 1);
        expectedWordCounts.put("a", 1);
        expectedWordCounts.put("sample", 1);
        expectedWordCounts.put("text", 1);
        expectedWordCounts.put("with", 1);
        expectedWordCounts.put("numbers", 1);
        expectedWordCounts.put("like", 1);
        expectedWordCounts.put("123", 1);
        expectedWordCounts.put("and", 1);
        expectedWordCounts.put("456", 1);

        Map<String, Integer> wordCounts = WordCount.getWordCount(text);

        assertEquals(expectedWordCounts, wordCounts);
    }
//    @Test
//    public void caseInsensitivityTestCase() {
//        String text = "this IS a SaMPLe tExt with text";
//        Map<String, Integer> expectedWordCounts = new HashMap<>();
//        expectedWordCounts.put("this", 1);
//        expectedWordCounts.put("is", 1);
//        expectedWordCounts.put("a", 1);
//        expectedWordCounts.put("sample", 1);
//        expectedWordCounts.put("text", 1);
//        expectedWordCounts.put("with", 1);
//
//        Map<String, Integer> wordCounts = WordCount.getWordCount(text);
//
//        assertEquals(expectedWordCounts, wordCounts);
//    }
}
