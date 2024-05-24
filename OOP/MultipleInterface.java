interface I1{
    void m1();
}
interface I2{
    void m2();
}
interface I3{
    void m3();
}
class A1 implements I1, I2, I3{
    public void m1() {
        System.out.println("A.m1");
    }
    public void m2() {
        System.out.println("A.m2");
    }
    public void m3() {
        System.out.println("A.m3");
    }
}
public class MultipleInterface {
    public static void main(String[] args) {
        I1 i1 = new A1();
        i1.m1();
        System.out.println();
        I2 i2 = new A1();
        i2.m2();
        System.out.println();
        I3 i3 = new A1();
        i3.m3();
        System.out.println();
        A1 a1 = new A1();
        a1.m1();
        a1.m2();
        a1.m3();

    }

}
