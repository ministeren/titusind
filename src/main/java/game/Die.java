package game;

import lombok.*;

/**
 * Created by ministeren on 10-May-17.
 */
//@ToString
//@AllArgsConstructor
//@EqualsAndHashCode

@Builder
@Getter
@Setter
public class Die {


    private int value;

    private boolean selected;

}
