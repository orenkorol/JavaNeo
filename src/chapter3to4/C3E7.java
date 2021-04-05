package chapter3to4;

import java.util.Scanner;

public class C3E7 {

    public static void main(String[] args) {

        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 digit number:");
        num = scanner.nextInt();

        while (num > 999 || num < 100) {
            System.out.println("Enter 3 digit number:");
            num = scanner.nextInt();
        }
        System.out.println("Hundreds digit is: " + num / 100);

        scanner.close();
    }
}
