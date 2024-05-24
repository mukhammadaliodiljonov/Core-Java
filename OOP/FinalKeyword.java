class A{ // super class must not be final
    final int i;//but if we provide a value we will get an error
    A(){
        i = 10;
    }
    public int getVal(){
        return i;
    }
    void m1(){ // if we declare final we will get error
        System.out.println("m1-A");
    }
}
 final class B extends A{// sub class can be a final class
    final void m1(){ // maybe or may not be final it will not raise an error
        System.out.println("m1-B");
    }
 }
public class FinalKeyword  {
    public static void main(String [] args){
        A a = new B();
        a.m1();
    }
}
