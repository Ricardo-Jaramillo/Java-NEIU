import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HourlyEmployeeTest {

    @Test
    void shouldSetSuperclassVariablesUsingConstructor() {
        HourlyEmployee he = new HourlyEmployee("HE", 3776);
        assertEquals("Name: HE Hired: 3776", he.toString());
    }

    @Test
    void shouldTestMonthlyPayAfterSettingHourlyWageAndHoursPerWeek() {
        HourlyEmployee he = new HourlyEmployee("HE1", 2015);
        assertEquals(0, he.monthlyPay());
        he.setHoursPerWeek(20);
        he.setHourlyWage(5);
        assertEquals(400, he.monthlyPay());
    }

    @Test
    void shouldTestAnnualPayNotOverridden() {
        HourlyEmployee he = new HourlyEmployee("HE2", 1996);
        assertEquals(0, he.annualPay());
    }
}