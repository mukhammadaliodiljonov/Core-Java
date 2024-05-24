interface  I{
    int x = 10; //public static final
    void m1();//public abstract
    void m2();//public abstract
    void m3();//public abstract
}

class A implements I{
    public void m1(){
        System.out.println("m1-A");
    }

    public void m2(){
        System.out.println("m2-A");
    }

    public void m3(){
        System.out.println("m3-A");
    }
    public void m4(){
        System.out.println("m4-A");
    }

}
public class Interfaces {
    public static void main(String[] args) {
        I i = new A();
        i.m1();
        i.m2();
        i.m3();
    //  i.m4();------> error
        System.out.println(I.x);//by using interface name
        System.out.println(i.x);//by using interface referance name
        System.out.println();
        // or we can creteate refrence var for imlementation

        A a = new A();
        a.m1();
        a.m2();
        a.m3();
        a.m4();
        System.out.println(A.x);//by using implementation class name
        System.out.println(a.x);//by using implementation class reference value
    }
}
