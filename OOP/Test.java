public class Test {
    public static void main(String []args){
       Employee e1 = new Employee();
       e1.setEid("E-111");
       e1.setEname("AAA");
       e1.setSal(5000);
       e1.setEaddr("Hyd");
       Employee e2 = new Employee();
       e2.setEid("E-222");
       e2.setEname("BBB");
       e2.setSal(4000);
       e2.setEaddr("Hyd");
       Employee e3 = new Employee();
       e3.setEid("E-333");
       e3.setEname("CCC");
       e3.setSal(6000);
       e3.setEaddr("Hyd");
       Employee e4 = new Employee();
       e4.setEid("E-444");
       e4.setEname("DDD");
       e4.setSal(6000);
       e4.setEaddr("Hyd");
       Employee[] emps = {e1,e2,e3,e4};
       Department dept = new Department();
       dept.setDid("D-111");
       dept.setDname("Admins");
       dept.setEmps(emps);
       dept.getDepartmentDetails();
       //setter and getter methods dependancy injection
    }
}
