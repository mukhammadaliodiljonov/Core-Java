class A{
    static {
        System.out.println("SB-A");
    }
    static int m1(){
        System.out.println("m1-A");
        return 10;
    }
    static int i = m1();
    A(){
        System.out.println("A-Con");
    }
    {
        System.out.println("IB-A");
    }
    int m2(){
        System.out.println("m1-A");
        return 20;
    }

    int j = m2();
}

class B extends A{
    static {
        System.out.println("SB-B");
    }
    {
        System.out.println("IB-B");
    }
    static int m3(){
        System.out.println("m3-B");
        return 30;
    }
    int m4(){
        System.out.println("m4-B");
        return 40;
    }
    static int k = m3();
    int l = m4();
    B(){
        System.out.println("B-Con");
    }

    int m2(){
        System.out.println("m2-B");
        return 20;
    }
    int j = m2();
}

class C extends B{
    C(){
        System.out.println("C-Con");
    }
    int m5(){
        System.out.println("m5-C");
        return 50;
    }
    static {
        System.out.println("SB-C");
    }
    int m = m5();
    static int m6(){
        System.out.println("m6-C");
        return 60;
    }
    static int n = m6();
    {
        System.out.println("IB-C");
    }
}
public class InstanceAndStaticContextInheritence3    {
    public static void main(String[] args){
        C c1 = new C();
        System.out.println();
        C c2 = new C();
    }
}
