import greenfoot.*; 
/**
 * Intermediate state which is entered after the fuel type is selected.
 * 
 * @author Arun Tej Chennadi
 * @version 1.0
 */
public class DispensingFuelState implements State 
{
    World world;
    StateEngine engine;
    
    public DispensingFuelState(World world, StateEngine engine){
        this.world = world;
        this.engine = engine;
    }
    
    public void onEntry(){
       engine.getDisplayConsole().setDisplayMessage("Dispensing fuel ...");
    }
    
    public void onExit(){}
    
    public void drawUI(){}
    
    public void tearDownUI(){}
    
    public void onButtonPressEvent(ButtonPressEventType buttonEvent){}
    
    public void onCardSwipeEvent(CardSwipeEventType cardSwipeEventType){}
      
    public void onNozzleEvent(NozzleEventType nozzleEvent){
        if (nozzleEvent == NozzleEventType.NOZZLE_RELEASED) {
            engine.changeStateTo(engine.getWaitingForReceiptConfirmationState());
        }
    }
    
    public void onKeyPressEvent(KeyPressEventType keyEvent){}
    
    public void onFuelSelectedEvent(FuelSelectEventType event) {}
    
    
    public void help()
    {
    }
    
    
    
    public void confirm()
    {
    }
    
    
    public void cancel()
    {
    }
    
    
    public void cancelTransaction()
   {
    }
    
    
    
}


