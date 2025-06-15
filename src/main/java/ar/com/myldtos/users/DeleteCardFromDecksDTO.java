package ar.com.myldtos.users;

public class DeleteCardFromDecksDTO {
    private Integer deckId;
    private Integer amount;

    public Integer getDeckId() {
        return deckId;
    }

    public void setDeckId(Integer deckId) {
        this.deckId = deckId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
