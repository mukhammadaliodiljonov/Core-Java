class D{
    int i = 10;
    void m1(){
        System.out.println("m1-D");
    }
}
class F extends D{
    int j = 20;
    void m2(){
        System.out.println("m2-F");
    }
}
class W extends F{
    void m3(){
        System.out.println(i);
        System.out.println(j);
        m1();
        m2();
    }
}
public class Multi_Level_Inheritence {
    public static void main(String[] args){
        W w = new W();
        w.m3();
    }
}
