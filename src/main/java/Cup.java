import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by ministeren on 10-May-17.
 */

@Getter
//@Setter
public class Cup {

    private Map<Integer,Die> dice;

//    private List<Integer> diceLeft;

    private int diceSelected;

    public Cup() {

        diceSelected = 0;
        dice = new HashMap<>();
//        diceLeft = new LinkedList<>();

        for (int i = 1; i < 7; i++) {
            dice.put(i,Die.builder().value(0).selected(false).build());
//            diceLeft.add(i);

        }
    }

    public void roll (){

        for (Die d : dice.values()) {
            if (diceSelected == 6){
                d.setSelected(false);
            }
            if (!d.isSelected()){
                d.setValue(randValue());
            }
        }
        if (diceSelected == 6){
            diceSelected = 0;
        }
//        for (Integer i : diceLeft) {
//            dice.get(i).setValue(randValue());
//        }
    }

    public void setSelectedDie(int d){

        Die die = dice.get(d);

        if (!die.isSelected()){
            dice.get(d).setSelected(true);
            diceSelected++;
        }
//        diceLeft.remove(d);
    }

    private int randValue(){

        return ThreadLocalRandom.current().nextInt(1, 6 + 1);
    }



}
