package ar.com.myldtos.users;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class DeckDTO implements Serializable {
    private Integer id;
    private String name;
    private String description;
    private Set<DeckCardDTO> cards = new HashSet<>();

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<DeckCardDTO> getCards() {
        return cards;
    }

    public void setCards(Set<DeckCardDTO> cards) {
        this.cards = cards;
    }
}
