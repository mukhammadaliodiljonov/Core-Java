class DifferentOuterClass{
    void m4(){
        System.out.println("m4-DifferentOuterClass");
    }
    class DifferentInnerClass extends DifferentOuterClass{
        void m5(){
            System.out.println("m5-DifferentInnerClass");
        }//we can apply Inheritence for the immediate outer class
    }
}
class A {
    int i = 10;
    void m1(){
        System.out.println("m1-A");
    }
    class B extends DifferentOuterClass {

        int j = 20;
        final static int k = 30; // we can use static keyword along with final keyword
        void m2(){
            System.out.println("m2-B");
            System.out.println(i);
            m1();
            //we can access Outer class varaiables and methods inside the inner class but Inner class method and variables are not accessible inside the Outer class
        }

    }

    class C extends B{
        int m = 40;
        void m3(){
            System.out.println("m3-C");
            System.out.println(j);
            System.out.println(i);
            m2();
            m1();
        }
    }
}

class F{
    interface I{
        void interfaceM1();
        void interfaceM2();
        void interfaceM3();
    }

    class H implements I{
        public void interfaceM1(){
            System.out.println("interfaceM1-H");
        }

        public void interfaceM2(){
            System.out.println("interfaceM2-H");
        }

        public void interfaceM3(){
            System.out.println("interfaceM3-H");
        }
    }//We can apply Interface Inside the inner class
    // but interface and inside class should be in the same outer class
}

class Abstract{//Abstract class inside a class
    abstract class V{
        void abstractM1(){
            System.out.println("abstractM1-V");
        }

        abstract void abstractM2();
        abstract void abstractM3();
    }

    class X extends V{
        void abstractM2(){
            System.out.println("abstactM2-X");
        }
        void abstractM3(){
            System.out.println("abstactM3-X");
        }
    }
}

abstract class Y{//Declaring a class inside an abstract class
    class U{
        void uM1(){
            System.out.println("m1-U");
        }

        void uM2(){
            System.out.println("m2-U");
        }

        void uM3(){
            System.out.println("m3-U");
        }
    }
}


class S extends Y{
    //class U is coming form abstract class Y as a member inner class
}
public class InnerClass {
    public static void main(String[] args) {
        DifferentOuterClass.DifferentInnerClass difoutIn = new DifferentOuterClass().new DifferentInnerClass();
        difoutIn.m4();
        difoutIn.m5();

        A a = new A();
        a.m1();

        A.B ab = new A().new B();
        System.out.println(ab.j);
        ab.m2();
        ab.m4();//This is an differnt outer class method we can use it with Inheritence

        A.B ab1 = a.new B();
        System.out.println(ab1.j);
        ab1.m2();
        System.out.println("Inheritence Inner class");
        A.C ac = new A().new C();
        ac.m2();
        ac.m3();
        System.out.println(ac.m);
        System.out.println(ac.j);

        System.out.println("Interfcae");
        F.I hi = new F().new H();
        hi.interfaceM1();
        hi.interfaceM2();
        hi.interfaceM3();

        System.out.println("Abstract class");
        Abstract.V abstV = new Abstract().new X();
        abstV.abstractM1();
        abstV.abstractM2();
        abstV.abstractM3();

        System.out.println("Abstract outer class");
        Y.U yu = new S().new U();
        yu.uM1();
        yu.uM2();
        yu.uM3();

    }
}
