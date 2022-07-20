package chapter7;

import java.util.Random;

public class Arrays {
    public static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        int myVariable = 5;
       int [] myArray = new int [3];
       int [] myArray2 = {4,5,6};


        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;

        System.out.println(myArray[0]);
        System.out.println(myArray2[2]);

        int[] lottoTicket = new int[6];
        int[] lottoTicket2 = {24, 13, 11, 9, 14, 16}; // alternative if length is known
        lottoTicket[0] = 24;
        lottoTicket[1] = 18;
        lottoTicket[2] = 9;
        lottoTicket[3] = 11;
        lottoTicket[4] = 34;
        lottoTicket[5] = 64;

        int[] ticket = generateNumbers();
        printTicket(ticket);
    }

    //exercise
    public static int[] generateNumbers() {
        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for(int i=0; i < LENGTH; i++){
            ticket[i] = random.nextInt(MAX_TICKET_NUMBER) + 1;
        }

        return ticket;
    }

    public static void printTicket(int ticket[]){
        for(int i=0; i < LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}
