package game;

import java.util.Map;

/**
 * Created by Christian on 25-05-2017.
 */
public class Rules {

    int straightCount;
    int threePairsCount;
    int allSameCount;
    int threePlusCount;
    int oneFiveCount;
    int score;

    boolean straight;
    boolean threePairs;
    boolean allSame;
    boolean threePlus;
    boolean oneFive;

    boolean forceRoll;


    public int[] makeRollArray(Map<Integer,Die> dice){

        int[] dieDist = new int[7];

//        System.out.println("Size: "+dice.size());

        for (Die d : dice.values()) {
            dieDist[d.getValue()]++;
        }

        return dieDist;
    }

    public boolean forceRollAgain(){
        return forceRoll;
    }

    public int score(){
        return score;
    }


    public boolean validRoll(Map<Integer,Die> dice){

        int[] dieDist = makeRollArray(dice);

        straightCount = 0;
        threePairsCount = 0;
        allSameCount = 0;
        threePlusCount = 0;
        oneFiveCount = 0;

        straight = false;
        threePairs = false;
        allSame = false;
        threePlus = false;
        oneFive = false;
        forceRoll = false;

//        dice.values().forEach(System.out::print);

        for (int i = 1; i < 7; i++) {
            System.out.print(dice.get(i).getValue()+" ");
        }
        System.out.println();

        for (int i = 1; i < 7; i++) {
            System.out.print(dieDist[i]+" ");

            if (dieDist[i] == 1){
                straightCount++;
            }
            if (dieDist[i] >= 1 && i == 1 || dieDist[i] >= 1 && i == 5){
                oneFiveCount++;
            }
            if (dieDist[i] == 2){
                threePairsCount++;
            }
            if (dieDist[i] >= 3){
                threePlusCount++;
            }
            if (dieDist[i] == 6){
                allSameCount++;
            }

        }

        System.out.println();

        score = 0;

        if (straightCount == 6){
            straight = true;
            forceRoll = true;
            score = 2000;
            System.out.println("straight");
        } else {
            if(dieDist[5] > 0 && dieDist[5] < 3){
                oneFive = true;
                score += dieDist[5] * 50;
                System.out.println("oneFive");
            }
            if(dieDist[1] > 0 && dieDist[1] < 3){
                oneFive = true;
                score += dieDist[1] * 100;
                System.out.println("oneFive");
            }
        }
//        if(oneFiveCount > 0){
//            oneFive = true;
//            forceRoll = false;
//            score += dieDist[1] * 100;
//            score += dieDist[5] * 50;
//            System.out.println("oneFive");
//        }
        if(threePairsCount == 3){
            threePairs = true;
            forceRoll = true;
            score = 1500;
            System.out.println("threePairs");
        }
        if(threePlusCount  == 1){
            threePlus = true;
            for (int i = 1; i < 7; i++) {
                int count = dieDist[i];
                if (count == 3){
                    score +=  i * 100;
                } else if (count > 3){
                    if (i == 1){
                        score +=  i * (((count - 3) + 1) * 1000);
                    } else {
                        score +=  i * (((count - 3) + 1) * 100);
                    }
                }
            }
            System.out.println("threePlus");
        }
        if(threePlusCount  == 2){
            threePlus = true;
            forceRoll = true;
            for (int i = 1; i < 7; i++) {
                if(i == 1){
                    score += i * 1000;
                } else {
                    score += i * 100;
                }
            }
        }
        if(allSameCount > 0){
            allSame = true;
            forceRoll = true;
            for (int i = 1; i < 7; i++) {
                int count = dieDist[i];
                if (count == 3){
                    score +=  i * 100;
                } else if (count > 3){
                    score +=  (i * 100) * (count - 3);
                }
            }
            System.out.println("allSame");
        }

        if (straight || oneFive || threePairs || threePlus || allSame){
            return true;
        } else {
            return false;
        }
    }
}
