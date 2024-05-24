interface Inter{
    int x = 10;

    void m1();
    void m2();
    void m3();
}

class cls implements Inter{
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
public class Interface {
    public static void main(String [] args){
        Inter intr = new cls();
        intr.m1();
        intr.m2();
        intr.m3();
        //intr.m4() ---> error


        cls w = new cls();
        w.m1();
        w.m2();
        w.m3();
        w.m4();
        System.out.println(intr.x);//by using interface
        System.out.println(intr.x);//by using object of interface
        System.out.println(cls.x);//by using class
        System.out.println(w.x);//accessing by using object of implemented class A
    }
}
