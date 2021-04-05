package chapter3to4;

import java.util.Scanner;

public class C3E5 {

    public static void main(String[] args) {

        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter at least 4 digit number:");
        num = scanner.nextInt();

        System.out.println("Right most digit is: " + num % 10);

        scanner.close();
    }
}
