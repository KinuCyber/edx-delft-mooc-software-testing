package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWordsR() {
        int words = new CountLetters().count("eater|rider");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatchR() {
        int words = new CountLetters().count("eater|ride");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void firstWordDoesNotMatchR() {
        int words = new CountLetters().count("eat|rider");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void multipleMatchingWordsS() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatchS() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void firstWordDoesNotMatchS() {
        int words = new CountLetters().count("cat|dogs");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void noMatchingWords() {
        int words = new CountLetters().count("cat|dog");
        Assertions.assertEquals(0, words);
    }
}
