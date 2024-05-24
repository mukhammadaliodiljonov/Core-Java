abstract class A1 {
    void m1(){
        System.out.println("m1.A1");
    }
    void m2(){
        System.out.println("m2.A1");
    }
    void m3(){
        System.out.println("m3.A1");
    }
}

class B1 extends A1 {

}
public class AbstractClass1 {
    public static void main(String[] args) {
        A1 a = new B1();
        a.m1();
        a.m2();
        a.m3();
        //it is possibl to create abstract class without absrtact methods
    }
}
