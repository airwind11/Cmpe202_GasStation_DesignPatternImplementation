import greenfoot.*;
 /**
 * Intermediate state whose position can change depending upon scenario.
 * 
 * @author Arun Tej Chennadi
 * @version 1.0
 */
public class ReceiptConfirmationState implements State 
{
    World world;
    StateEngine engine;
    
    public ReceiptConfirmationState(World world, StateEngine engine){
        this.world = world;
        this.engine = engine;
    }
    
    public void onEntry(){}
    
    public void onExit(){}
    
    public void drawUI(){}
    
    public void tearDownUI(){}
}


