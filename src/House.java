public class House {
    public void Area(){
         class Room{
            public int getArea(int length, int width){
                return length * width;
            }
        }
        Room r = new Room();
        System.out.println(r.getArea(11,11));
    }

    public static void main(String[] args) {
        House h = new House();
        h.Area();
    }
}
