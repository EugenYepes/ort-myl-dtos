package ar.com.myldtos.users;

public class DeleteCardFromDecksDTO {
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
