import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public StartButton start = new StartButton();
    public StartScreen load = new StartScreen();
    public Leprechuan lucky = new Leprechuan();
    GifImage yay = new GifImage("StartScreen.gif");
    public Title Clove = new Title();
    public Rainbow rain = new Rainbow();
    public BlackjackGame game = new BlackjackGame(3,2);
    
    
    
 /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {   
        super(1100,600,1,false);
        addObject(load,630,300);
        addObject(rain,550,430);
        addObject(start,550,500);
        addObject(lucky,960,560);
        addObject(Clove,560,190);
        addObject(new HitButton(), getWidth() - 800, getHeight() - 50);
        
     }
    
     public void act(){
         if(Greenfoot.mousePressed(start)){
            removeObject(load);
            removeObject(rain);
            removeObject(lucky);
            removeObject(start);
            removeObject(Clove);
            addObject(game,500,300);
            addObject(game,500,300);
         }
        }
     }


