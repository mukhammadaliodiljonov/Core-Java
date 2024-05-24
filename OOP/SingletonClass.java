class A{
    private static A a = new A(); //null;  no object is existed we have to create
    static {
        a = new A(); // improved version
    }
    private A(){

    }
    static A getRef(){
//        if(a==null){
//            a = new A();
//        }
        return a;
    }

}
public class SingletonClass  {
    public static void main(String [] args){
        A a = A.getRef();
        A a1 = A.getRef();
        A a2 = A.getRef();

        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);
    }
}
