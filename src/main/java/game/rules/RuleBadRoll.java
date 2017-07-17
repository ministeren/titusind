package game.rules;

/**
 * Created by chmi on 17-07-2017.
 */
public class RuleBadRoll implements IRule {
    @Override
    public int calculateScore(int[] diceDist) {
        return 0;
    }

    @Override
    public boolean outcomeRolled(int[] diceDist) {

        int straightCount = 0;

        for (int i : diceDist) {
            if (i == 2){
                straightCount++;
            }
        }

        if (straightCount<3){
            if (diceDist[1]==0 && diceDist[2]<3 && diceDist[3]<3 && diceDist[4]<3 && diceDist[5]==0 && diceDist[6]<3){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }


    }
}
