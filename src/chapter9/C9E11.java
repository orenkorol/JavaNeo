package chapter9;

import helper.CustomActions;

public class C9E11 {

    public static void main(String[] args) {

        int value1 = CustomActions.getRandomValue(-100, 100);
        int value2 = CustomActions.getRandomValue(1, 100);
        int i;

        CustomActions.printValue(value1, value2);

        if (value1 > value2) {
            int temp = value1;
            value1 = value2;
            value2 = temp;
            CustomActions.printValue(value1, value2);
        }

        i = value1;

        //Solution with single loop
//        int c = 1;
//        while (i <= value1) {
//            System.out.printf("%d ", i);
//            if (i == value2) {
//                c *= -1;
//            }
//            i += c;
//        }

        //Solution with two loops
        System.out.printf("%d ", i);
        while (i < value2) {
            i++;
            System.out.printf("%d ", i);
        }
        while (i > value1) {
            i--;
            System.out.printf("%d ", i);
        }

    }
}
