import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class DateConversionTest {

    @Test
    void shouldInitializeInstanceVariable() {
        DateConversion sc = new DateConversion("20th Oct 2052");
        assertEquals("20th Oct 2052", sc.getDate());
    }

    @Test
    void reformatDate_shouldReformatDate() {
        DateConversion sc = new DateConversion("20th Oct 2052");
        assertEquals("2052-Oct-20", sc.reformatDate());
    }

    @Test
    void reformatDate_shouldReformatDateWithSingleDay() {
        DateConversion sc = new DateConversion("1st May 1933");
        assertEquals("1933-May-1", sc.reformatDate());
    }

    @Test
    void reformatDate_shouldReformatDateWithDifferentDayEnding() {
        DateConversion sc = new DateConversion("3rd June 2011");
        assertEquals("2011-June-3", sc.reformatDate());
    }

}
