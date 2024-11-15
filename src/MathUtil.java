public class MathUtil {
    static class Calculator{
        public static int add(int a, int b){
            return a+b;
        }
    }

    public static void main(String[] args) {

    int sum = MathUtil.Calculator.add(3,4);
    System.out.println(sum);
    }
}
