class A1{
    void m1()throws ArithmeticException{
        System.out.println("old functionality");
    }
}

class A2 extends A1{
    void m1() throws NullPointerException{
        System.out.println("new functionality");
    }
}
public class MethodOverridingThrowException {
    public static void main(String[] args) {
        A1 a = new A2();
        a.m1();
    }
}
