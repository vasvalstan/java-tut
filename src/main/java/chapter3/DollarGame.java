package chapter3;

import java.util.Scanner;

public class DollarGame {
    public static void main(String[] args) {
        double penny = 0.1;
        double nickel = 0.5;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;


        boolean again;

        Scanner scanner;
        do {
            scanner = new Scanner(System.in);

            System.out.println("Welcome to 'Change for a dollar' game ."
                    + "Your goal is to enter enough change to make exactly $1.00");

            System.out.println("Enter your number of pennies:");
            int numOfPennies = scanner.nextInt();

            System.out.println("Enter your number of nickels:");
            int numOfNickels = scanner.nextInt();

            System.out.println("Enter your number of dimes:");
            int numOfDimes = scanner.nextInt();

            System.out.println("Enter your number of quarters:");
            int numOfQuarters = scanner.nextInt();


            double total = numOfPennies * penny + numOfNickels * nickel + numOfDimes * dime + numOfQuarters * quarter;

            if (total < dollar) {
                double amountShort = dollar - total;
                System.out.println("You were short of :" + amountShort + " cents");
            } else if (total > dollar) {
                double amountOver = total - dollar;
                System.out.println("You were over with :" + amountOver + " cents");
            } else {
                System.out.println("That is exactly $1.00. You WIN!");
            }

            System.out.println("Would you like to start over? Enter 'true' or 'false' ");
            again = scanner.nextBoolean();

        } while (again);

        scanner.close();
    }
}
