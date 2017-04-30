import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Message here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Message extends Actor
{
    GreenfootImage gi;
    
    public Message(){
    
        gi = new GreenfootImage( 100, 50);
        setImage(gi);
    }
    
    public Message(int width, int height){
    
        gi = new GreenfootImage(width, height);
        setImage(gi);
    }
    
    public void setText(String msg){
    
        gi.clear();
        gi.setColor(greenfoot.Color.WHITE);
        gi.fill();
        gi.setColor(greenfoot.Color.BLACK);
        gi.setFont(gi.getFont().deriveFont(18f));
        gi.drawString(msg, 0, 25);
        
    }
    
    /**
     * Act - do whatever the Message wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }    
}