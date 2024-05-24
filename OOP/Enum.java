enum Apple{

    A(345),B(111),C(233);
    int price;

    Apple(int price){
        this.price=price;
    }
public int getPrice(){
        return price;
}

}

public class Enum  {
    public static void main(String [] args){
        System.out.println("A-Grade Apple :"+Apple.A.getPrice());
        System.out.println("B-Grade Apple :"+Apple.B.getPrice());
        System.out.println("C-Grade Apple :"+Apple.C.getPrice());

    }
}
