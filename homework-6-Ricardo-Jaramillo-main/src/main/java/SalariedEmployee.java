public class SalariedEmployee extends Employee{

    private int annualSalary;

    public SalariedEmployee(String name, int hiredYear){
        super(name, hiredYear);
    }

    public void setAnnualSalary(int annualSalary){
        this.annualSalary = annualSalary;
    }

    @Override
    public double monthlyPay(){
        return this.annualSalary/12;
    }

    @Override
    public double annualPay(){
        return this.annualSalary;
    }
}
