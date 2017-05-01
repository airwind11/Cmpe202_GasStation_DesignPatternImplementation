import greenfoot.*;
/**
 * State where the gas station prompts for a zipcode for validation and waits for a response.
 * 
 * @author Arun Tej Chennadi
 * @version 1.0
 */
public class WaitingForZipCodeState implements State 
{
    World world;
    StateEngine engine;
    
    public WaitingForZipCodeState(World world, StateEngine engine){
        this.world = world;
        this.engine = engine;
    }
    
    
    public void onEntry(){
        System.out.println("Moving to waiting for zip code state");
        //ScreenAndKeypad simpleUI = new ScreenAndKeypad(this, this.world);
        //simpleUI.render();
        //simpleUI.setDisplayMessage("Please enter the zipcode!!");
        //simpleUI.setButtonMappedMessage("Confirm", 5);
        //simpleUI.setButtonMappedMessage("Cancel", 6);
        
    }
    
    public void onExit(){}
    
    public void drawUI(){}
    
    public void tearDownUI(){}
    
    public void onEvent(EventType event){}
}
