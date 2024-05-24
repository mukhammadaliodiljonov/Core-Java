import java.io.IOException;
import java.nio.charset.Charset;

public class StringClass {
    public static void main(String[] args) throws IOException {
        String str = new String(); //0 arg constructor
        System.out.println(str);
        System.out.println(str.hashCode());

        String str2 = new String("Hello world");
        System.out.println(str2);
        System.out.println(str2.hashCode());

        String str3 = "Hello world"; //String Literal and  String object wiil be created in String Constant Pool areaff
        String str4 = "Hello world";
        System.out.println(str3 == str4);//both ref values are same
        byte [] b = {65,66,67,68,69};
        String str7 = new String(b);
        System.out.println(str7);

        byte [] b2 = {65,66,67,68,69,70,71,72};
        String str8 = new String(b2,3,4); // constructor used to convert from byte array to String
        System.out.println(str8);

        char [] c = {'A','B','C','D','E','F'};
        String str9 = new String(c);
        System.out.println(str9);

        char [] c2 = {'A','B','C','D','E','F'};
        String str10 = new String(c2,3,3);//convert data from char array to stringf
        System.out.println(str10);

        StringBuffer sb = new StringBuffer("Hello world");
        System.out.println(sb);

        StringBuffer sb2 = new StringBuffer(sb);
        System.out.println(sb2);

        StringBuilder sb3 = new StringBuilder("Hello world");
        System.out.println(sb3);
        StringBuffer sb4 = new StringBuffer(sb3);
        System.out.println(sb4);

        byte [] b1 = {65,66,67,68,69,70,71,72};
        String str11 = new String(b1,Charset.defaultCharset());
        System.out.println(str11);

        byte [] b3 = {65,66,67,68,69,70,71,72};
        String str12 = new String(b1,3,3, Charset.defaultCharset());
        System.out.println(str12);

        byte[] b4 = {65,66,67,68,69,70};
        String str14 = new String(b4,"UTF-8");
        System.out.println(str14);

        byte[] b5 = {65,66,67,68,69,70};
        String str15 = new String(b5,1,4,"UTF-8");
        System.out.println(str15);

        //String methods
        String str16 = new String("Assalomu Alyakum");
        System.out.println(str16.length());

        String sz1 = new String("Durga");
        String sz2 = sz1.concat(" Software");
        String sz3 = sz2.concat(" Solutions");
        System.out.println(sz3);
        String sc = "Durga".concat(" Software ").concat("Solutions");
        String sc2 = "Durga"+"Software"+"Solutions";
        //..........ff

        String strd = new String("Durga");
        String strd2 = new String("Durga");
        String strd3 = new String("Software");
        System.out.println(strd.equals(strd2));//true bcs it compares the content
        System.out.println(strd==strd2);//false bbcs it compares the reference value

        String st = new String("durga");
        String st1 = new String("def");
        String st2 = new String("durga");
        System.out.println(st.equals(st2));//case sensitive
        System.out.println(st.equalsIgnoreCase(st2));//case insensitive
        System.out.println(st.compareTo(st2));//check wheter two string object contents are provided as per dictionary order or not
        System.out.println(st.compareTo(st1));

        String string = new String("Durga Software Solutions");
        System.out.println(string.startsWith("Durga"));
        System.out.println(string.startsWith("Solutions"));
        System.out.println(string.endsWith("Solutions"));
        System.out.println(string.endsWith("Durga"));
        System.out.println(string.contains("Software"));
        System.out.println(string.contains("Durga"));
        System.out.println(string.contains("Solutions"));
        System.out.println(string.contains("Nag"));// all are comparison related methods
        System.out.println(string.charAt(3));//charAt() method if we provide - or out of number we will get exception
        System.out.println(string);
        System.out.println(string.replace("Durga","Andijon"));
        System.out.println(string.replace('S','s'));
        System.out.println(string.replaceFirst("S","s"));//replace only first occcurance
        System.out.println(string.indexOf("S"));
        System.out.println(string.indexOf("S",11));//strat looking for the string after from specified index
        System.out.println(string.indexOf("So"));//first occurance
        System.out.println(string.lastIndexOf("S"));//last index of String
        System.out.println(string.lastIndexOf("a",10));
        System.out.println(string.substring(6));
        System.out.println(string.substring(1,13));//last index will not be included
        System.out.println("split function");
        String soz = new String("Durga Software Solutions");
        System.out.println(soz);
        String [] strArray = soz.split(" ",3);//it will apply limit -1 times
        for(String s : strArray){
            System.out.println(s);
        }
        byte [] byteArray = soz.getBytes();
        for (byte q : byteArray){
            System.out.println(q+" ------> "+(char)q);
        }
        byte [] byteArray1 = soz.getBytes(Charset.defaultCharset()); // or "UTF-8');
        for (byte q : byteArray1){
            System.out.println(q);
        }
        char [] charArray = soz.toCharArray(); // convert from String to Char
        for (char q : charArray){
            System.out.println(q);
        }
        System.out.println(soz.trim()); // it removes the spaces before and after the spaces
        System.out.println(soz.toLowerCase());
        System.out.println(soz.toUpperCase());

        String wer = "Durga";
        String wer2 = new String("Durga");
        String wer3 = wer2.intern();
        System.out.println(wer==wer3);


    }
}
