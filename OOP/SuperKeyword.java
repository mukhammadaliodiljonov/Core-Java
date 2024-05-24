class First {
    int i = 10;
    int j = 20;
}

class Second extends First{
    int i = 30;
    int j = 40;

    Second(int i, int j){
        System.out.println(super.i+"    "+super.j);
    }
}
public class SuperKeyword {
    public static void main(String [] args){
        Second second = new Second(30,40);
    }
}
