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
    
    public void onButtonPressEvent(ButtonPressEventType buttonEvent){}
    
    public void onCardSwipeEvent(CardSwipeEventType cardSwipeEventType){}
      
    public void onNozzleEvent(NozzleEventType nozzleEvent){}
    
    public void onKeyPressEvent(KeyPressEventType keyEvent){}
    
    public void onFuelSelectedEvent(FuelSelectEventType event) {}
    
     public void doNotPrintReceipt()
   {
    }
    
        
    public void printreceipt()
    {
    }
    
    public void help()
    {
    }
    
    
    
    public void confirm()
    {
    }
    
    
    public void cancel()
    {
    }
    

    
}


