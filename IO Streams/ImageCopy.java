import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {
    public static void main(String [] args)throws IOException{
                FileInputStream fis = new FileInputStream("C:\\Users\\odilj\\IdeaProjects\\Claer\\src\\OIP.jpeg");
                int size = fis.available();
                byte[] b = new byte[size];
                fis.read(b);
                fis.close();

                FileOutputStream fos = new FileOutputStream("Chelsea.jpeg");
                fos.write(b);
                System.out.println("Image is copied");
                fos.close();
            }
        }



