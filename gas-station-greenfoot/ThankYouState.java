import greenfoot.*;
 /**
 * Intermediate state whose position can change depending upon scenario.
 * 
 * @author Arun Tej Chennadi
 * @version 1.0
 */
public class ThankYouState implements State 
{
    World world;
    StateEngine engine;
    
    public ThankYouState(World world, StateEngine engine){
        this.world = world;
        this.engine = engine;
    }
    
    public void onEntry(){
        engine.getDisplayConsole().setDisplayMessage("Have a great day");
        Greenfoot.delay(150);
        engine.changeStateTo(engine.getWaitingForCreditCardState());
    }
    
    public void onExit(){}
    
    public void drawUI(){}
    
    public void tearDownUI(){}
    
    public void onButtonPressEvent(ButtonPressEventType buttonEvent){}
    
    public void onCardSwipeEvent(CardSwipeEventType cardSwipeEventType){}
      
    public void onNozzleEvent(NozzleEventType nozzleEvent){}
    
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
    

    
}


