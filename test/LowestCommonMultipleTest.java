import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LowestCommonMultipleTest {

    private LowestCommonMultiple lcm = new LowestCommonMultiple();

    @Test
    public void testLowestCommonMultipleWithZero() {
        assertEquals(0, lcm.lowestCommonMultiple(0,0,0));

    }

    @Test
    public void testLowestCommonMultipleWithOne() {
        assertEquals(1, lcm.lowestCommonMultiple(1,1,1));
    }

    @Test
    public void testLowestCommonMultipleWithSameNumbers() {
        assertEquals(2, lcm.lowestCommonMultiple(2,2,2));
    }

    @Test
    public void testLowestCommonMultipleWithDifferentNumbers() {
        assertEquals(24, lcm.lowestCommonMultiple(2,8,12));
    }

    @Test
    public void testLowestCommonMultipleWithDifferentNumber() {
        assertEquals(210, lcm.lowestCommonMultiple(7,6,5));
    }

}