import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FullTimeTest {

    @Test
    void shouldSetSuperclassVariablesUsingConstructor() {
        FullTime ft = new FullTime("FT1", 2005);
        assertEquals("Name: FT1 Hired: 2005", ft.toString());
    }

    @Test
    void shouldOverrideAnnualPayToUseMonthlyPayWithBonus() {
        FullTime ft = new FullTime("FT2", 1999);
        ft.setHoursPerWeek(40);
        ft.setHourlyWage(10);
        assertEquals(20800, ft.annualPay());
    }

    @Test
    void shouldNotOverrideMonthlyPay() {
        FullTime ft = new FullTime("FT3", 1991);
        ft.setHoursPerWeek(30);
        ft.setHourlyWage(20);
        assertEquals(2400, ft.monthlyPay());
    }
}