public class EmployeeDemo {

    public static void main(String[] args) {
        Employee e1 = new Employee("Employee1", 1992);
        HourlyEmployee h1 = new HourlyEmployee("Hourly1", 1908);
        h1.setHourlyWage(10);
        h1.setHoursPerWeek(20);
        SalariedEmployee s1 = new SalariedEmployee("Salaried1", 1986);
        s1.setAnnualSalary(80000);
        Manager m1 = new Manager("Manager1", 2009);
        m1.setAnnualSalary(80000);
        Staff s2 = new Staff("Staff1", 2005);
        s2.setAnnualSalary(50000);
        PartTime pt = new PartTime("PartTime1", 1998);
        pt.setHourlyWage(20);
        pt.setHoursPerWeek(20);
        FullTime ft = new FullTime("FullTime1", 2020);
        ft.setHourlyWage(10);
        ft.setHoursPerWeek(40);
        Manager m2 = new Manager("Manager2", 2003);
        m2.setAnnualSalary(80000);

        Employee[] employees = {e1, h1, s1, m1, s2, pt, ft, m2};

        for (int i = 0; i < employees.length; i++){
            System.out.println(employees[i]);
            System.out.println("Monthly Pay: " + employees[i].monthlyPay());
            System.out.println("Annual Pay: " + employees[i].annualPay());
        }

        for (int j = 0; j < employees.length; j++){
            for (int k = j + 1; k < employees.length; k++){
                System.out.println(employees[j]);
                System.out.println(employees[k]);
                System.out.println(employees[j].equals(employees[k]));
            }
        }
    }
}
