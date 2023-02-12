public class Employee {

    private String name;
    private int hireYear;

    public Employee(String name, int hireYear){
        this.name = name;
        this.hireYear = hireYear;
    }

    public double monthlyPay(){
        return 0;
    }

    public double annualPay(){
        return 0;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + " Hired: " + this.hireYear;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Employee)){
            return false;
        }
        Employee e = (Employee) obj;
        return this.monthlyPay() == e.monthlyPay() && this.annualPay() == e.annualPay();
    }
}
