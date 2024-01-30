package edu.cnm.deepdive.cards.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.random.RandomGenerator;

public class Deck {

  private final List<Card> cards;

  public Deck () {
    cards = new ArrayList<>();
    for (Suit suit : Suit.values()) {
      for (Rank rank : Rank.values()) {
        Card card = new Card(rank, suit);
        cards.add(card);
      }
    }
  }

  public void shuffle(RandomGenerator rng){
    Collections.shuffle(cards, rng);
  }

  public int size() {
    return cards.size();
  }

  public boolean isEmpty() {
    return cards.isEmpty();
  }

  /**
   * Draws a single {@link Card} from the top of the deck
   * @return Instance of {@link Card}
   * @throws NoSuchElementException If deck is empty
   */
  public Card draw() throws NoSuchElementException {
    return cards.removeFirst();
  }

  public void sort() {
    cards.sort(null);
    // same as Collections.sort(cards);
  }

  @Override
  public String toString() {
    return cards.toString();
  }

}
