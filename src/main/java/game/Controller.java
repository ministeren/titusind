package game;

import game.rules.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ministeren on 10-May-17.
 */
public class Controller {

    public static void main(String[] args) {

        Cup cup = new Cup();
        Rules rules = new Rules();
        int[] dieDist;
        IRule rule6 = new RuleSixIdentical();
        IRule ruleS = new RuleStraight();
        IRule rule3p = new RuleThreePair();
        IRule ruleTwoTriple = new RuleTwoTriple();
        IRule ruleBadRoll = new RuleBadRoll();
        List<IRule> rulesList = new ArrayList<>();
        rulesList.add(rule6);
        rulesList.add(ruleS);
        rulesList.add(rule3p);
        rulesList.add(ruleTwoTriple);
        rulesList.add(ruleBadRoll);

        int allSameCount = 0;
        int straightCount = 0;
        int threePairCount = 0;
        int twoTripleCount = 0;
        int badRollCount = 0;

//        System.out.println("1 2 3 4 5 6");

        for (int i = 0; i < 1000000; i++) {
            cup.roll();
//            System.out.println("Valid roll: " + rules.validRoll(cup.getDice()));
//            System.out.println("Force roll: " + rules.forceRollAgain());
//            System.out.println("Score: " + rules.score());
            dieDist = rules.makeRollArray(cup.getDice());
            System.out.println(dieDist[1] + " " + dieDist[2] + " " + dieDist[3] + " " + dieDist[4] + " " + dieDist[5] + " " + dieDist[6]);

//            for (IRule r : rulesList) {
//
//            }

            if (rule6.outcomeRolled(dieDist)){
                allSameCount++;
//                System.out.println("Roll: " + dieDist[1] + " " + dieDist[2] + " " + dieDist[3] + " " + dieDist[4] + " " + dieDist[5] + " " + dieDist[6]);
//                System.out.println("Outcome: " + rule6.outcomeRolled(dieDist));
//                System.out.println("Score: " + rule6.calculateScore(dieDist));
//                System.out.println();
            }
//
            if (ruleS.outcomeRolled(dieDist)){
                straightCount++;
//                System.out.println("Roll: " + dieDist[1] + " " + dieDist[2] + " " + dieDist[3] + " " + dieDist[4] + " " + dieDist[5] + " " + dieDist[6]);
                System.out.println("Straight: " + ruleS.outcomeRolled(dieDist));
//                System.out.println("Score: " + ruleS.calculateScore(dieDist));
//                System.out.println();
            }

            if (rule3p.outcomeRolled(dieDist)){
                threePairCount++;
//                System.out.println("Roll: " + dieDist[1] + " " + dieDist[2] + " " + dieDist[3] + " " + dieDist[4] + " " + dieDist[5] + " " + dieDist[6]);
                System.out.println("3 pair: " + rule3p.outcomeRolled(dieDist));
//                System.out.println("Score: " + rule3p.calculateScore(dieDist));
//                System.out.println();
            }

            if (ruleTwoTriple.outcomeRolled(dieDist)){
                twoTripleCount++;
//                System.out.println("Roll: " + dieDist[1] + " " + dieDist[2] + " " + dieDist[3] + " " + dieDist[4] + " " + dieDist[5] + " " + dieDist[6]);
                System.out.println("2x triple: " + ruleTwoTriple.outcomeRolled(dieDist));
//                System.out.println("Score: " + ruleTwoTriple.calculateScore(dieDist));
//                System.out.println();
            }

            if (ruleBadRoll.outcomeRolled(dieDist)){
                badRollCount++;
//                System.out.println("Roll: " + dieDist[1] + " " + dieDist[2] + " " + dieDist[3] + " " + dieDist[4] + " " + dieDist[5] + " " + dieDist[6]);
                System.out.println("Bad roll: " + ruleBadRoll.outcomeRolled(dieDist));
//                System.out.println();
            }

        }

        System.out.println("Three pair: " + threePairCount);
        System.out.println("Straight: " + straightCount);
        System.out.println("Two triple: "+ twoTripleCount);
        System.out.println("All same: "+ allSameCount);
        System.out.println("Bad roll: " + badRollCount);

        System.out.println();

        System.out.println("Three pair: " + threePairCount/10000.0);
//        System.out.println("Straight: " + straightCount/10000.0);
//        System.out.println("Two triple: "+ twoTripleCount/10000.0);
//        System.out.println("All same: "+ allSameCount/10000.0);
        System.out.println("Bad roll: " + badRollCount/10000.0);

//        System.out.println();
//        for (int i = 1; i < 7; i++) {
//            System.out.print(cup.getDice().get(i).getValue()+" ");
//        }

//        for (int j = 0; j < 2; j++) {
//
//            System.out.println();
//            cup.roll();
//            dieDist = game.rules.makeRollArray(cup.getDice());
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
