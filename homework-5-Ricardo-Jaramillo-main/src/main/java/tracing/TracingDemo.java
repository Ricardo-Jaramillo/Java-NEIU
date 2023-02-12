package tracing;

public class TracingDemo {

    /*
        -1
        4 hello
        3 what?
        10 A
        101
        -1
        23 nope
    */

    public static void main(String[] args) {
        C c1 = new C(4);
        c1.fah();
        c1.foo();

        A a1 = new A(3, "what?");
        a1.foo();

        B b1 = new B(101);
        b1.foo();
        b1.fah();

        B b2 = new B(23, "nope");
        b2.fah();
        b2.foo();
    }
}
