import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalariedEmployeeTest {

    @Test
    void shouldSetSuperclassVariablesUsingConstructor() {
        SalariedEmployee se = new SalariedEmployee("SE", 1803);
        assertEquals("Name: SE Hired: 1803", se.toString());
    }

    @Test
    void shouldSetAnnualSalary() {
        SalariedEmployee se = new SalariedEmployee("SE2", 1956);
        assertEquals(0, se.annualPay());
        se.setAnnualSalary(95000);
        assertEquals(95000, se.annualPay());
    }

    @Test
    void shouldCalculateMonthlyPay() {
        SalariedEmployee se = new SalariedEmployee("SE3", 2001);
        se.setAnnualSalary(120000);
        assertEquals(10000, se.monthlyPay());
    }

    @Test
    void equalsWithInheritanceShouldReturnTrue() {
        Employee e = new Employee("E", 1998);
        SalariedEmployee se = new SalariedEmployee("SE", 2003);
        assertEquals(true, e.equals(se));
    }

    @Test
    void equalsWithInheritanceShouldReturnFalse() {
        Employee e = new Employee("E", 1998);
        SalariedEmployee se = new SalariedEmployee("SE", 2003);
        se.setAnnualSalary(54032);
        assertEquals(false, e.equals(se));
    }

}