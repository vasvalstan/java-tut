package chapter6;

public class Computer {
    int RAM;
    String GPU;
    String Harddisk;
    String motherboard;
    String processor;

    void showInfo(){
        System.out.println("This computer has this amount of RAM: " + RAM + " and the processor: " + processor);
    }
    String showSpecs(){
        return "This computer has this amount of RAM: " + RAM + " and the processor: " + processor;
    }
}
