class A{
    static {
        System.out.println("Class Loading");
    }
    A(){
        System.out.println("Object Creating");
    }

}
public class Class_forName  {
    public static void main(String [] args)throws Exception {
        Class c = Class.forName ("A");
        System.out.println(c.getName()  );
    }
}
