public class Student {
    private String sid;
    private String sname;
    private String saddr;
    private Courses[] courses;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSaddr() {
        return saddr;
    }

    public void setSaddr(String saddr) {
        this.saddr = saddr;
    }

    public Courses[] getCourses() {
        return courses;
    }

    public void setCourses(Courses[] courses) {
        this.courses = courses;
    }

    public void getStudentDetails(){
        System.out.println("Student Details");
        System.out.println("----------------");
        System.out.println("Student ID    : "+sid);
        System.out.println("Student Name  : "+sname);
        System.out.println("Student Addres: "+saddr);
        System.out.println("CID\tCNAME\tCCOST");
        System.out.println("-----------------");
        for(Courses c:courses){
            System.out.print(c.getCid()+"\t");
            System.out.print(c.getCname()+"\t");
            System.out.print(c.getCost()+"\t");
            System.out.println(ff);
        }



    }
}
