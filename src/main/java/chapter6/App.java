package chapter6;

public class App {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        computer1.GPU = "Nvidia";
        computer1.Harddisk = "WD";
        computer1.motherboard = "motherboard";
        computer1.RAM = 1024;
        computer1.processor = "Intel";

        computer1.showInfo();
        String result = computer1.showSpecs();

        System.out.println(result);
    }
}
