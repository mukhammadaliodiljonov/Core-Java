class A{
    A(){
        System.out.println("A-Con");
    }
}

class B extends A{
    B(){
        System.out.println("B-COn");
    }
}

class C extends B{
    C(){
        System.out.println("C-Con");
    }
    }


public class InstanceContextInheritence {
    public static void main(String[] args){
        C c = new C();
    }
}
