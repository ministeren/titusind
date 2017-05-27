import java.util.HashMap;
import java.util.Map;

/**
 * Created by ministeren on 10-May-17.
 */
public class Controller {

    public static void main(String[] args) {

        Cup cup = new Cup();
        Rules rules = new Rules();
        int[] dieDist;

//        System.out.println("1 2 3 4 5 6");

        for (int i = 0; i < 10; i++) {
            cup.roll();
            System.out.println("Valid roll: " + rules.validRoll(cup.getDice()));
            System.out.println("Force roll: " + rules.forceRollAgain());
            System.out.println("Score: " + rules.score());
            System.out.println();
        }

//        System.out.println();
//        for (int i = 1; i < 7; i++) {
//            System.out.print(cup.getDice().get(i).getValue()+" ");
//        }

//        for (int j = 0; j < 2; j++) {
//
//            System.out.println();
//            cup.roll();
//            dieDist = rules.makeRollArray(cup.getDice());
//
//            for (int i = 1; i < 7; i++) {
//                System.out.print(cup.getDice().get(i).getValue()+" ");
//            }
//            System.out.println();
//            for (int i = 1; i < 7; i++) {
//                System.out.print(dieDist[i]+" ");
//            }
//            System.out.println();
//        }
//
//        //Select die 1 + 2
//        cup.setSelectedDie(1);
//        cup.setSelectedDie(2);
//
//        System.out.println();
//        cup.roll();
//
//        for (int i = 1; i < 7; i++) {
//            System.out.print(cup.getDice().get(i).getValue()+" ");
//        }
//
//        cup.setSelectedDie(3);
//        cup.setSelectedDie(4);
//        cup.setSelectedDie(5);
//
//        System.out.println();
//        cup.roll();
//
//        for (int i = 1; i < 7; i++) {
//            System.out.print(cup.getDice().get(i).getValue()+" ");
//        }
//
//        cup.setSelectedDie(6);
//
//        System.out.println();
//        cup.roll();
//
//        for (int i = 1; i < 7; i++) {
//            System.out.print(cup.getDice().get(i).getValue()+" ");
//        }
//
//        cup.setSelectedDie(1);
//        cup.setSelectedDie(2);
//
//        System.out.println();
//        cup.roll();
//
//        for (int i = 1; i < 7; i++) {
//            System.out.print(cup.getDice().get(i).getValue()+" ");
//        }



    }
}
