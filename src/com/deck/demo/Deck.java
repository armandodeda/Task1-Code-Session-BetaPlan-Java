package com.deck.demo;

import javax.lang.model.type.DeclaredType;
import java.util.ArrayList;
import java.util.HashMap;

public class Deck {
    public HashMap<String,ArrayList<Cards>> map= new HashMap<String,ArrayList<Cards>>();

    public Deck(){
        Cards cards=new Cards();
        map.put("Hearts",cards.makeCards("Hearts"));
        map.put("Clubs",cards.makeCards("Clubs"));
        map.put("Diamonds",cards.makeCards("Diamonds"));
        map.put("Speads",cards.makeCards("Speads"));
        map.put("Joker",cards.makeJokers("Joker"));

    }

    public void display(){
        System.out.println("---Your deck has 54 cards----\n");
        for (String key: map.keySet()){
            System.out.println(key+"\n"+map.get(key)+"\n\n");
        }
    }


}
