package Franc;

import java.util.Objects;

/**
 * Created by clucas on 18/01/2015.
 */
public class Franc {
    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    int amount(){
        return amount;
    }

    public boolean equals(Object object){
        Franc franc = (Franc) object;
        return amount == franc.amount;
    }

    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
