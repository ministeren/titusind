package game.rules;

import game.Die;
import java.util.Map;


/**
 * Created by christian on 6/9/17.
 */
public interface IRule {

    int calculateScore(int[] diceDist);

    boolean outcomeRolled(int[] diceDist);

}
