abstract class A2{
    abstract void m1();
    abstract void m2();
    abstract void m3();
}

abstract  class B2 extends A2 {
    void m1() {
        System.out.println("m1.B");
    }
}
class C2 extends B2{
    void m2(){
        System.out.println("m2.C");
    }
    void m3(){
        System.out.println("m3.C ");
    }
}
public class AbstractClass2 {
    public static void main(String[] args) {
        A2 a = new C2();
        a.m1();
        a.m2();
        a.m3();
    }
}
