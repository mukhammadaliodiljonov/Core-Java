public class Cat{
    private String name;
    private int age;

    public Cat(){
        this.name="Uknown";
        this.age=0;
    }

    public String getName(){
        return name;
    }

    public String getAge(){
        return Integer.toString(age);
    }

    public static void main(String args[]){

        Cat cat = new Cat();
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
    }

}


