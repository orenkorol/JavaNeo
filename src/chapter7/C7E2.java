package chapter7;

import helper.CustomActions;

public class C7E2 {

    public static void main(String[] args) {

        int grade = CustomActions.getRandomValue(0, 100);
        System.out.println("Grade: " + grade);

        if (grade > 74) {
            if (grade > 84) {
                if (grade > 94) {
                    System.out.println("מצוין");
                } else {
                    System.out.println("טוב מאד");
                }
            } else {
                System.out.println("טוב");
            }
        } else {
            if (grade > 64) {
                System.out.println("כמעט טוב");
            } else {
                if (grade > 54) {
                    System.out.println("מספיק");
                } else {
                    System.out.println("בלתי מספיק");
                }
            }
        }

    }
}
