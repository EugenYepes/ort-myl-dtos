package ar.com.myldtos.users;

import java.io.Serializable;

public class AddCardToDeckDTO implements Serializable {
    private Integer deckId;
    private Integer quantity;

    public Integer getDeckId() {
        return deckId;
    }

    public void setDeckId(Integer deckId) {
        this.deckId = deckId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
