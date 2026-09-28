import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompressTest {

    @Test
    public void compressWords_aabbcc_returns_a2b2c2Test() {
        String words = "aabbcc";
        String actual = new Compress().compress(words);
        String expexted = "a2b2c2";
        assertEquals(expexted,actual);
    }

    @Test
    public void compressWords_aabbccaaaa_returns_a2b2c2a4Test() {
        String words = "aabbccaaaa";
        String actual = new Compress().compress(words);
        String expexted = "a2b2c2a4";
        assertEquals(expexted,actual);
    }

}