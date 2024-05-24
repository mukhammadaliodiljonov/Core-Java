class A4{
    void m1(){
        System.out.println("A4.m1");
    }
}
abstract class B4 extends A4{
    abstract void m2();
}
class C4 extends B4{
    void m2(){
        System.out.println("C4.m3");
    }
}
public class AbstractClassExtendsFromConcreate {
    public static void main(String[] args) {
        A4 a = new C4();
        a.m1();
        B4 b = new C4();
        b.m1();
        b.m2();
        C4 c = new C4();
        c.m1();
        c.m2();f
    }
}
