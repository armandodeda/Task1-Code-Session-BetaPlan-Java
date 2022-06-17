package com.deck.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cards {

    String name;
    int rank;
    String suit;
    private String[] names={"A","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};



    public Cards(){
    }
    public Cards(String suit,String name,int rank){
        this.suit=suit;
        this.name=name;
        this.rank=rank;
    }

    public ArrayList<Cards> makeCards(String suit) {
        ArrayList<Cards> cards = new ArrayList<Cards>();
        for (int j = 0; j < 13; j++) {
            cards.add(new Cards(suit, names[j], (j + 1)));
        }
        return cards;
    }

    public ArrayList<Cards> makeJokers(String suit){
        ArrayList<Cards> cards = new ArrayList<Cards>();
        cards.add(new Cards(suit,"Black",Integer.MAX_VALUE-1));
        cards.add(new Cards (suit,"Red",Integer.MAX_VALUE));

        return cards;
    }

    @Override
    public String toString(){
        if(suit.equals("Joker"))
            return name+" "+suit+"\n";
        return name+" of "+suit+"\n";
    }


}
