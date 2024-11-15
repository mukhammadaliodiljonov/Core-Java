public class Point {
    private int x;
    private int y;

    public Point(int x, int y ){
        this.x = x;
        this.y = y;
    }

    public Point(double x, double y){
        this.x=(int)x;
        this.y=(int)y;
    }

    public static void main(String [] args){
         Point p1 = new Point(2,4);
        System.out.println(p1.x+" "+ p1.y);
        System.out.println("-------------");
        Point p2 = new Point(2.3,4.7);
        System.out.println(p2.x+" "+ p2.y);
    }
}
