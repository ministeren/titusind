package game.rules;

/**
 * Created by chmi on 17-07-2017.
 */
public class RuleThreePair implements IRule {
    @Override
    public int calculateScore(int[] diceDist) {
        return 1500;
    }

    @Override
    public boolean outcomeRolled(int[] diceDist) {

        int straightCount = 0;

        for (int i : diceDist) {
            if (i == 2){
                straightCount++;
            }
        }

        if (straightCount==3){
            return true;
        } else {
            return false;
        }
    }
}
