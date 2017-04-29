import greenfoot.*;
/**
 * End State which shows the bill and displays thank you message.
 * 
 * @author Arun Tej Chennadi
 * @version 1.0
 */
public class FuelDispensedState implements State 
{
    World world;
    StateEngine engine;
    
    public FuelDispensedState(World world, StateEngine engine){
        this.world = world;
        this.engine = engine;
    }
    
    public void onEntry(){}
    
    public void onExit(){}
    
    public void drawUI(){}
    
    public void tearDownUI(){}
    
    public void onEvent(EventType event){}
}


