import java.util.Random;

class Deck {
    private Card[] deck = new Card[52];
    public int top;
    public static final char[] suits = {'c', 'h', 's', 'd'};\
    public static final int[] rank = {0,1,2,3,4,5,6,7,8,9,10,11,12};
    int counter;
    public Card faceUp;
    public char currentSuit;
    public String faceUpString;

    public Deck(){
        int counter = 0;
        int top = 0;
        for(int i = 0;i<suits.length;i++){
            for(int j = 0;j<rank.length;j++){
                deck[counter] = new Card(suits[i], rank[j]);
                counter++;
            }
        }
    }

    public Card deal(){
        top = top+1;
        return deck[top-1];
    }

    public void shuffle(){
        Random rand = new Random();
        for(int i = 0;i<15000;i++){
            int x = (int) (Math.random()*deck.length);
            int y = (int) (Math.random()*deck.length);
            Card temp = deck[x];
            deck[x]=deck[y];
            deck[y]=temp;
        }
    }

    
    









}
