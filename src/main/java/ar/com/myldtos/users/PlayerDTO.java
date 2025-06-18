package ar.com.myldtos.users;

import java.util.Set;

public class PlayerDTO extends UserDTO {
    private boolean isAdmin = false;
    private Set<DeckDTO> decks;
    private Set<PlayerCardDTO> cards;

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public Set<DeckDTO> getDecks() {
        return decks;
    }

    public void setDecks(Set<DeckDTO> decks) {
        this.decks = decks;
    }

    public Set<PlayerCardDTO> getCards() {
        return cards;
    }

    public void setCards(Set<PlayerCardDTO> cards) {
        this.cards = cards;
    }
}