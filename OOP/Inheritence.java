class A{
    int i = 10;
    void m1(){
        System.out.println("m1-A");
    }
}

class B extends A{  //Inheritence
    int j = 20;
    void m2(){
        System.out.println("m2-B");
    }

}
public class Inheritence {
    public static void main(String[] args){
        A a = new A();
        System.out.println(a.i);
        a.m1();

        B b = new B();
        System.out.println(b.j);
        b.m2();
        System.out.println(a.i);
        a.m1();
    }
}
