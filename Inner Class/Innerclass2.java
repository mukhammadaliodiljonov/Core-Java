abstract class A{
    abstract class B{
        void m1(){
            System.out.println("B.m1");
        }

        abstract void m2();
        abstract void m3();
    }

    class C extends B{
        void m2(){
            System.out.println("C.m2");
        }
        void m3(){
            System.out.println("C.m3");
        }
    }
}

class D extends A{
    //abstract class B and class are inner class to class D
}

//Interface inside an abstract class

abstract class Abstract{
    interface I{
        void m1();
        void m2();
        void m3();
    }

    class Q implements I{
       public  void m1(){
            System.out.println("Q.m1");
        }
        public void m2(){
            System.out.println("Q.m2");
        }

       public  void m3(){
            System.out.println("Q.m3");
        }
    }
}

class W extends Abstract{
    //Interface and class Q are inner class to class W
}

interface Int{
    class Z{// by default this class is public and static
        void m1(){
            System.out.println("Z.m1");
        }
        void m2(){
            System.out.println("Z.m2");
        }
        void m3(){
            System.out.println("Z.m3");
        }
    }
    abstract class D implements Int{//it is a  static class
        void m1(){
            System.out.println("D.m1");
        }
        abstract void m2();
        abstract void m3();
    }

    class C extends D{//it is a sttaic class
        void m2(){
            System.out.println("C.m2");
        }
        void m3(){
            System.out.println("C.m3");
        }
    }
}
interface I1{
    interface I2{
        void m1();
        void m2();
        void m3();
    }
    class W implements I2{//static class W
        public void m1(){
            System.out.println("W.m1");
        }
        public void m2(){
            System.out.println("W.m2");
        }
        public void m3(){
            System.out.println("W.m3");
        }
    }
}
class cls {
    void m1(){
        class B{//method local inner class
            int i = 20;
            void m2(){
                System.out.println("m2-B");
            }
            void m3(){
                System.out.println("m3-B");
            }
        }

        B b = new B();
        System.out.println(b.i);
        b.m2();
        b.m3();
    }
}
public class Innerclass2 {
    public static void main(String[] args) {

        A.B ab = new D().new C();
        ab.m1();
        ab.m2();
        ab.m3();

        System.out.println("Interface inside an abstract class");
        Abstract.I abI = new W().new Q();
        abI.m1();
        abI.m2();
        abI.m3();

        System.out.println("Inner class inside an Interface");
        Int.Z inz = new Int.Z();
        inz.m1();
        inz.m2();
        inz.m3();

        System.out.println("Abstract class inside an Interface");
        Int.D intD =new Int.C();
        intD.m1();
        intD.m2();
        intD.m3();

        System.out.println("Interface inside an Interface");
        I1.I2 i1i2 = new I1.W();
        i1i2.m1();
        i1i2.m2();
        i1i2.m3();

        System.out.println("Method local inner class");
        cls cls1 = new cls();
        cls1.m1();
    }
}
