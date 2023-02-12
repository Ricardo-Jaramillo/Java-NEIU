import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartTimeTest {

    @Test
    void shouldSetSuperclassVariablesUsingConstructor() {
        PartTime pt = new PartTime("PT1", 2004);
        assertEquals("Name: PT1 Hired: 2004", pt.toString());
    }

    @Test
    void shouldOverrideAnnualPayToUseMonthlyPayNoBonus() {
        PartTime pt = new PartTime("PT2", 1908);
        pt.setHoursPerWeek(10);
        pt.setHourlyWage(50);
        assertEquals(25000, pt.annualPay());
    }

    @Test
    void shouldNotOverrideMonthlyPay() {
        PartTime pt = new PartTime("PT3", 2018);
        pt.setHoursPerWeek(15);
        pt.setHourlyWage(40);
        assertEquals(2400, pt.monthlyPay());
    }

}