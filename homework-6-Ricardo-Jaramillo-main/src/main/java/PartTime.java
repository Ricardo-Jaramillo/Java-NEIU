public class PartTime extends HourlyEmployee{

    public PartTime(String name, int hireYear){
        super(name, hireYear);
    }

    @Override
    public double annualPay(){
        return 50 * (super.monthlyPay() / 4);
    }
}
