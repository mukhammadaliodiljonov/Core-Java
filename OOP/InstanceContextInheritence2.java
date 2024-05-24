class W{
    W(){
        System.out.println("W-Con");
    }
    int i = m1();
    int m1(){
        System.out.println("m1-A");
        return 10;
    }
    {
        System.out.println("IB-A");
    }
}

class E extends W{
    {
        System.out.println("IE-W");
    }
    int j = m2();
    int m2(){
        System.out.println("m2-B");
        return 20;
    }
    E(){
        System.out.println("B-Con");
    }

}

class D extends E{
    int k = m3();
    int m3(){
        System.out.println("m3-C");
        return 30;
    }
    D(){
        System.out.println("D-Con");
    }
    {
        System.out.println("IB-D");
    }
}

public class InstanceContextInheritence2 {
    public static void main(String[] args){
        D d = new D();
    }
}
