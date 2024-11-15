class A1{
    void m1(){
        System.out.println("m1-A");
    }
}

class B1 extends A1{
    void m2(){
        System.out.println("m2-B");
    }
}
public class DownCasting {
    public static void main(String [] args){
        /*
        A1 a = new A1();
        B1 b = a;
        Compilation Error
        */
        /*
        A1 a = new A1();
        B1 b = (B1) a;
        Class Cast Exception
        */
        A1 a = new B1();
        B1 b = (B1) a; //DownCasting
        b.m1();
        b.m2();


    }
}
