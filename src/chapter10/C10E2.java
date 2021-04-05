package chapter10;

import helper.CustomActions;

public class C10E2 {

    public static void main(String[] args) {

        int min = 1;
        int max = 5000;
        int value = CustomActions.getRandomValue(min, max);
        boolean ticketFound = false;
        int sumOfTickets = 0;
        int ticketNumber = 1;

        System.out.printf("%d", value);
        for (int i = 0; i < 1000; i++) {
            sumOfTickets += value;
            value = CustomActions.getRandomValue(min, max);
            System.out.printf(", %d", value);

            if (sumOfTickets == value) {
                ticketFound = true;
                ticketNumber = i + 1;
                break;
            }

            //Make it run till found
            if (i == 999) {
                i = 0;
                sumOfTickets = 0;
                System.out.println("\n\n\n");
                value = CustomActions.getRandomValue(min, max);
                System.out.printf("%d", value);
            }
        }

        System.out.println();
        if (ticketFound) {
            System.out.println("Ticket " + ticketNumber + " found with sum: " + value);
        } else {
            System.out.println("Ticket not found!");

        }
    }
}
