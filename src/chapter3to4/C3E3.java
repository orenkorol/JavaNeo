package chapter3to4;

import java.util.Scanner;

public class C3E3 {

    public static void main(String[] args) {

        int diameter;
        int depth;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter diameter");
        diameter = scanner.nextInt();
        System.out.println("Enter depth");
        depth = scanner.nextInt();

        // Area = Pie * R^2(diameter/2) * depth
        System.out.println("Area of pot: " + (Math.PI * Math.pow(diameter / 2, 2) * depth));

        scanner.close();
    }
}
