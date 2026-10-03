import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnotherPalindromeTest {

    @Test
    public void test_race_retuns_racecar() {
        String words = "race";
        String expected = new AnotherPalindrome().transformAndMakePalindrome(words);
        String actual = "racecar";
        assertEquals(expected, actual);
    }

    @Test
    public void test_ab_retuns_aba() {
        String words = "ab";
        String expected = new AnotherPalindrome().transformAndMakePalindrome(words);
        String actual = "aba";
        assertEquals(expected, actual);
    }

    @Test
    public void test_aace_retuns_aacecaa() {
        String words = "aace";
        String expected = new AnotherPalindrome().transformAndMakePalindrome(words);
        String actual = "aacecaa";
        assertEquals(expected, actual);
    }

    @Test
    public void test_abcd_retuns_abcdcba() {
        String words = "abcd";
        String expected = new AnotherPalindrome().transformAndMakePalindrome(words);
        String actual = "abcdcba";
        assertEquals(expected, actual);
    }

    @Test
    public void test_aabbaa_retuns_aabbaa() {
        String words = "aabbaa";
        String expected = new AnotherPalindrome().transformAndMakePalindrome(words);
        String actual = "aabbaa";
        assertEquals(expected, actual);
    }

    @Test
    public void test_banana_retuns_bananab() {
        String words = "banana";
        String expected = new AnotherPalindrome().transformAndMakePalindrome(words);
        String actual = "bananab";
        assertEquals(expected, actual);
    }



}