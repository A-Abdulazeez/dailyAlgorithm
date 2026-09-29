import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WordsTest {

    @Test
    public void Hello_WorldReturns_5Test() {
        String test = "Hello World";
        int expected = new Words().lengthOfLastWord(test);
        int actual = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void fly_me_to_the_moonReturns_4Test() {
        String test = "fly    me to the moon";
        int expected = new Words().lengthOfLastWord(test);
        int actual = 4;
        assertEquals(expected, actual);
    }

}