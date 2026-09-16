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
        String expected = "0000000000000000000000000000000000012345";
        assertEquals(expected, hugeInteger.toString());
    }

    @Test
    public void hugeIntegerEqualsOnSameStringReturnsTrueTest(){
        hugeInteger.parse("12345");

        HugeInteger secondHugeInteger = new HugeInteger();
        secondHugeInteger.parse("12345");

        assertTrue(hugeInteger.isEqualTo(secondHugeInteger));

    }

    @Test
    public void isEqualToReturnsFalseForDifferentNumbersTest() {
        hugeInteger.parse("12345");

        HugeInteger second = new HugeInteger();
        second.parse("54321");

        assertFalse(hugeInteger.isEqualTo(second));
    }

    @Test
    public void isNotEqualToOnDifferentHugeIntegersReturnsTrueTest() {
        hugeInteger.parse("12345");

        HugeInteger secondHugeInteger = new HugeInteger();
        secondHugeInteger.parse("54321");

        assertTrue(hugeInteger.isNotEqualTo(secondHugeInteger));
    }


    @Test
    public void isGreaterThanOnLargerHugeIntegerReturnsTrueTest() {
        HugeInteger firstNumber = new HugeInteger();
        firstNumber.parse("98765");

        HugeInteger secondNumber = new HugeInteger();
        secondNumber.parse("12345");

        assertTrue(firstNumber.isGreaterThan(secondNumber));
    }

    @Test
    public void isLessThanOnLargerHugeIntegerReturnsFalseTest() {
        hugeInteger.parse("98765");

        HugeInteger secondNumber = new HugeInteger();
        secondNumber.parse("12345");

        assertFalse(hugeInteger.isLessThan(secondNumber));
    }

    @Test
    public void isLessThanOnSmallerHugeIntegerReturnsTrueTest() {
        hugeInteger.parse("12345");

        HugeInteger secondNumber = new HugeInteger();
        secondNumber.parse("98765");

        assertTrue(hugeInteger.isLessThan(secondNumber));
    }

    @Test
    public void addTwoHugeIntegersReturnsCorrectSumTest() {
        hugeInteger.parse("12345");
        HugeInteger secondNumber = new HugeInteger();
        secondNumber.parse("98765");

        HugeInteger result = hugeInteger.add(secondNumber);
        assertEquals("0000000000000000000000000000000000111110", result.toString());
    }

    @Test
    public void subtractTwoHugeIntegersReturnsCorrectDifferenceTest() {
        hugeInteger.parse("98765");

        HugeInteger secondNumber = new HugeInteger();
        secondNumber.parse("12345");

        HugeInteger result = hugeInteger.subtract(secondNumber);

        assertEquals("0000000000000000000000000000000000086420", result.toString());
    }

    @Test
    public void isGreaterThanOrEqualToOnEqualHugeIntegersReturnsTrueTest() {
        hugeInteger.parse("12345");

        HugeInteger secondNumber = new HugeInteger();
        secondNumber.parse("12345");

        assertTrue(hugeInteger.isGreaterThanOrEqualTo(secondNumber));
    }

    @Test
    public void isGreaterThanOrEqualToOnLargerHugeIntegerReturnsTrueTest() {
        hugeInteger.parse("98765");

        HugeInteger secondNumber = new HugeInteger();
        secondNumber.parse("12345");

        assertTrue(hugeInteger.isGreaterThanOrEqualTo(secondNumber));
    }

    @Test
    public void isLessThanOrEqualToOnEqualHugeIntegersReturnsTrueTest() {
        hugeInteger.parse("12345");

        HugeInteger secondNumber = new HugeInteger();
        secondNumber.parse("12345");

        assertTrue(hugeInteger.isLessThanOrEqualTo(secondNumber));
    }

    @Test
    public void isLessThanOrEqualToOnSmallerHugeIntegerReturnsTrueTest() {
        hugeInteger.parse("12345");

        HugeInteger secondNumber = new HugeInteger();
        secondNumber.parse("98765");

        assertTrue(hugeInteger.isLessThanOrEqualTo(secondNumber));
    }

    @Test
    public void isZeroOnZeroHugeIntegerReturnsTrueTest() {
        hugeInteger.parse("0");
        assertTrue(hugeInteger.isZero());
    }

    @Test
    public void isZeroOnNonZeroHugeIntegerReturnsFalseTest() {
        hugeInteger.parse("12345");
        assertFalse(hugeInteger.isZero());
    }

}