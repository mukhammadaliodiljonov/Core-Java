import java.util.jar.JarOutputStream;

public class WrapperClasses {
    public static void main(String[] args) {
        //Conversions from Primitive type to Object type
        System.out.println("Conversions from Primitive type to Object type");
        //By using Constructor
        int i = 10;
        Integer in = new Integer(i);
        System.out.println(i+" "+in);
        //By using value of method from Wrapper Classes
        int j= 10;
        Integer in1 = Integer.valueOf(j);
        System.out.println(j+" "+in1);
        //By using Auto-Boxing Mechamism
        int k = 10;
        Integer in2 = i;
        System.out.println(k+" "+in2);

        //Conversions from Object type to Primitive type
        System.out.println("Conversions from Object type to Primitive type");
        //By using XXX value method from Wrapper classes
        Integer intg = new Integer(10);
        int m = intg.intValue();
        System.out.println(intg+" "+m);
        //By using Auto-Unboxing Mechanism
        Integer l = new Integer(10);
        Integer intg2 = l;
        System.out.println(intg2+" "+l);

        //Conversion from String type to Object type
        System.out.println("Conversion from String type to Object type");
        //By using String Parametrized Constructor
        String str = "10"; // only numeric data
        int n = new Integer(str);
        System.out.println(n+" "+str);
        //By using static valueOf() method from wrapper classes
        String str2 = "10";
        int on3 = Integer.valueOf(str);
        System.out.println(on3+" "+str);

        //Conversion from Object Type to String type
        System.out.println("Conversion from Object Type to String type");
        //By using toString() method from Wrapper classes
        Integer on4 = new Integer(10);
        String str4 = on4.toString();
        System.out.println(on4+" "+str4);
        //By using '+' concatination operator:
        Integer in5 = new Integer(10);
        String str5 = ""+in5;
        System.out.println(str5+" "+in5);

        //Conversion from Primtive type to String type
        System.out.println("Conversion from Primtive type to String type");
        //By using static toString() meethod from Wrapper classes
        int f = 10;
        String str6 = Integer.toString(f);
        System.out.println(str6+" "+f);
        //By uding '+' concatination Operator
        int d = 10;
        String str7 = ""+d;
        System.out.println(str7+" "+d);

        //Conversion from String type to Primitive type
        System.out.println("Conversion from String type to Primitive type");
        //By using parseXXX method from wrapper classes
        String str8 = "10";
        int s = Integer.parseInt(str8);
        System.out.println(str8+" "+s );

    }
}
