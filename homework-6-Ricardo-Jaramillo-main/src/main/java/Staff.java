public class Staff extends SalariedEmployee{

    public Staff(String name, int hireYear){
        super(name, hireYear);
    }

    @Override
    public double annualPay(){
        return (super.annualPay() * 0.02) + super.annualPay();
    }
}
