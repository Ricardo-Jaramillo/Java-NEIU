public class HourlyEmployee extends Employee{

    private int hoursPerWeek;
    private double hourlyWage;

    public HourlyEmployee(String name, int hireYear){
        super(name, hireYear);
    }

    public void setHoursPerWeek(int hoursPerWeek){
        this.hoursPerWeek = hoursPerWeek;
    }

    public void setHourlyWage(double hourlyWage){
        this.hourlyWage = hourlyWage;
    }

    @Override
    public double monthlyPay(){
        return this.hourlyWage * 4 * this.hoursPerWeek;
    }
}
