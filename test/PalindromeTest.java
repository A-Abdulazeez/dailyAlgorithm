import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

    @ParameterizedTest
    @NullAndEmptySource
    public void parameterIsNotEmptyOrNull(String input) {
        Palindrome palindrome = new Palindrome();
        assertFalse(palindrome.palindrome(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"a", "ab"})
    public void parameterIsMoreThanTwoCharacters(String input) {
        Palindrome palindrome = new Palindrome();
        assertFalse(palindrome.palindrome(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"tat", "dad", "mom", "racecar", "level", "noon", "wow", "deed", "peep", "eye"})
    public void parameterIsMoreThanThreeCharacters(String input) {
        Palindrome palindrome = new Palindrome();
        assertTrue(palindrome.palindrome(input));
    }

}