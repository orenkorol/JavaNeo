package chapter7;

import helper.CustomActions;

import java.time.YearMonth;

public class C7E4 {
    public static void main(String[] args) {

        int min = 1800;
        int max = 2100;
        int month = CustomActions.getRandomValue(1, 12);
        int year = CustomActions.getRandomValue(min, max);

        System.out.println("Selected year: " + year);
        System.out.println("Selected month: " + month);

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.printf("Meuberet , %d days", YearMonth.of(year, month).lengthOfMonth());
        } else {
            System.out.printf("normal year, %d days", YearMonth.of(year, month).lengthOfMonth());
        }

    }
}
