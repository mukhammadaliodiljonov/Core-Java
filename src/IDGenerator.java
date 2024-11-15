public class IDGenerator {
    public static int NextID=1;

    public static int GererateNextId(){
        return NextID++;
    }

    public static void main(String [] args){
        IDGenerator id = new IDGenerator();
        System.out.println("ID: " + id.GererateNextId(  ));
    }

}
