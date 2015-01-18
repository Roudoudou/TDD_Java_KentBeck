package Money;

/**
 * Created by clucas on 18/01/2015.
 */
public interface Expression {
    public Money reduce(Bank bank, String to);
}
