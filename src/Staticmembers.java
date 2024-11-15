import java.util.*;

import static java.lang.StrictMath.pow;

/*
public class Staticmembers {

    static int x=0;

    public Staticmembers() {
        x++;
    }

    public static int getX() {
        return x;
    }

    public static void main(String [] args){
        Staticmembers s = new Staticmembers();
        System.out.println(Staticmembers.getX());

        Staticmembers s1 = new Staticmembers();
        System.out.println(Staticmembers.getX());
    }
}
*/


public class Staticmembers {

   /* public static int addInt(int a , int b){
        return a+b;
    }

    public static void main(String [] args){

        Staticmembers s = null;
        System.out.println(Staticmembers.addInt(3,4));
    }*/
//
//    static int InitialValue;
//    static {
//        InitialValue = 1000;
//        System.out.println("InitialValue initialized to : " + InitialValue);
//    }
//
//    public static void main(String[] args){
//
//        System.out.println("Before creating an Initialzer : InitialValue = " + InitialValue);
//
//        Staticmembers s = new Staticmembers();
//        System.out.println("After creating an Initilizer : InitialValue = " + s.InitialValue);
//    }

        static final double PI = 3.14159;
        public static double Area(double radius){
            return PI*pow(radius,2);
        }

        public static void main(String [] args){
            Staticmembers area1 = new Staticmembers();
            System.out.println("Area is : "+area1.Area(3.5));
        }
    }




