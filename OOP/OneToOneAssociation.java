
class Account{
    String accNo;
    String accHoler;
    String accType;
    int balance;
    Account(String accNo,String accHoler,String accType,int balance){
        this.accNo=accNo;
        this.accHoler=accHoler;
        this.accType=accType;
        this.balance=balance;
    }
}
class Employee{
    String empName;
    String Eid;
    String eaddr;
    float sal;

    Account account;

    Employee(String empName, String Eid, String eaddr, float sal, Account account){
        this.empName=empName;
        this.Eid= Eid;
        this.eaddr= eaddr;
        this.sal= sal;
        this.account=account;
    }
    public void getEmp(){
        System.out.println("employee details");
        System.out.println(Eid);
        System.out.println(empName);
        System.out.println(sal);
        System.out.println(eaddr);
        System.out.println("acc details");
        System.out.println(account.accNo);
        System.out.println(account.accHoler);
        System.out.println(account.accType);
        System.out.println(account.balance);

    }
}
class OneToOneAssociation {
    public static void main(String[] args) {

        Account acc= new Account("E-111","durga","hyd",12122);
        Employee emp = new Employee("Ali","E-11234","hyd",22112.0f,acc);
        emp.getEmp();
    }


}


