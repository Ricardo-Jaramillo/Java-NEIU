import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class TestingTime {
    @Test
    void getTotalMinutesShouldReturnTrueForA1Time() {
        Time time = new Time(3, 5, 12, 'A');
        assertEquals(185, time.getTotalMinutes());
    }

    @Test
    void getTotalMinutesShouldReturnTrueForP1Time() {
        Time time = new Time(3, 5, 12, 'P');
        assertEquals(905, time.getTotalMinutes());
    }

    @Test
    void getTotalMinutesShouldReturnTrueForA2Time() {
        Time time = new Time(12, 45, 12, 'A');
        assertEquals(45, time.getTotalMinutes());
    }

    @Test
    void getTotalMinutesShouldReturnTrueForP2Time() {
        Time time = new Time(12, 32, 12, 'P');
        assertEquals(752, time.getTotalMinutes());
    }

    @Test
    void getTotalSecondsShouldReturnTrueForA1Time() {
        Time time = new Time(3, 5, 12, 'A');
        assertEquals(11112, time.getTotalSeconds());
    }

    @Test
    void getTotalSecondsShouldReturnTrueForP1Time() {
        Time time = new Time(3, 5, 12, 'P');
        assertEquals(54312, time.getTotalSeconds());
    }

    @Test
    void getTotalSecondsShouldReturnTrueForA2Time() {
        Time time = new Time(12, 45, 12, 'A');
        assertEquals(2712, time.getTotalSeconds());
    }

    @Test
    void getTotalSecondsShouldReturnTrueForP2Time() {
        Time time = new Time(12, 32, 12, 'P');
        assertEquals(45132, time.getTotalSeconds());
    }

    @Test
    void localTimeToTimeObjectShouldReturnTimeObject() {
        LocalTime localTime = LocalTime.now();
        Time testTime = Time.localTimeToTimeObject(localTime);
        int n = localTime.getHour();
        int h = n > 12 ? n - 12 : n;
        char m = n >= 12 ? 'P' : 'A';
        assertTrue(h == testTime.getHour());
        assertTrue(localTime.getMinute() == testTime.getMin());
        assertTrue(localTime.getSecond() == testTime.getSec());
        assertTrue(m == testTime.getMeridiem());
    }

    @Test
    void getMultipleTimesShouldReturnTimeArray() {
        LocalTime[] localTimeArray = {LocalTime.now(), LocalTime.MIDNIGHT, LocalTime.NOON, LocalTime.MAX};
        Time[] timeArray = Time.getMultipleTimes(localTimeArray);
        for(int i = 0; i < localTimeArray.length; i++) {
            LocalTime localTime = localTimeArray[i];
            Time testTime = timeArray[i];
            int n = localTime.getHour();
            int h = n > 12 ? n - 12 : n;
            char m = n >= 12 ? 'P' : 'A';
            assertTrue(h == testTime.getHour());
            assertTrue(localTime.getMinute() == testTime.getMin());
            assertTrue(localTime.getSecond() == testTime.getSec());
            assertTrue(m == testTime.getMeridiem());
        }
    }

}
