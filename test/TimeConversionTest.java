import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeConversionTest {

    @Test
    public void test12_00_00am_returns_00_00_00MilitaryTime () {
        String time = "12:00:00AM";
        String expected = new TimeConversion().militaryTime(time);
        String actual = "00:00:00";
        assertEquals(expected, actual);
    }

    @Test
    public void test12_01_00PM_returns_12_01_00MilitaryTime () {
        String time = "12:01:00PM";
        String actual = new TimeConversion().militaryTime(time);
        String expected = "12:01:00";
        assertEquals(expected, actual);
    }

    @Test
    public void test07_05_45PM_returns_19_05_45MilitaryTime () {
        String time = "07:05:45PM";
        String actual = new TimeConversion().militaryTime(time);
        String expected = "19:05:45";
        assertEquals(expected, actual);
    }

}