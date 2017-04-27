import greenfoot.*;
/**
 * Initial State where the gas station waits for a card swipe.
 * 
 * @author Arun Tej Chennadi
 * @version 1.0
 */
public class WaitingForCreditCardState implements State 
{
    World world;
    StateEngine engine;
    
    public WaitingForCreditCardState(World world, StateEngine engine){
        this.world = world;
        this.engine = engine;
    }
    
    public void onEntry(){}
    
    public void onExit(){}
    
    public void drawUI(){}
    
    public void tearDownUI(){}
}
