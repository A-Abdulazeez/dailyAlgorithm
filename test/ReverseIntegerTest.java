import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseIntegerTest {

    @Test
    public void testReverseInteger123_returns321() {
        int number = 123;
        int expected = 321;
        int actual = new ReverseInteger().reverse(number);
        assertEquals(expected, actual);
    }

    @Test
    public void testReverseInteger_minus123_returns_minus321() {
        int number = -123;
        int expected = -321;
        int actual = new ReverseInteger().reverse(number);
        assertEquals(expected, actual);
    }

}