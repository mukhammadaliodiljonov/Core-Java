public class University {
    public static class Department{

        private final String DepartmentName;
        private final int NumberOfMembers;

        public Department(String DepartmentName, int NumberOfMembers) {
            this.DepartmentName = DepartmentName;
            this.NumberOfMembers = NumberOfMembers;
        }

        public void Display(){
            System.out.println("Department Name  : " + DepartmentName);
            System.out.println("Number of Members: " + NumberOfMembers);
        }
    }

    public static void main(String[] args) {

        University.Department cs = new University.Department("computer Science", 1256);
        cs.Display();
    }

}