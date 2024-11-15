class A{
    void m1(){
        System.out.println("m1-A");
    }
}

class B extends A{
    void m2(){
        System.out.println("m2-B");
    }
}
public class UpCasting {
    public static void main(String[] args) {
        B b = new B();
        A a = b;//Upcasting
        a.m1();

        A a1 = new B();//Upcasting
        a1.m1();
    }
}

