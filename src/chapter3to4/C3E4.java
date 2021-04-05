package chapter3to4;

import java.util.Scanner;

public class C3E4 {

    public static void main(String[] args) {

        int duration;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter movie duration in minutes");
        duration = scanner.nextInt();

        System.out.println("Movie duration is: \n" +
                duration / 60 + " - Hours \n" +
                duration % 60 + " - Minutes");

        scanner.close();
    }
}
