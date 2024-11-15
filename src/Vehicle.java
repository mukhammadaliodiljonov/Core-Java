public class Vehicle {
    public void startEngine(){
        class Engine{
            public void run(){
                System.out.println("Engine is running.");
            }
        }
        Engine engine = new Engine();
        engine.run();
    }

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.startEngine();
    }
}
