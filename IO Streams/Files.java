import java.io.*;

public class Files {
    public static void main(String[] args) throws Exception{
//        File file = new File("welcome.txt");
//        System.out.println("File is created....");
//        System.out.println(file.isFile());
//        System.out.println(file.createNewFile());
//        System.out.println(file.isFile());
//        System.out.println(file.getName());
//        System.out.println(file.getParent());
//        System.out.println(file.getAbsoluteFile());
        File file = new File("welcome.txt");
        file.createNewFile();
//        FileOutputStream fos = new FileOutputStream(file);
//        String data ="Hello World";
//        byte[] b = data.getBytes();
//        fos.write(b);
//        System.out.println("Data written to file");
//
//        FileInputStream fis = new FileInputStream(file);
//        int size = fis.available();
//        byte[] buffer = new byte[size];
//        fis.read(buffer);
//        String data = new String(buffer);
//        System.out.println(data);
//
//        FileWriter fw = new FileWriter(file);
//        String data = "Welcome to Java!";
//        char [] ch = data.toCharArray();
//        fw.write(ch);
//        fw.close();
//
//        FileReader fr = new FileReader(file);
//        String data1 ="";
//        int val= fr.read();
//        while(fr.read()!=-1){
//            data1 += (char)fr.read();
//            val= fr.read();
//        }
//        System.out.println(data1);
//        fr.close();
//        File f = new File("welcome");
//        f.mkdir();
//        System.out.println(f.isDirectory());
//        System.out.println(f.getName());
//        System.out.println(f.getParent());
//        System.out.println(f.getAbsolutePath();
        RandomAccessFile file2 = new RandomAccessFile("welcome.txt","rw");
        file2.writeUTF("Durga");
        file2.writeInt(111);
        file2.seek(0);
        System.out.println("Employee Details");
        System.out.println("-----------------");
        System.out.println("Employee Name: " + file2.readUTF());
        System.out.println("Employee No  : " + file2.readInt());

    }
}
