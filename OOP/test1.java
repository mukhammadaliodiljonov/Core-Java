public class test1 {
    public static void main(String[] args){
        Courses c1 = new Courses();
        c1.setCid("CS-111");
        c1.setCname("Java");
        c1.setCost(1000);
        Courses c2 = new Courses();
        c2.setCid("CS-222");
        c2.setCname("Pyhton");
        c2.setCost(20000);
        Courses c3 = new Courses();
        c3.setCid("CS-333");
        c3.setCname("Oracle");
        c3.setCost(40000);
        Courses[] courses = {c1,c2,c3};

        Student std1 = new Student();
        std1.setSid("S-111");
        std1.setSname("AAA");
        std1.setSaddr("Hyd");
        std1.setCourses(courses);
        std1.getStudentDetails();

        Student std2 = new Student();
        std2.setSid("S-222");
        std2.setSname("BBB");
        std2.setSaddr("Hyd");
        std2.setCourses(courses);
        std2.getStudentDetails();

        Student std3 = new Student();
        std3.setSid("S-333");
        std3.setSname("CCC");
        std3.setSaddr("Hyd");
        std3.setCourses(courses);
        std3.getStudentDetails();



    }
}
