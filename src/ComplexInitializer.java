public class ComplexInitializer {

    private static int x;
    private static int y;
    private static int z;

    static {

        x = 10;
        y = 20;
        z =  CalculateZ(x,y);
    }

    public static int CalculateZ(int a, int b ){
        return a+b*(b-a);
    }

    public static void main(String[] args) {

        System.out.println("X : "+x);
        System.out.println("Y : "+y);
        System.out.println("Z : "+z);
    }
}
