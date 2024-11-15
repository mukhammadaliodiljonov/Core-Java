public class ConstructorChaining {
    private String StudentId;
    private String StudentName;
    private double grade;

    public ConstructorChaining(){
        this("Unknown Student", "Unknown Student", 0.0);
    }

    public ConstructorChaining(String studentId, String studentName, double grade){
        this.StudentId = studentId;
        this.StudentName = studentName;
        this.grade = grade;
    }

    public static void main(String args[]){
        ConstructorChaining chain = new ConstructorChaining();
        System.out.println("StudentId: " + chain.StudentId);
        System.out.println("StudentName: " + chain.StudentName);
        System.out.println("Grade: " + chain.grade);
        System.out.println("---------------------------------");
        ConstructorChaining chain2 = new ConstructorChaining("412136","Mukhammadali Odiljonov",4.1);
        System.out.println("StudentId: " + chain2.StudentId);
        System.out.println("StudentName: " + chain2.StudentName);
        System.out.println("Grade: " + chain2.grade);
    }
}
