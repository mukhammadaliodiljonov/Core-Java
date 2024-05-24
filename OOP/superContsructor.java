class Q1{
    Q1(){
        System.out.println("A-con");
    }
    Q1(int i){
        System.out.println("A-int-Param_Con");
    }
}

class W extends Q1{
    W(){
        System.out.println("B-Con");
    }
}
public class superContsructor {
    public static void main(String[]args){
        Q1 q = new Q1();
    }
}
