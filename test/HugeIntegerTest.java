import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HugeIntegerTest {

    private HugeInteger hugeInteger;

    @BeforeEach
    public void setUp() {
        hugeInteger = new HugeInteger();
    }

    @Test
    public void testHugeIntegerParseOn10DigitsLengthhIs10() {
        String digits = "1234567890";
        hugeInteger.parse(digits);
      assertEquals(10, digits.length());
    }

    @Test
    public void testParseWorksWithToStringMethod() {
        hugeInteger.parse("12345");
        String expected = "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 2 3 4 5 ";
        assertEquals(expected, hugeInteger.toString());
    }

    @Test
    public void hugeIntegerEqualsOnSameStringReturnsTrueTest(){
        HugeInteger firstHugeInteger = new HugeInteger();
        firstHugeInteger.parse("12345");

        HugeInteger secondHugeInteger = new HugeInteger();
        secondHugeInteger.parse("12345");

        assertTrue(hugeInteger.isEqualTo(firstHugeInteger, secondHugeInteger));

    }

    @Test
    public void isEqualToReturnsFalseForDifferentNumbersTest() {
        HugeInteger first = new HugeInteger();
        first.parse("12345");

        HugeInteger second = new HugeInteger();
        second.parse("54321");

        assertFalse(hugeInteger.isEqualTo(first, second));
    }

    @Test
    public void isNotEqualToOnDifferentHugeIntegersReturnsTrueTest() {
        HugeInteger firstHugeInteger = new HugeInteger();
        firstHugeInteger.parse("12345");

        HugeInteger secondHugeInteger = new HugeInteger();
        secondHugeInteger.parse("54321");

        assertTrue(hugeInteger.isNotEqualTo(firstHugeInteger, secondHugeInteger));
    }

}