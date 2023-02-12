package problem2;

public class IPhone extends AppleDevice{

    private final String generation;

    public IPhone(String name, double price, long serialNumber, String generation){
        super(name, price, serialNumber);
        this.generation = generation;
    }

    public String getGeneration(){
        return this.generation;
    }

    @Override
    public String toString(){
        return super.toString() + " " + this.generation;
    }
}
