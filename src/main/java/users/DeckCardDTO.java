package users;

import ar.com.myldtos.cards.CardDTO;

public class DeckCardDTO {
    private CardDTO card;
    private Integer quantity;

    public CardDTO getCard() {
        return card;
    }

    public void setCard(CardDTO card) {
        this.card = card;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
