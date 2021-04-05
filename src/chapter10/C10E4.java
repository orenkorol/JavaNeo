package chapter10;

import helper.CustomActions;

public class C10E4 {

    public static void main(String[] args) {

        int min = 1;
//        int max = 3;
        //Veto enable
        int max = 4;

        int vote;
        int votesFor = 0;
        int votesAgainst = 0;
        int votesAvoid = 0;
        boolean veto = false;

        for (int i = 0; i < 100; i++) {
            vote = CustomActions.getRandomValue(min, max);
            System.out.println(i + 1 + ") " + vote);

            if (vote == 4) {
                veto = true;
                System.out.println("Country voted Veto is: " + (i + 1));
                break;
            }

            switch (vote) {
                case 1:
                    votesFor++;
                    break;
                case 2:
                    votesAgainst++;
                    break;
                case 3:
                    votesAvoid++;
                    break;
            }
        }

        if (!veto) {
            System.out.println("Votes summary\nFor: " + votesFor + "\nAgainst: " + votesAgainst + "\nAvoided: " + votesAvoid);
        }

    }
}
