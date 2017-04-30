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
    int no;
    
    public Button(){}
    
    public Button(ScreenAndKeypad parent, int no){
        this.parent = parent;
        this.no = no;
    }
    
    public void act() 
    {
        if(Greenfoot.mousePressed(this)){
            parent.keypress("BUTTON", no);
        }
    }    
}
