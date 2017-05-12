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
    
    public void onEntry(){}
    
    public void onExit(){}
    
    public void drawUI(){}
    
    public void tearDownUI(){}
    
    public void onButtonPressEvent(ButtonPressEventType buttonEvent){}
    
    public void onCardSwipeEvent(CardSwipeEventType cardSwipeEventType) {}
      
    public void onNozzleEvent(NozzleEventType nozzleEvent){}
    
    public void onKeyPressEvent(KeyPressEventType keyEvent){}
    
    public void onFuelSelectedEvent(FuelSelectEventType event) {}
    
   public void doNotPrintReceipt()    {}
    
    public void printreceipt() {}
   
    
    public void connectHelp()  {}
   
    
    public void validateCreditCard() {}
  
    
    public void cancelZipcodeEntry()  {}
   
       
    public void cancelTransaction()  {}

    }