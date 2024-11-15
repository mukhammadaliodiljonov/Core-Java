public class Array {
    private String className;
    private String [] Students;

    public Array(String className, String [] Students ){
        this.className = className;
        this.Students = Students;
    }

    public void display(){
        System.out.println("Class Name : " + className);
        System.out.println("Students : ");
        for(String Student:Students){

            System.out.println("Student Name : " + Student);
        }
        System.out.println(" ");
    }

    public static void main(String [] args){

        String [] StudentsArray={"John","Scott","Tommy"};

        Array std = new Array("Team Project",StudentsArray);
        std.display();
    }
}
