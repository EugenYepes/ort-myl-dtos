package users;

import java.io.Serializable;
import java.util.Set;

public class DeckDTO implements Serializable {
    private Integer id;
    private String name;
    private PlayerDTO player;
    private Set<DeckCardDTO> cards;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerDTO getPlayer() {
        return player;
    }

    public void setPlayer(PlayerDTO player) {
        this.player = player;
    }

    public Set<DeckCardDTO> getCards() {
        return cards;
    }

    public void setCards(Set<DeckCardDTO> cards) {
        this.cards = cards;
    }
}
