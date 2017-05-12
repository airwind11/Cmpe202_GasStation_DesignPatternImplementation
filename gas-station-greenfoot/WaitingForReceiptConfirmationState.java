import greenfoot.*;
/**
 * End State which shows the bill and displays thank you message.
 * 
 * @author Arun Tej Chennadi
 * @version 1.0
 */
public class WaitingForReceiptConfirmationState implements State 
{
    World world;
    StateEngine engine;
    
    public WaitingForReceiptConfirmationState(World world, StateEngine engine){
        this.world = world;
        this.engine = engine;
    }
    
    public void onEntry()
    {
        engine.getDisplayConsole().setDisplayMessage("Do you want a receipt?");
        engine.getDisplayConsole().setButtonMappedMessage("Yes", 1);
        engine.getDisplayConsole().setButtonMappedMessage("No", 4);
        engine.getButtonAtIndex(0).setCommand(new ConfirmCommand(this));
        engine.getButtonAtIndex(3).setCommand(new CancelCommand(this));
    }
    
    public void onExit(){
        engine.getButtonAtIndex(0).setCommand(new ConfirmCommand(null));
        engine.getButtonAtIndex(1).setCommand(new CancelCommand(null));
        
        engine.getDisplayConsole().setButtonMappedMessage("", 1);
        engine.getDisplayConsole().setButtonMappedMessage("", 4);
    }
    
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
        this.engine.changeStateTo(engine.getPrintingReceiptState());
    }
    
    
    public void cancel()
    {
        this.engine.changeStateTo(engine.getThankYouState());
    }
    
   
    
}


