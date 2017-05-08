import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    ScreenAndKeypad parent;
    ButtonPressEventType event;
    
    public Button(){}
    
    public Button(ScreenAndKeypad parent, ButtonPressEventType event){
        this.parent = parent;
        this.event = event;
    }
    
    public void act() 
    {
        if(Greenfoot.mousePressed(this)){
            parent.buttonpress(this.event);
        }
    }    
}
