package edu.cnm.deepdive.cards;

import edu.cnm.deepdive.cards.model.Deck;
import edu.cnm.deepdive.cards.model.Suit.Color;
import edu.cnm.deepdive.cards.model.Trick;
import edu.cnm.deepdive.cards.view.CardListView;
import java.security.SecureRandom;
import java.util.zip.Deflater;

public class Main {

  public static void main(String[] args) {
/*
    Deck deck = new Deck();
    System.out.println(deck);

    deck.shuffle(new SecureRandom());
    System.out.println(deck);

    deck.sort();
    System.out.println(deck);
*/


    // TODO: 1/25/2024 Execute card trick

    Trick trick = new Trick(new SecureRandom());
    CardListView view = new CardListView();
    System.out.println(view.render(trick.getBlackPile(), Color.BLACK));
    System.out.println(view.render(trick.getRedPile(), Color.RED));
  }
}
