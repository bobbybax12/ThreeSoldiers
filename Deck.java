import java.util.ArrayList;
import java.util.Random;

import javax.lang.model.element.ElementVisitor;

class Deck {
    private ArrayList <Card> deck = new ArrayList<>();
    public int top;
    public static final char[] suits = {'c', 'h', 's', 'd'};\
    public static final int[] rank = {0,1,2,3,4,5,6,7,8,9,10,11,12};
    int counter;
    public Card faceUp;
    public char currentSuit;
    public String faceUpString;

    public Deck(){
        for(int i = 0;i<suits.length;i++){
            for(int j = 0;j<rank.length;j++){
                deck.add(new Card(suits[i], rank[j]));
            }
        }
    }

    public Card draw(){
        Random rand = new Random();
        int index = rand.nextInt(deck.size());
        return deck.remove(index);
        }

    public boolean canDeal(){
        if(deck.isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }

    
    









}
