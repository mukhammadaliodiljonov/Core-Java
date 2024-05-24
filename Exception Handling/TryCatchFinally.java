public class TryCatchFinally {
    public static void main(String[] args) {
        try{
            int i= 10;
            int j= 0;
            float f = i/j;
        }
        catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println();
            System.out.println(e);
            System.out.println();
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Inside the finally block");
        }
    }
}
