import greenfoot.*;
/**
 * Intermediate state where the fuel selection options are shown.
 * 
 * @author Arun Tej Chennadi
 * @version 1.0
 */
public class FuelSelectState implements State 
{
    World world;
    StateEngine engine;
    
    public FuelSelectState(World world, StateEngine engine){
        this.world = world;
        this.engine = engine;
    }
    
    public void onEntry(){
        engine.getDisplayConsole().setDisplayMessage("Please select fuel type");
    }
    
    public void onExit(){}
    
    public void drawUI(){}
    
    public void tearDownUI(){}
    
 
    public void onEvent(EventType event){}
    
    public void onKeyPressEvent(KeyPressEventType keyEvent){}
}

