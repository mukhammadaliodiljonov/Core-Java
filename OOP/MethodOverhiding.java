class A{
    protected void m1(){
        System.out.println("Old functionality");
    }
}

class B extends A{
    public void m1(){
        System.out.println("New functionality");
    }
}
public class MethodOverhiding {
    public static void main(String[] args) {
        A a = new B();
        a.m1();
    }
}
