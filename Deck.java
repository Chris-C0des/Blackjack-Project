import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class Deck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deck extends Actor
{
    private Card[] card;
    private int numOfCards;
    int current;
    
    public Deck(int numOfDecks){
        current = 0;
        numOfCards = numOfDecks*52;
        card = new Card[numOfCards];
        int index = 0;
        for (int deckCount=0; deckCount < numOfDecks; deckCount++) {
            for(Suit suit: Suit.values()){
                for(Rank rank: Rank.values()){
                    if (rank == Rank.JOKER){
                        continue;
                    }
                    card[index++] = new Card(rank,suit);
                }
            }
        }
        shuffle();
        setImage(card[numOfCards-1].getImage());
    }
    
    public void shuffle(){
        Random rand = new Random();
        for(int index = 0; index < numOfCards-1; index++){
            int swapIndex = rand.nextInt(numOfCards-index)+index;
            Card temp = card[index];
            card[index] = card[swapIndex];
            card[swapIndex] = temp;
        }
    }
    
    public void draw(){
        //deck[current]; use this to make a new face up card.
        // if (deck[current].getRank() == Rank.JACK || Rank.KING || Rank.QUEEN)
        // if the rank is Jack, queen, or king
        //      counter+=10
        // else if the rank is ace
        //      counter += 11 or 1
        //else
        //  counter += the rank of the current
        
    }

    
    
    /**
     * Act - do whatever the Deck wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        /*
        while counter < 21{
            draw();
        }
        if (counter == 21){
            display "You Win"
        }
        else if (counter > 21){
            display "You Lose"
        }
        */
    }
}
