import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test
    void shouldSetSuperclassVariablesUsingConstructor() {
        Manager m = new Manager("M1", 2000);
        assertEquals("Name: M1 Hired: 2000", m.toString());
    }

    @Test
    void shouldOverrideAnnualPayToReturnSuperclassAnnualPayWithBonus() {
        Manager m = new Manager("M2", 1985);
        m.setAnnualSalary(90000);
        assertEquals(99000, m.annualPay());
    }

    @Test
    void shouldNotOverrideMonthlyPay() {
        Manager m = new Manager("M3", 1846);
        m.setAnnualSalary(144000);
        assertEquals(12000, m.monthlyPay());
    }
}