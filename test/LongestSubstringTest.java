import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringTest {

    @Test
    public void testLongestSubstringWithWord_abcabcbb_returnsThree() {
        LongestSubstring ls = new LongestSubstring();
        int result = ls.longestSubstringWithoutDuplicate("abcabcbb");
        assertEquals(3,result);
    }

    @Test
    public void testLongestSubstringWithWord_bbbbb_returnsOne() {
        LongestSubstring ls = new LongestSubstring();
        int result = ls.longestSubstringWithoutDuplicate("bbbbb");
        assertEquals(1,result);
    }

}