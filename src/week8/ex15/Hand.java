package week8.ex15;

import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand>{

    private ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<Card>();
    }

    public void add(Card card){
       this.cards.add(card);
    }

    public void print(){
        for(Card card : this.cards){
            System.out.println(card);
        }
    }

    public void sort(){
        Collections.sort(this.cards);
    }

    private int getHandValue(){
        int value = 0;
        for(Card card : this.cards){
            value += card.getValue();
        }
        return value;
    }

    @Override
    public int compareTo(Hand other){
        return this.getHandValue() - other.getHandValue();
    }

    public void SortAgainstSuitAndValue (){
        Collections.sort(this.cards, new SortAgainstSuitAndValue());
    }
}
