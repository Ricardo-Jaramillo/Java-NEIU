import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void monthlyPayShouldReturnZero() {
        Employee e = new Employee("E5", 2020);
        assertEquals(0, e.monthlyPay());
    }

    @Test
    void annualPayShouldReturnZero() {
        Employee e = new Employee("E", 1004);
        assertEquals(0, e.annualPay());
    }

    @Test
    void toStringShouldPrintOutNameAndhired() {
        Employee e = new Employee("Jane Eyre", 2003);
        assertEquals("Name: Jane Eyre Hired: 2003", e.toString());
    }

    @Test
    void equalsWithDifferentObjectsShouldReturnFalse() {
        Employee e = new Employee("E1", 1998);
        String s = "foo";
        assertEquals(false, e.equals(s));
    }

    @Test
    void equalsWithSameObjectsShouldReturnTrue() {
        Employee e = new Employee("E1", 1998);
        Employee e2 = new Employee("E2", 2003);
        assertEquals(true, e.equals(e2));
    }

    @Test
    void equalsWithNullShouldReturnFalse() {
        Employee e = new Employee("E1", 1998);
        assertEquals(false, e.equals(null));
    }
}