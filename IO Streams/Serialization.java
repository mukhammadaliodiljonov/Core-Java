import org.w3c.dom.ls.LSOutput;

import java.io.*;

class Employee implements Serializable{
    private String eno;
    private String ename;
    private float esal;
    transient private String eaddr;

    public Employee(String eno, String ename, float esal, String eaddr) {
        this.eno = eno;
        this.ename = ename;
        this.esal = esal;
        this.eaddr = eaddr;
    }

    public void getEmpDetails(){
        System.out.println("Employee Deatils");
        System.out.println("----------------");
        System.out.println("Employee Number   :"+eno);
        System.out.println("Employee Name     :"+ename);
        System.out.println("Employee Salary   :"+esal);
        System.out.println("Employee Address  :"+eaddr);
    }
}

public class Serialization {
    public static void main(String[] args)throws Exception {
        FileOutputStream fos = new FileOutputStream("emp.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Employee emp1 = new Employee("111","AAA",5000,"Hyd");
        System.out.println("Employee Deatils before serialization");
        emp1.getEmpDetails();
        oos.writeObject(emp1);
        System.out.println();

        FileInputStream fis = new FileInputStream("emp.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee emp2 =(Employee) ois.readObject();
        System.out.println("Employee Deatils after serialization");
        emp2.getEmpDetails();


    }
}
