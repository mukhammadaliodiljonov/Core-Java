interface Q{
    void m1();
}
interface W{
    void m2();
}

interface E extends Q,W{
    void m3();
}

class D implements E{
    public void m1(){
        System.out.println("m1-A");
    }
    public void m2(){
        System.out.println("m2-A");
    }
    public void m3(){
        System.out.println("m3-A");
    }
}

public class MoreThanOneInterfaceExtend {
    public static void main(String[] args) {
        Q q = new D();
        q.m1();

        W w = new D();
        w.m2();

        E e = new D();
        e.m1();
        e.m2();
        e.m3();

    }
}
