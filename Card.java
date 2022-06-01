class Card {
    
    private char suit;
    private int rank;

    public Card(char suit, int rank){
        this.suit = suit;
        this.rank = rank;
    }

    public char getSuit(){
        return suit;
    }

    public int getRank(){
        return rank;
    }

    public String toString(){
        String result = "";
        if(rank == 1){
            result += "Ace";  
        }
        if(rank > 1 && rank < 11){
            result += "Ace";  
        }
        if(rank == 11){
            result += "Jack";  
        }
        if(rank == 12){
            result += "Queen";  
        }
        if(rank == 13){
            result += "King";  
        }
        result += " of " + suit;
        return result;
    }

















}
