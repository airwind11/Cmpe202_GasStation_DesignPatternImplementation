import greenfoot.*;
/**
 * Write a description of class ScreenAndKeypad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScreenAndKeypad  
{
    World world;
    State parentState;
    
    public ScreenAndKeypad(State s, World world){
        this.parentState = s;
        this.world = world;
    }
    
    public void render(){}
    
    public void keypress(){}
}
