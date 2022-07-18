package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    public static void main(String[] args) {
       // Rectangle kitchen = getRoom();//
        // Rectangle bathroom = getRoom();
    }

    public Rectangle getRoom(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        scanner.close();

        return new Rectangle(length, width);
    }
}
