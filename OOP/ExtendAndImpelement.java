interface I6{
    void m1();
    void m2();
}

class A5{
    void m3(){
        System.out.println("m3-A5");
    }
}

class B5 extends A5 implements I6{//order should be first extends then implement
    public void m1(){
        System.out.println("m1-B5");
    }
    public void m2(){
        System.out.println("m2-B5");
    }
}
public class ExtendAndImpelement {
    public static void main(String[] args) {
        I6 i = new B5();
        i.m1();
        i.m2();

        A5 a = new B5();
        a.m3();

        B5 b = new B5();
        b.m1();
        b.m2();
        b.m3();
    }
}
