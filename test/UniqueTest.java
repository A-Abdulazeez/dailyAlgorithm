import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UniqueTest {

    @Test
    public void duplicateSubstring_returnsFalse() {
        String words = "aabbccaaaa";
        boolean actual = new Unique().isUnique(words);
        assertFalse(actual);
    }

    @Test
    public void nullInput_returnsFalse() {
        boolean actual = new Unique().isUnique(null);
        assertFalse(actual);
    }

    @Test
    public void blankInput_returnsFalse() {
        boolean actual = new Unique().isUnique("");
        assertFalse(actual);
    }

    @Test
    public void uniquesubtring_returnsTrue() {
        boolean actual = new Unique().isUnique("123");
        assertTrue(actual);
    }

}