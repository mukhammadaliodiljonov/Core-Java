public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = (make==null || make.isEmpty())? "Unknown" : make;
        this.model = (model==null || model.isEmpty()) ? "Unknown" : model;
        this.year = (year<0)? 2000 : year;
    }


    public static void main (String [] args){

        Car car1 = new Car("Tesla","Long",2022);
        System.out.println(car1.make);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println("------------------");
        Car car2 = new Car("","",-12);
        System.out.println(car2.make);
        System.out.println(car2.model);
        System.out.println(car2.year);
    }

}
