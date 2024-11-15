class Employee{
    void generateSalary(int basic, float hk, int ta, float pf){
        System.out.println("Salary calculator on the basis of BAsic,HK,TA,PF:");

    }
    void generateSalary(int basic, float hk, int ta, float pf, int bonus){
        System.out.println("Salary Calculator on the basis of Basic,HK,TA,PF,Bonus");
    }

}

public class MethodOverloading {
    public static void main(String [] args) {
        Employee emp = new Employee();
        emp.generateSalary(250000, 25.0f, 6000, 12.5f);
        emp.generateSalary(250000, 25.0f, 6000, 12.5f,10000);
    }
}
