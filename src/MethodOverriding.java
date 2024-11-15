class Student {
    void write(String book, String pen){
        System.out.println("Student is able to write notes "+book+" with "+pen);
    }
}
class Teacher extends Student{
    void write(String board,String marker){
        System.out.println("teacher is able to write on "+board+" with "+marker);
    }
}

class SoftwareEngineer extends Student{
    void write(String notepad,String programme){
        System.out.println("Software Engineer is able to write a "+programme+" on "+notepad);
    }
}
public class MethodOverriding {
    public static void main(String [] args){
        Student teacher = new Teacher();//method Overriding
        teacher.write("Marker board","marker pen");
        System.out.println();

        Student softwareEngineer = new SoftwareEngineer();//method Overriding
        softwareEngineer.write("Notepad","Java programm");

    }
}
