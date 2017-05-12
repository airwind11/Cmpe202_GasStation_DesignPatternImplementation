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
    public Message dynamicMessage;
    public World world;
    public String prompt = "";
    
    public Screen(World world){
        this.world = world;
        buttonMappedMessages = new Message[8];
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
    
    public void setDynamicMessage(String msg){
        this.dynamicMessage = new Message(300, 25);
        this.world.addObject(this.dynamicMessage, 500, 280);
        this.dynamicMessage.setText(msg);
    }
    
    public void setButtonMappedMessage(String msg, int buttonNo){
        switch(buttonNo){
        case 1:
            buttonMappedMessages[buttonNo - 1] =  new Message(200,35);
            this.world.addObject(buttonMappedMessages[buttonNo - 1], 340, 95);
            break;
        case 2:
            buttonMappedMessages[buttonNo - 1] =  new Message(200,35);
            this.world.addObject(buttonMappedMessages[buttonNo - 1], 340, 145);
            break;
        case 3:
            buttonMappedMessages[buttonNo - 1] =  new Message(200,35);
            this.world.addObject(buttonMappedMessages[buttonNo - 1], 340, 195);
            break;
        case 4:
            buttonMappedMessages[buttonNo - 1] =  new Message(200,35);
            this.world.addObject(buttonMappedMessages[buttonNo - 1], 340, 245);
            break;
        case 5:
            buttonMappedMessages[buttonNo - 1] =  new Message(100,35);
            this.world.addObject(buttonMappedMessages[buttonNo - 1], 710, 95);
            break;
        case 6:
            buttonMappedMessages[buttonNo - 1] =  new Message(100,35);
            this.world.addObject(buttonMappedMessages[buttonNo - 1], 710, 145);
            break;
        case 7:
            buttonMappedMessages[buttonNo - 1] =  new Message(100,35);
            this.world.addObject(buttonMappedMessages[buttonNo - 1], 710, 195);
            break;
        case 8:
            buttonMappedMessages[buttonNo - 1] =  new Message(100,35);
            this.world.addObject(buttonMappedMessages[buttonNo - 1], 710, 245);
            break;
        }
        
        buttonMappedMessages[buttonNo - 1].setText(msg);
    }
    
    
    public void clearScreen()
    {
        
      for(Message c:buttonMappedMessages)
      {
          c=null;
          
        }
mainDisplay=null;
dynamicMessage=null;
        
        
    }

}
