class Dog{
    private String name;
    private String breed;

    Dog(String _name, String _breed){
        this.name=_name;
        this.breed=_breed;
    }

    public void setName(String _name){
        this.name=_name;
    }

    public void setBreed(String _breed){
        this.breed=_breed;
    }

    public String getName(){
        return name;
    }

    public String getBreed(){
        return breed;
    }

}
public class Dogs {
    public static void main(String[] args){

    Dog dog1 = new Dog("Kottie","Bulldog");
    Dog dog2 = new Dog("Charlie","Pit bull");
    System.out.println(dog1.getName()+ " is a "+dog1.getBreed());
    System.out.println(dog2.getName()+ " is a "+dog2.getBreed());
    System.out.println("Lets set some changes ");
    dog1.setName("Bobbie");
    dog2.setBreed("Geman Shephard");
    System.out.println(dog1.getName()+ " is a "+dog1.getBreed());
    System.out.println(dog2.getName()+ " is a "+dog2.getBreed());



    }
}
