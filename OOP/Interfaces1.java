interface Intr{
    void m1();
    void m2();
    void m3();
}

abstract class A4 implements Intr{
    public void m1() {
        System.out.println("m1-A4");
    }
}
class B4 extends A4{
    public void m2() {
        System.out.println("m2-B4");
    }
    public void m3() {
        System.out.println("m3-B4");
    }
}
public class Interfaces1 {
    public static void main(String[] args) {
        Intr i = new B4();
        i.m1();
        i.m2();
        i.m3();

        A4 a = new B4();
        a.m1();
        a.m2();
        a.m3();

        B4 b = new B4();
        b.m1();
        b.m2();
        b.m3();

    }
}
