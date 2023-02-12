package tracing;

public class B extends A{

    private int z;

    public B(int a, String b){
        super(a, b);
        this.z = -1;
    }

    public B(int c){
        super();
        this.z = c;
    }

    public void fah(){
        System.out.println(this.z);
    }
}
