package chapter3;

import java.util.Scanner;

/*
Logical operators:
 */
public class LogicalOperatorLoanQualifier {
    public static void main(String[] args) {
       //initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

       //get what we don't
        System.out.println("Enter your salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer:");
        double years = scanner.nextDouble();

        scanner.close();
       //make decision
        if(salary >= requiredSalary && years >= requiredYearsEmployed){
               System.out.println("You qualify for the loan!");
        }else{
            System.out.println("Sorry, you must earn at least " + requiredSalary + " or to have worked more than " + requiredYearsEmployed + " years with you current employer");
        }
    }
}
