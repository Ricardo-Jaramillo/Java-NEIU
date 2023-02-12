public class FullTime extends HourlyEmployee{

    public FullTime(String name, int hireYear){
        super(name, hireYear);
    }

    @Override
    public double annualPay(){
        return 52 * (super.monthlyPay() / 4);
    }
}
