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
    Command mappedCommand;
    
    
    public Button(){}
    
    public void setCommand(Command tobemapped)
    {
        this.mappedCommand = tobemapped;
    }
    
    public void act() 
    {
        if(Greenfoot.mousePressed(this)){
            //parent.buttonpress(this.event);
            if(mappedCommand==null)
            {
                
            }
            else
            {
            this.mappedCommand.execute();
        }
        }
    }    
}
