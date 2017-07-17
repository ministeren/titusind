package game.rules;

/**
 * Created by christian on 6/9/17.
 */
public class RuleSixIdentical implements IRule {


    @Override
    public int calculateScore(int[] diceDist) {

        int score = 0;

        for (int i = 1; i < 7; i++) {
            if (diceDist[i]==6){
                if (i==1){
                    score = 4000;
                } else {
                    score = i*100*4;
                }
            }
        }

        return score;
    }

    @Override
    public boolean outcomeRolled(int[] diceDist) {

        boolean outcome = false;

        for (int i : diceDist) {
            if (i == 6){
                outcome = true;
            }
        }

        return outcome;
    }
}
