package Franc;

import Money.Money;

import java.util.Objects;

/**
 * Created by clucas on 18/01/2015.
 */
public class Franc extends Money{

    public Franc(int amount) {
        this.amount = amount;
    }

    int amount(){
        return amount;
    }

    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
