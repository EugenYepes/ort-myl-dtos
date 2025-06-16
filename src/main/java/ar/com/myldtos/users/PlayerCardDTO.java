package ar.com.myldtos.users;

import ar.com.myldtos.cards.CardDTO;

import java.io.Serializable;

public class PlayerCardDTO implements Serializable {
    private CardDTO card;
    private Integer quantity;
    private PlayerDTO player;

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

    public PlayerDTO getPlayer() {
        return player;
    }

    public void setPlayer(PlayerDTO player) {
        this.player = player;
    }
}
