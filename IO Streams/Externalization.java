import java.io.*;

class Student implements Externalizable{
    String id;
    String name;
    String email;
    String phone;
    public Student(String id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    public Student() {

    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("From write External() Method");
        try{
            String [] str1 = id.split("-");
            int rollNo = Integer.parseInt(str1[1]);

            String [] str2 = email.split("@");
            String email = str2[0];

            String [] str3 = phone.split("-");
            long mobileNo = Long.parseLong(str3[1]);

            out.writeInt(rollNo);
            out.writeUTF(name);
            out.writeUTF(email);
            out.writeLong(mobileNo);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("From readExternal() Method");
        id = "DSS"+in.readInt();
        name=in.readUTF();
        email=in.readUTF()+"@dss.com";
        phone="91-"+in.readLong();
    }

    public void getStudentDetails(){
        System.out.println("Student details");
        System.out.println("-------------------");
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }
}
public class Externalization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("student.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Student s1 = new Student("DS-111","Durga","durga@dss.com","91-111");
        System.out.println("Student details before Serialization");
        oos.writeObject(s1);
        System.out.println();

        FileInputStream fis = new FileInputStream("student.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student s2 = (Student) ois.readObject();
        System.out.println("Student details after Deserialization");
        s2.getStudentDetails();
    }
}
