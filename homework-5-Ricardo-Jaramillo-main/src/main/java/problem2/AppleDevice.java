package problem2;

public class AppleDevice {

    private final String name;
    private double price;
    private final long serialNumber;

    public AppleDevice(String name, double price, long serialNumber){
        this.name = name;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    @Override
    public String toString(){
        return this.name + " " + this.serialNumber;
    }

}
