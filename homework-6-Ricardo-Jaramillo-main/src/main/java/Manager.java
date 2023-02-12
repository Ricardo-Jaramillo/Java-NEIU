public class Manager extends SalariedEmployee{

    public Manager(String name, int hireYear){
        super(name, hireYear);
    }

    @Override
    public double annualPay(){
        return (super.annualPay() * 0.1) + super.annualPay();
    }

}


