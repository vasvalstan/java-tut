package chapter6;

public class App {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        Computer computer2 = new Computer("Intel");
        System.out.println(computer2.processor);
        /*
        computer1.GPU = "Nvidia";
        computer1.Harddisk = "WD";
        computer1.motherboard = "motherboard";
        computer1.RAM = 1024;
        computer1.processor = "Intel";

        computer1.showInfo();
        String result = computer1.showSpecs();

        int resultAddition = computer1.addition(3, 4);
        System.out.println(resultAddition);
        System.out.println(result);
         */

    }
}
