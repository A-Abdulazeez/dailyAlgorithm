import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParenthesisTest {

    private Parenthesis parenthesis;

    @BeforeEach
    public void setUp() {
        parenthesis = new Parenthesis();
    }

    @Test
    public void testSameValidParenthesis() {
        assertTrue(parenthesis.isValidParenthesis("()"));
    }

    @Test
    public void testTwoDifferentParenthesis() {
        assertFalse(parenthesis.isValidParenthesis("(}"));
    }

    @Test
    public void testValidParenthesis() {
        assertTrue(parenthesis.isValidParenthesis("{}"));
    }

}