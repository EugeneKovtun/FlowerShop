package epam.courses.model.entities;

/**
 * Created by eugene on 27.07.17.
 */
public abstract class Plant {
    Amount amount;

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }
}
