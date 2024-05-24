class Outer{
    static int j = 20;
    static void m3(){//Only static members of the Outer class are available to Inner class
        System.out.println("Outer m3");
    }

    int k = 20;
    static class Inner{
        int i = 10;
        void m1(){
            System.out.println("Inner m1");
        }
        static void m2(){
            System.out.println("Inner m2");
            m3();
            System.out.println(j);
        }

    }
}
public class StaticInnerClass {
    public static void main(String[] args) {
        Outer.Inner i = new Outer.Inner();
        System.out.println(i.i);
        i.m1();
        i.m2();
        Outer.Inner.m2();

    }
}
