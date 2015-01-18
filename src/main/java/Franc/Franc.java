package Franc;

import Money.Money;

import java.util.Objects;

/**
 * Created by clucas on 18/01/2015.
 */
public class Franc extends Money{

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    public int amount(){
        return amount;
    }

}
