package Dollar;

import Money.Money;

import java.util.Objects;

/**
 * Created by clucas on 18/01/2015.
 */
public class Dollar extends Money{


    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    public int amount(){
        return amount;
    }

}
