import java.util.Scanner;

import javax.print.event.PrintEvent;

import java.util.ArrayList;

class Game{

    private Scanner scan;
    private Player p1;
    private Card compCard;
    private Card playerCard;
    private Deck d; 

    public Game(){
        scan = new Scanner (System.in);
        p1 = new Player();
        d = new Deck();
    }

    public boolean play(){
        System.out.println("Instructions");
        compCard = d.draw();
        playerCard = p1.draw();

    }
        
    System.out.println("Your card is a(n) "+playerCard.toString());
    System.out.println("Would you like to pass or stay? 1 (pass) or 2 (stay)");
    int decision = scan.nextInt();
    if(decision == 1 ){
        swap(playerCard, compCard);
    }
    else{
        






    }


    public Card swap(Card pcard, Card ccard){
        Card temp = pcard;
        pcard = ccard;
        ccard = temp;
        return pcard; 
    }


}
}

