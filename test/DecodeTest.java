import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecodeTest {

    @Test
    public void test() {
        String words = "(abcd)";
        String expected = new Decode().reverseParentheses(words);
        String actual = "dcba";
        assertEquals(actual,expected);
    }

    @Test
    public void test2() {
        String words = "(u(love)i)";
        String expected = new Decode().reverseParentheses(words);
        String actual = "iloveu";
        assertEquals(actual,expected);
    }
}