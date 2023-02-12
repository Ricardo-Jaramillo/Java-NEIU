package problem3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AttendeeTest {

    @Test
    void constructorShouldThrowExceptionIfNull() {
        Throwable exception = assertThrows(NullPointerException.class, () -> new Attendee(null, "Foo", 123));
        assertEquals("Last name or first name cannot be null", exception.getMessage());
        exception = assertThrows(NullPointerException.class, () -> new Attendee("Foo", null, 123));
        assertEquals("Last name or first name cannot be null", exception.getMessage());
        exception = assertThrows(NullPointerException.class, () -> new Attendee(null, null, 123));
        assertEquals("Last name or first name cannot be null", exception.getMessage());
    }

    @Test
    void isPaidShouldReturnFalseIfNotSet() {
        Attendee a = new Attendee("Last", "First", 14567);
        assertFalse(a.isPaid());
    }

    @Test
    void setPaidShouldModifyPaid() {
        Attendee a = new Attendee("Last", "First", 14567);
        a.setPaid(true);
        assertTrue(a.isPaid());
    }

    @Test
    void equalsShouldReturnFalseIfNullParameter() {
        Attendee a = new Attendee("Last", "First", 14567);
        assertFalse(a.equals(null));
    }

    @Test
    void equalsShouldReturnFalseIfDifferentTypes() {
        Attendee a = new Attendee("Last", "First", 14567);
        assertFalse(a.equals(Integer.valueOf(19)));
    }

    @Test
    void equalsShouldReturnFalseIfLastNamesDoNotMatch() {
        String last = new String("Last2");
        Attendee a = new Attendee("Last", "First", 14567);
        Attendee a1 = new Attendee(last, "First", 14567);
        assertFalse(a.equals(a1));
    }

    @Test
    void equalsShouldReturnFalseIfFirstNamesDoNotMatch() {
        String first = new String("First2");
        Attendee a = new Attendee("Last", "First", 14567);
        Attendee a1 = new Attendee("Last", first, 14567);
        assertFalse(a.equals(a1));
    }

    @Test
    void equalsShouldReturnFalseIfIdsDoNotMatch() {
        Attendee a = new Attendee("Last", "First", 14567);
        Attendee a1 = new Attendee("Last", "First", 1456);
        assertFalse(a.equals(a1));
    }

    @Test
    void equalsShouldReturnTrueIfAllFinalVariablesMatch() {
        Attendee a = new Attendee("Last", "First", 14567);
        Attendee a1 = new Attendee("Last", "First", 14567);
        a1.setPaid(true);
        assertTrue(a.equals(a1));
    }

    @Test
    void toStringShouldReturnStringInParticularFormat() {
        Attendee a = new Attendee("Last", "First", 14567);
        Attendee a1 = new Attendee("Smith", "Jay", 900);
        a1.setPaid(true);
        assertEquals("Last-First Paid: false", a.toString());
        assertEquals("Smith-Jay Paid: true", a1.toString());
    }

    @Test
    void hashCodeShouldBeEqualIfAttendeesAreEqual() {
        Attendee a = new Attendee("Last", "First", 14567);
        Attendee a1 = new Attendee("Last", "First", 14567);
        a1.setPaid(true);
        assertEquals(a.hashCode(), a1.hashCode());
    }

    @Test
    void compareToShouldReturnNegativeValueParameterIsAfter() {
        Attendee a = new Attendee("Adams", "John", 392);
        Attendee a1 = new Attendee("Zeno", "Plato", 33333);
        assertTrue(a.compareTo(a1) < 0);
    }

    @Test
    void compareToShouldReturnPositiveValueParameterIsBefore() {
        Attendee a = new Attendee("Adams", "John", 392);
        Attendee a1 = new Attendee("Zeno", "Plato", 33333);
        assertTrue(a1.compareTo(a) > 0);
    }

    @Test
    void compareToShouldReturnZeroIfParameterIsSame() {
        Attendee a = new Attendee("Adams", "John", 392);
        Attendee a1 = new Attendee("Adams", "Abigail", 995544);
        assertTrue(a.compareTo(a1) == 0);
    }

    @Test
    void removeNonPaidWhereParameterIsMix() {
        List<Attendee> attendees = new ArrayList<>();
        attendees.add(new Attendee("Bar", "Foo", 29292));
        attendees.add(new Attendee("blah", "bee", 777));
        attendees.add(new Attendee("doo", "daa", 3300991));
        attendees.add(new Attendee("Banana", "Apple", 1));
        attendees.get(3).setPaid(true);
        attendees.get(2).setPaid(true);
        List<Attendee> attendees1 = new ArrayList<>();
        attendees1.add(new Attendee("doo", "daa", 3300991));
        attendees1.add(new Attendee("Banana", "Apple", 1));
        Attendee.removeNonPaid(attendees);
        assertEquals(attendees1, attendees);
    }

    @Test
    void removeNonPaidWhereAllUnpaid() {
        List<Attendee> attendees = new ArrayList<>();
        attendees.add(new Attendee("Bar", "Foo", 29292));
        attendees.add(new Attendee("blah", "bee", 777));
        attendees.add(new Attendee("doo", "daa", 3300991));
        attendees.add(new Attendee("Banana", "Apple", 1));
        List<Attendee> attendees1 = new ArrayList<>();
        Attendee.removeNonPaid(attendees);
        assertEquals(attendees1, attendees);
    }

    @Test
    void removeNonPaidWhereAllPaid() {
        List<Attendee> attendees = new ArrayList<>();
        attendees.add(new Attendee("Bar", "Foo", 29292));
        attendees.add(new Attendee("blah", "bee", 777));
        attendees.add(new Attendee("doo", "daa", 3300991));
        attendees.add(new Attendee("Banana", "Apple", 1));
        attendees.get(0).setPaid(true);
        attendees.get(1).setPaid(true);
        attendees.get(2).setPaid(true);
        attendees.get(3).setPaid(true);
        List<Attendee> attendees1 = new ArrayList<>(attendees);
        Attendee.removeNonPaid(attendees);
        assertEquals(attendees1, attendees);
    }
}