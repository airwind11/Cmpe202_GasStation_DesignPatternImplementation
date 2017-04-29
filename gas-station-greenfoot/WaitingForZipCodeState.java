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
    
    
    public void onEntry(){}
    
    public void onExit(){}
    
    public void drawUI(){}
    
    public void tearDownUI(){}
    
    public void onEvent(EventType event){}
}
