package Dollar;

import java.util.Objects;

/**
 * Created by clucas on 18/01/2015.
 */
public class Dollar {
    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    int amount(){
        return amount;
    }

    public boolean equals(Object object){
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
