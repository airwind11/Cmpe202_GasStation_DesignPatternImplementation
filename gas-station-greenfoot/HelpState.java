import greenfoot.*;
public class HelpState implements State
{
    World world;
    StateEngine engine;
    
    public HelpState(World world, StateEngine engine)
    {
        this.world = world;
        this.engine = engine;
    }
    
    public void onEntry(){
        engine.getDisplayConsole().setDisplayMessage("Please see the cashier.");
        engine.getDisplayConsole().setButtonMappedMessage("Back", 1);        
        engine.getButtonAtIndex(0).setCommand(new CancelCommand(this));
    }
    
    public void onExit(){
        engine.getDisplayConsole().setDisplayMessage("");
        engine.getDisplayConsole().setButtonMappedMessage("", 1);   
    }
    
    public void drawUI(){}
    
    public void tearDownUI(){}
    
    public void onButtonPressEvent(ButtonPressEventType buttonEvent){}
    
    public void onCardSwipeEvent(CardSwipeEventType cardSwipeEventType) {}
      
    public void onNozzleEvent(NozzleEventType nozzleEvent){}
    
    public void onKeyPressEvent(KeyPressEventType keyEvent){}
    
    public void onFuelSelectedEvent(FuelSelectEventType event) {}
    
    
    public void help()  {}
   
    
    public void confirm() {}
  
    
    public void cancel()  {
         this.engine.changeStateTo(engine.getWaitingForCreditCardState());
    }
   
       

    }