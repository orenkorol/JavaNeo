package chapter10;

import helper.CustomActions;

public class C10E1 {

    public static void main(String[] args) {

        int min = 1;
        int max = 200;
        int value = CustomActions.getRandomValue(min, max);
        int nextValue = value;
        boolean sorted = true;

        for (int i = 0; i < 100; i++) {
            //Random numbers check - uncomment next line
            nextValue = CustomActions.getRandomValue(min, max);

            //Sorted numbers check - comment prev,uncomment next line
//            nextValue++;

            if (nextValue < value) {
                sorted = false;
                break;
            }
            value = nextValue;
        }

        if (sorted) {
            System.out.println("Sorted!");
        } else {
            System.out.println("Not Sorted!");

        }
    }
}
