package chapter3to4;

import java.util.Scanner;

public class C3E10 {

    public static void main(String[] args) {

        double num;
        int evenNum;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        num = scanner.nextDouble();
        evenNum = (int) num + 1;
        while (evenNum % 2 > 0) {
            evenNum++;
        }

        System.out.println("Closest even number is: " + evenNum);

        scanner.close();
    }
}
