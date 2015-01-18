package Dollar;

/**
 * Created by clucas on 18/01/2015.
 */
public class Dollar {
    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    int amount(){
        return amount;
    }

    void times(int multiplier) {
        amount *= multiplier;
    }
}
