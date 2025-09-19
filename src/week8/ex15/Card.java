package week8.ex15;

import java.util.HashMap;

public class Card implements  Comparable<Card> {
    public static final int SPADES  = 0;
    public static final int DIAMONDS = 1;
    public static final int HEARTS = 2;
    public static final int CLUBS = 3;

    public static final HashMap<Integer, String> SUITS = new HashMap<Integer, String >();
    public static final HashMap<Integer, String> VALUES = new HashMap<Integer, String>();

    public void setCardSuits() {
        SUITS.put(SPADES, "Spades");
        SUITS.put(DIAMONDS, "Diamonds");
        SUITS.put(HEARTS, "Hearts");
        SUITS.put(CLUBS, "Clubs");
    }

    public void setCardValues() {
        VALUES.put(2, "2");
        VALUES.put(3, "3");
        VALUES.put(4, "4");
        VALUES.put(5, "5");
        VALUES.put(6, "6");
        VALUES.put(7, "7");
        VALUES.put(8, "8");
        VALUES.put(9, "9");
        VALUES.put(10, "10");
        VALUES.put(11, "J");
        VALUES.put(12, "Q");
        VALUES.put(13, "K");
        VALUES.put(14, "A");
    }

    private int value;
    private int suit;

    public Card(int value, int suit) {
        this.value = value;
        this.suit = suit;
        this.setCardSuits();
        this.setCardValues();
    }

    @Override
    public String toString() {
        return VALUES.get(this.value) + " of " + SUITS.get(this.suit);
    }

    public int getValue() {
        return this.value;
    }

    public int getSuit() {
        return this.suit;
    }

    public int compareTo(Card other) {
        if (this.value - other.getValue() == 0) {
            return this.suit - other.getSuit();
        }
        return this.value - other.getValue();
    }
}
