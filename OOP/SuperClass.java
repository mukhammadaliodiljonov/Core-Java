class A1{
    void m1(){
        System.out.println("m1-A");
    }
}

class B1 extends A1{
    void m2(){
        System.out.println("m2-B");
        m1();
        super.m1();
    }
    void m1(){
        System.out.println("m1-B");
    }
}
public class SuperClass {
    public static void main(String [] args){
        B1 b1 = new B1();
        b1.m2();

    }
}
