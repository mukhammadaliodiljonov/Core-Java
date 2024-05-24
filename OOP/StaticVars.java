class D{
    static int i = 10;
    int j = 20;

    void m1(){
        /*  static   */  int k = 30; //if we declare it static  we will get error it should be class level variable not local
        System.out.println("m1-A");
        System.out.println(this.i);


    }
}

public class StaticVars{
    public static void main(String [] args){
        D d = new D();
        System.out.println(d.i);
        System.out.println(D.i);
        D d1 = null;
//        System.out.println(d1.j); null pointer exception
        System.out.println(d.i);
        d.m1();



    }
}