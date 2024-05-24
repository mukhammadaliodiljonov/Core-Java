abstract class A3{
    A3(){
        System.out.println("Constructor-A3");
    }
}
class B3 extends A3{
    B3(){
        System.out.println("Constructor-B3");
    }
}
public class AbstractClassConstructor {
    public static void main(String[] args) {
        B3 b = new B3();

    }
}
