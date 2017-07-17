package game.rules;

/**
 * Created by chmi on 17-07-2017.
 */
public class RuleStraight implements IRule {
    @Override
    public int calculateScore(int[] diceDist) {

        return 2000;
    }

    @Override
    public boolean outcomeRolled(int[] diceDist) {

        int straightCount = 0;

        for (int i : diceDist) {
            if (i == 1){
                straightCount++;
            }
        }

        if (straightCount==6){
            return true;
        } else {
            return false;
        }
    }
}
