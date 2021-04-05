package chapter3to4;

import java.util.Scanner;

public class C3E2 {

    public static void main(String[] args) {

        int length;
        int width;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter room length");
        length = scanner.nextInt();
        System.out.println("Enter room width");
        width = scanner.nextInt();

        System.out.println("Room area: " + width * length);
        System.out.println("Room perimeter: " + (width + length) * 2);

        scanner.close();
    }
}
