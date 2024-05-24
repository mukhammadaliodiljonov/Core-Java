import java.util.StringTokenizer;

public class Stringbuffer {
    public static void main(String[] args) {
        String str = new String("Durga ");//immutable or unchangeable
        String str1 = str.concat("Software ");
        String str2 = str1.concat("Solutions");
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        StringBuffer sb = new StringBuffer("Durga ");
        StringBuffer sb1 = sb.append("Software ");
        StringBuffer sb2 = sb1.append("Solutions");
        System.out.println(sb);
        System.out.println(sb1);
        System.out.println(sb2);

        //StringBuffer Class Constructors
        StringBuffer sb3 = new StringBuffer(23);
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());

        StringBuffer sb4 = new StringBuffer("Durga  Solutions");
        System.out.println(sb4.length());
        System.out.println(sb4.capacity());// 16 + length of the data

        //StringBuffer class Methods

        System.out.println(sb4.length());//size of the data
        System.out.println(sb4.capacity());
        System.out.println(sb4.toString());//return the content of the data
        sb4.ensureCapacity(17);
        // if it is between 0 and 16 it will set the capacity 16
        // if it is between 16 and 34 it will set the capacity 34
        // if it is over 34 it will set the specified value as a capacity
        System.out.println(sb4.capacity());

        System.out.println(sb4.reverse());

        String str5 = new String("Hello");
        StringBuffer stb = new StringBuffer(str5);
        stb.reverse();
        // Here we are converting String data to reverse order first we are convertng it into StringBuffer then we are using reverse()

        sb4.insert(6,"software");
        System.out.println(sb4);
        System.out.println(sb4.delete(1,5));//start index , end index-

        StringBuffer set  = new StringBuffer("Salom");
        System.out.println(set.deleteCharAt(1));// if the specified content is not existed JVM will raise an exception
        System.out.println(set.replace(1,3,"ALO"));// end index -1 ;
        set.setLength(34);
        System.out.println(set.length());// set the specified length to the object
        System.out.println(set); // it will provide only upto the specified length
        set.setCharAt(4,'M');
        System.out.println(set);

        //         StringBuilder
        // it is same as StringBuffer
        // StringBuilder COnstructors

        StringBuilder std = new StringBuilder(); //deafult capacity is 16
        System.out.println(std.capacity());

        StringBuilder std1 = new StringBuilder(20);
        System.out.println(std1.capacity());

        StringBuilder std2 = new StringBuilder("abc");
        System.out.println(std2);//toString() method is overriden
        System.out.println(std2.capacity());// initial capacity + length()

        //StringBuilder methods
        // it has same methods as StringBuffer
        System.out.println(std2.capacity());
        std2.ensureCapacity(35);
        System.out.println(std2.capacity());
        System.out.println(std2.append(" def"));
        System.out.println(std2.reverse());
        System.out.println(std2.insert(6,"gh"));
        //....... same functions as StringBuffer

        //               StringTokenizer

        StringTokenizer tok = new StringTokenizer("Hello-World","-");
        int count = tok.countTokens();
        while(tok.hasMoreTokens()){
            System.out.println(tok.nextToken());
        }


    }
}
