import javax.annotation.processing.Processor;

public class Computer {
    public class Processor {
        public void displayDetails(){
            System.out.println("Computer Brand : Macbook Air M2");
            System.out.println("Computer Speed : 3.8 Hz");
        }
    }


    public void showProcessorDetails(){

        Processor processor = new Processor();
        processor.displayDetails();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.showProcessorDetails();
    }
}
