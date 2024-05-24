class A {
    int i = 10;
    static int j = 20;
    static
    {
        System.out.println("SB-A");
//        System.out.println(i);---> error
        System.out.println(j); // correct
        A a = new A();
        System.out.println(a.i); // now it is possible to access it
//        System.out.println(this.j); --> error
    }
}
public class StaticBlock {
    public static void main(String [] args) {
        A a = new A();

    }
}
