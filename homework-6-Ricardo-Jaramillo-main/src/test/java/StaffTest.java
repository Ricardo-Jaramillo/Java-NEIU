import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    @Test
    void shouldSetSuperclassVariablesUsingConstructor() {
        Staff s = new Staff("S1", 1800);
        assertEquals("Name: S1 Hired: 1800", s.toString());
    }

    @Test
    void shouldOverrideAnnualPayToReturnSuperclassAnnualPayWithBonus() {
        Staff s = new Staff("S2", 1934);
        s.setAnnualSalary(70000);
        assertEquals(71400, s.annualPay());
    }

    @Test
    void shouldNotOverrideMonthlyPay() {
        Staff s = new Staff("S3", 2021);
        s.setAnnualSalary(36000);
        assertEquals(3000, s.monthlyPay());
    }
}