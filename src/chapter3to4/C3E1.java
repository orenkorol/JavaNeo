package chapter3to4;

import java.util.Scanner;

public class C3E1 {

    public static void main(String[] args) {

        int num1;
        int num2;
        int num3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 numbers");

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        System.out.println("Sum = " + (num1 + num2 + num3));
        System.out.println("Average = " + ((num1 + num2 + num3) / 3));

        scanner.close();
    }
}
