import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ministeren on 10-May-17.
 */
@Getter
@Setter
public class Cup {

    Map<Integer,Die> dice = new HashMap<>();

    public Map<Integer,Integer> roll (){
        return null;
    }

}
