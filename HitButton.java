import greenfoot.*;

/**
 * Write a description of class Hit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HitButton extends Actor
{
    private GreenfootImage buttonImage;
    private boolean isClicked;
    
    public HitButton() {
        buttonImage = new GreenfootImage("Hitbutton.png");
        setImage(buttonImage);
        isClicked = false;
    }
    
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            isClicked = true;
            hit();
        }
    }
    
    public boolean isClicked() {
        return isClicked;
    }
    
    public void reset() {
        isClicked = false;
    }
    
    private void hit(){
        Suit[] suits = Suit.values();
        Rank[] ranks = Rank.values();
        Suit randomSuit = suits[Greenfoot.getRandomNumber(suits.length)];
        Rank randomRank = ranks[Greenfoot.getRandomNumber(ranks.length)];
        Card newCard = new Card(randomRank, randomSuit, true);
        getWorld().addObject(newCard, getX()-100, getY()-200);
    }
}