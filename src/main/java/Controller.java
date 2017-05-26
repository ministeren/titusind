import java.util.HashMap;
import java.util.Map;

/**
 * Created by ministeren on 10-May-17.
 */
public class Controller {

    public static void main(String[] args) {

        Cup cup = new Cup();

        System.out.println("1 2 3 4 5 6");
        System.out.println();
        for (int i = 1; i < 7; i++) {
            System.out.print(cup.getDice().get(i).getValue()+" ");
        }

        System.out.println();
        cup.roll();

        for (int i = 1; i < 7; i++) {
            System.out.print(cup.getDice().get(i).getValue()+" ");
        }

        //Select die 1 + 2
        cup.setSelectedDie(1);
        cup.setSelectedDie(2);

        System.out.println();
        cup.roll();

        for (int i = 1; i < 7; i++) {
            System.out.print(cup.getDice().get(i).getValue()+" ");
        }

        cup.setSelectedDie(3);
        cup.setSelectedDie(4);
        cup.setSelectedDie(5);

        System.out.println();
        cup.roll();

        for (int i = 1; i < 7; i++) {
            System.out.print(cup.getDice().get(i).getValue()+" ");
        }

        cup.setSelectedDie(6);

        System.out.println();
        cup.roll();

        for (int i = 1; i < 7; i++) {
            System.out.print(cup.getDice().get(i).getValue()+" ");
        }

        cup.setSelectedDie(1);
        cup.setSelectedDie(2);

        System.out.println();
        cup.roll();

        for (int i = 1; i < 7; i++) {
            System.out.print(cup.getDice().get(i).getValue()+" ");
        }

    }
}
