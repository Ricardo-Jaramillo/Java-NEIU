package tracing;

public class A {

    private int x;
    private String s;

    public A() {
        this.x = 10;
        this.s = "A";
    }

    public A(int x, String s) {
        this.x = x;
        this.s = s;
    }

    public void foo() {
        System.out.println(this.x + " " + this.s);
    }
}
