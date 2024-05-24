class D{
    int i = 10;
    static int j = 10;

}

public class StaticVars1{
    public static void main(String [] args){
        D d = new D();
        System.out.println(d.i + " "+d.j);
        d.i = d.i+1;
        d.j = d.j+1;
        System.out.println(d.i + " "+d.j);
        D d1 = new D();
        System.out.println(d1.i + " "+d1.j);
        d1.i = d1.i+1;
        d1.j = d1.j+1;
        System.out.println(d1.i + " "+d1.j);
        D d2 = new D();
        System.out.println(d2.i + " "+d2.j);
        d2.i = d2.i+1;
        d2.j = d2.j+1;
        System.out.println(d2.i + " "+d2.j);
        System.out.println();
        System.out.println(d.i + " "+d.j);
        System.out.println(d1.i + " "+d1.j);
        System.out.println(d2.i + " "+d2.j);



    }
}