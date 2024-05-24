class Employee{
    int eno;
    String ename;
    float sal;
    String eaddr;

    public void getEmpDetails(){
        System.out.println("Employee Number  : "+eno);
        System.out.println("Employee Name    : "+ename);
        System.out.println("Employee Salary  : "+sal);
        System.out.println("Employee Address : "+eaddr);
    }
}

class Manager extends Employee{
    public Manager(int eno,String ename,float sal,String eaddr){
        this.eno=eno;
        this.ename=ename;
        this.sal=sal;
        this.eaddr=eaddr;
    }

    public void getManagerDetails(){
        System.out.println("Manager Details");
        System.out.println("---------------");
        getEmpDetails();
    }
}

class Accountent extends Employee{
    public  Accountent(int empNo,String empName,float empSal,String empAddr){
        this.eno=empNo;
        this.ename=empName;
        this.sal=empSal;
        this.eaddr=empAddr;
    }

    public void getAccountentDetails(){
        System.out.println("Accountent Details");
        System.out.println("------------------");
        getEmpDetails();
    }
}
public class SingleInheritence {
    public static void main(String[] args){
        Manager  mngr = new Manager(111,"AAA",50000,"hyd");
        mngr.getManagerDetails();
        System.out.println();

        Accountent acc = new Accountent(222,"BBB",20000,"hyd");
        acc.getAccountentDetails();
    }
}
