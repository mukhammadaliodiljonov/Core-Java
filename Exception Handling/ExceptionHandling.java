import java.io.IOException;
class A{
    void add()throws Exception{
        concat();
    }
    void concat()throws IOException{
        throw new IOException("My IOException");

    }
}

class Employee1{
    static {
        System.out.println("Employee claaa is loading...");
    }
    Employee1(){
        System.out.println("Employee class is creating...");
    }
}
class Student{
    String sid;
    String name;
    int marks;
    String address;

    Student(String sid, String name, int marks, String address){
        this.sid = sid;
        this.name = name;
        this.marks = marks;
        this.address = address;
    }

    public void getStatus(){
        System.out.println("Student Detials");
        System.out.println("---------------");
        System.out.println("sid     : " + sid);
        System.out.println("name    : " + name);
        System.out.println("marks   : " + marks);
        System.out.println("address : " + address);
        String status="";
        if(marks>0 && marks<30){
            status="Fail";
        }
        else if(marks>=30 && marks<50){
            status="Third Class";
        }
        else if(marks>50 && marks<60){
            status="Second Class";
        }
        else if(marks>=60 && marks<70){
            status="First Class";
        }
        else if(marks>=70 && marks<=100){
            status="Last Class";
        }
        else {
            throw new RuntimeException("invalid marks");
        }

        System.out.println(status);
    }

}
public class ExceptionHandling {
    public static void main(String [] args)throws Throwable{
        /*
        A a = null;
        a.m1();
        System.out.println(a.i);//Nullpointer is applicable  only valid for the instance methods and instance variables

        B b = new B();
        A w = b;

        A q = new A();
        B b1 = (B)q;//super class obj ref value in sub class ref here we get exception

        Class c = Class.forName("Employee1"); //ClassNotFoundException;
        Object obj =c.newInstance();
        */

        Student std = new Student("1111","Durgs",-1,"hyd");
        std.getStatus();

        A a = new A();
        a.add();

    }
}
