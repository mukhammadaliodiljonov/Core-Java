public class Department {
    private String did;
    private String dname;
    private Employee [] emps;


    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Employee[] getEmps() {
        return emps;
    }

    public void setEmps(Employee[] emps) {
        this.emps = emps;
    }

    public void getDepartmentDetails(){
        System.out.println("Department Deatils");
        System.out.println("------------------");
        System.out.println("Department Id    : "+did);
        System.out.println("Department Name  : "+dname);
        System.out.println();
        System.out.println("EID\tENAME\tESAL\tEADDR");
        System.out.println("------------------------");
        for(Employee emp:emps){
            System.out.print(emp.getEid()+"\t");
            System.out.print(emp.getEname()+"\t");
            System.out.print(emp.getSal()+"\t");
            System.out.println(emp.getEaddr());
        }
    }
}
