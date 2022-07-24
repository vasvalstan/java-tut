package chapter6;

public class Computer {
    int RAM;
    String GPU;
    String Harddisk;
    String motherboard;
    String processor;

    public Computer() {
        System.out.println("The constructor is called");
    }
    public Computer(String processorName){
        processor = processorName;
    }
    void showInfo(){
        System.out.println("This computer has this amount of RAM: " + RAM + " and the processor: " + processor);
    }
    String showSpecs(){
        return "This computer has this amount of RAM: " + RAM + " and the processor: " + processor;
    }

    int addition(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
}
