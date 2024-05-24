import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Test {
    public static void main(String[] args) throws Exception {
        /*
        FileInputStream fis2 = new FileInputStream("C:\\Users\\odilj\\Downloads\\Description about the lists.docx");
        int size = fis2.available();
        byte[] b = new byte[size];
        fis2.read(b);
        fis2.close();

        FileOutputStream fos = new FileOutputStream("New Docx file");
        fos.write(b);
        System.out.println("Copying data into new docx file");
        fos.close();
         */

        FileReader fr = new FileReader("C:\\\\Users\\\\odilj\\\\Downloads\\\\Description about the lists.docx");
        String data ="";
        int val = fr.read();
        while(val != -1){
            data += (char)val;
            val = fr.read();
        }
        fr.close();


        FileWriter fw = new FileWriter("My docx file");
        char [] ch = data.toCharArray();
        fw.write(ch);
        System.out.println("File written docx file");
        fw.close();
    }
}
