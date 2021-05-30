import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SILab2Test {



    @Test
    public void mc_test(){
        //if (hr < 0 || hr > 24)
        assertTrue(assertThrows(RuntimeException.class, () -> SILab2.function(Collections.singletonList(new Time(-4, 0, 0)))).getMessage().equals("The hours are smaller than the minimum"));
        assertTrue(assertThrows(RuntimeException.class, () -> SILab2.function(Collections.singletonList(new Time(26, 0, 0)))).getMessage().equals("The hours are greater than the maximum"));
        //if (min < 0 || min > 59)
        assertTrue(assertThrows(RuntimeException.class, () -> SILab2.function(Collections.singletonList(new Time(0, -1, 0)))).getMessage().equals("The minutes are not valid!"));
        assertTrue(assertThrows(RuntimeException.class, () -> SILab2.function(Collections.singletonList(new Time(0, 90, 0)))).getMessage().equals("The minutes are not valid!"));
        //if (sec >= 0 && sec <= 59)
        assertTrue(assertThrows(RuntimeException.class, () -> SILab2.function(Collections.singletonList(new Time(1, 1, -20)))).getMessage().equals("The seconds are not valid"));
        assertTrue(assertThrows(RuntimeException.class, () -> SILab2.function(Collections.singletonList(new Time(1, 1, 70)))).getMessage().equals("The seconds are not valid"));
        //else if (hr == 24 && min == 0 && sec == 0)
        //TTT
        assertEquals(SILab2.function(Collections.singletonList(new Time(24, 0, 0))), Integer.valueOf(86400));
        assertTrue(assertThrows(RuntimeException.class, () -> SILab2.function(Collections.singletonList(new Time(24, 1, 0)))).getMessage().equals("The time is greater than the maximum"));
        assertTrue(assertThrows(RuntimeException.class, () -> SILab2.function(Collections.singletonList(new Time(24, 0, 6)))).getMessage().equals("The time is greater than the maximum"));
        assertTrue(assertThrows(RuntimeException.class, () -> SILab2.function(Collections.singletonList(new Time(24, 1, 6)))).getMessage().equals("The time is greater than the maximum"));
    }

    @Test
    public void eb_test(){
        assertTrue(assertThrows(RuntimeException.class, () -> SILab2.function(Collections.singletonList(new Time(-4, 0, 0)))).getMessage()=="The hours are smaller than the maximum");
        assertTrue(assertThrows(RuntimeException.class, () -> SILab2.function(Collections.singletonList(new Time(50, 0, 0)))).getMessage().equals("The hours are grater than the maximum"));
        assertTrue(assertThrows(RuntimeException.class, () -> SILab2.function(Collections.singletonList(new Time(7, 63, 0)))).getMessage().equals("The minutes are not valid!"));
        assertEquals(SILab2.function(Collections.singletonList(new Time(0, 1, 1))), Integer.valueOf(61));
        assertTrue(assertThrows(RuntimeException.class, () -> SILab2.function(Collections.singletonList(new Time(0, 0, 62)))).getMessage().equals("The seconds are not valid"));
        assertEquals(SILab2.function(Collections.singletonList(new Time(24, 0, 0))), Integer.valueOf(86400));
        assertTrue(assertThrows(RuntimeException.class, () -> SILab2.function(Collections.singletonList(new Time(24, 1, 1)))).getMessage().equals("The time is greater than the maximum"));
    }
}
