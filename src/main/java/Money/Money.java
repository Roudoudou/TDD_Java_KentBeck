package Money;

import Dollar.Dollar;
import Franc.Franc;

/**
 * Created by clucas on 18/01/2015.
 */
public abstract class Money {
    protected int amount;

    public abstract Money times(int multiplier);

    public static Money dollar(int amount){
        return new Dollar(amount);
    }

    public static Money franc(int amount){
        return new Franc(amount);
    }

    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }
}
