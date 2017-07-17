package game.rules;

/**
 * Created by chmi on 17-07-2017.
 */
public class RuleTwoTriple implements IRule {
    @Override
    public int calculateScore(int[] diceDist) {

        int score = 0;

        for (int i = 1; i < 7; i++) {
            if (diceDist[i]==3){
                if (i == 1){
                    score += 1000;
                } else {
                    score += i*100;
                }
            }
        }

        return score;
    }

    @Override
    public boolean outcomeRolled(int[] diceDist) {

        int twoTripleCount = 0;

        for (int i : diceDist) {
            if (i == 3){
                twoTripleCount++;
            }
        }

        if (twoTripleCount==2){
            return true;
        } else {
            return false;
        }
    }
}
