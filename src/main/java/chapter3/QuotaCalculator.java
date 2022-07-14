package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        //if else
        //initialize values we know
        int quota = 10;

        //get unknown values
        System.out.println("Enter the number of sales made this week:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //make a decision on the path to take - output
        if(sales >= quota){
            System.out.println("Congrats, you've met your quota");
        }else{
            int salesShort = quota - sales;
            System.out.println("You did not meet your quota.You were " + salesShort + " sales short");
        }
    }
}
