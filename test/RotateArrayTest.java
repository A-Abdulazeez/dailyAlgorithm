import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RotateArrayTest {

    @Test
    public void rotateArrayByTwoTest() {
        RotateArray array = new RotateArray();

        int [] numbers = {2,3,4,5,6};
        int [] result = array.rotateArrayByTwo(numbers);
        int [] expected = {4, 5, 6, 2, 3};

        assertArrayEquals(result, expected);
    }

}