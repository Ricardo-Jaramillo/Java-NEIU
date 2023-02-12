package problem2;

public class ComplexNumber implements Comparable<ComplexNumber> {

    private final int a;
    private final int b;

    public ComplexNumber(){
        this.a = 0;
        this.b = 0;
    }

    public ComplexNumber(int a, int b){
        this.a = a;
        this.b = b;
    }

    public ComplexNumber(int a){
        this.a = a;
        this.b = 0;
    }

    @Override
    public String toString(){
        if (b >= 0){
            return a + " + " + b + "i";
        }
        else {
            return a + " - " + b * -1 + "i";
        }
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof ComplexNumber)){
            return false;
        }

        ComplexNumber cn = (ComplexNumber) o;

        return cn.a == this.a && cn.b == this.b;
    }

    @Override
    public int compareTo(ComplexNumber cn){
        return this.a - cn.a;
    }

    public static void main(String[] args) {
        ComplexNumber cn1 = new ComplexNumber();
        ComplexNumber cn2 = new ComplexNumber(5);
        ComplexNumber cn3 = new ComplexNumber(3, -2);
        ComplexNumber cn4 = new ComplexNumber(3, -2);

        System.out.println(cn1.toString());
        System.out.println(cn2.toString());
        System.out.println(cn3.toString());
        System.out.println(cn4.toString());

        System.out.println(cn1.equals(cn2));
        System.out.println(cn2.equals(cn3));
        System.out.println(cn3.equals(cn4));

        System.out.println(cn2.compareTo(cn4));
    }
}
