package chapter3to4;

import java.util.Scanner;

public class C3E8 {

    public static void main(String[] args) {

        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 2 digit number:");
        num = scanner.nextInt();

        while (num > 99 || num < 10) {
            System.out.println("Enter 2 digit number:");
            num = scanner.nextInt();
        }

        System.out.println("Digit sum is: " + ((num % 10) + ((num / 10) % 10)));

        scanner.close();
    }
}
