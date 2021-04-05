package chapter7;

import helper.CustomActions;

public class C7E3 {

    public static void main(String[] args) {

        int min = 1;
        int max = 100;
        int valueA = CustomActions.getRandomValue(min, max);
        int valueB = CustomActions.getRandomValue(min, max);
        int valueC = CustomActions.getRandomValue(min, max);
        int valueD = CustomActions.getRandomValue(min, max);
        int valueE = CustomActions.getRandomValue(min, max);
        int valueF = CustomActions.getRandomValue(min, max);

        double hiddenX;
        double hiddenY;

        System.out.println("valueA: " + valueA + " valueB: " + valueB + " valueC: " + valueC + " valueD: " + valueD + " valueE: " + valueE + " valueF: " + valueF);
        if ((valueA * valueE) - (valueB * valueD) == 0) {
            System.out.println("Equation has no solution");
        } else {
            hiddenX = (double) ((valueC * valueE) - (valueB * valueF)) / ((valueA * valueE) - (valueB * valueD));
            hiddenY = (double) ((valueA * valueF) - (valueC * valueD)) / ((valueA * valueE) - (valueB * valueD));

            System.out.printf("Hidden x= %.5f\nHidden Y= %.5f", hiddenX, hiddenY);
        }
    }
}
