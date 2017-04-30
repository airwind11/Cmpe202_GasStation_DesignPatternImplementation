import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Screen extends Actor
{
    public Message[] buttonMappedMessages;
    public Message mainDisplay;
    public World world;
    
    public Screen(World world){
        this.world = world;
        
    }
    
    /**
     * Act - do whatever the Screen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public void setDisplayMessage(String msg){
        this.mainDisplay = new Message(300, 75);
        this.world.addObject(this.mainDisplay, 500, 180);
        this.mainDisplay.setText(msg);
    }
    
    public void setButtonMappedMessage(String msg, int buttonNo){
        buttonMappedMessages[buttonNo - 1].setText(msg);
    }
}
