import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayTaskTest {

    @Test
    public void secondLargestNumberWithoutSortingTest(){
        int [] numbers = {2,7,6,8,1};
        int expected = 7;
        ArrayTask secondLargest = new ArrayTask();
        int result  = secondLargest.secondLargest(numbers);
        assertEquals(expected,result);
    }

}