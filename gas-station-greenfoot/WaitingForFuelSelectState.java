import greenfoot.*;
/**
 * Intermediate state where the fuel selection options are shown.
 * 
 * @author Arun Tej Chennadi
 * @version 1.0
 */
public class WaitingForFuelSelectState implements State 
{
    World world;
    StateEngine engine;
    FuelSelectEventType fuelType = null;
    
    public WaitingForFuelSelectState(World world, StateEngine engine){
        this.world = world;
        this.engine = engine;
    }
    
    public void onEntry(){
       // engine.getDisplayConsole().screen.clearScreen();
        engine.getDisplayConsole().setDisplayMessage("Please select fuel type");
         engine.getDisplayConsole().setButtonMappedMessage("Cancel Transaction", 1);
        engine.getDisplayConsole().setButtonMappedMessage("Help", 4);
        engine.getButtonAtIndex(0).setCommand(new CancelTransactionCommand(this));
        engine.getButtonAtIndex(3).setCommand(new ConnectHelpCommand(this));
    }
    
    public void onExit(){
        
         engine.getButtonAtIndex(0).setCommand(null);
        engine.getButtonAtIndex(3).setCommand(null);
       //engine.getDisplayConsole().screen.clearScreen();
    
    }
    
    public void drawUI(){}
    
    public void tearDownUI(){}
    
 
    public void onButtonPressEvent(ButtonPressEventType event){}
    
    public void onKeyPressEvent(KeyPressEventType keyEvent){}
    
    public void onFuelSelectedEvent(FuelSelectEventType event) {}
    
    public void onCardSwipeEvent(CardSwipeEventType cardSwipeEventType) {}
      
    public void onNozzleEvent(NozzleEventType nozzleEvent) {
    
        // TODO : If nozzle event = pressed && fuelTypeSelected?
            // Then change state to dispensing fuel
          
    
    }
    
        
    public void printreceipt()
    {
    }
    
    public void connectHelp()
    {
        System.out.println("HelpTesting");
        this.engine.changeStateTo(engine.getFuelDispensedState());
    }
    
     public void doNotPrintReceipt()
   {
    }
    
    public void validateCreditCard()
    {
    }
    
    
    public void cancelZipcodeEntry()
    {
    }
    
    
    public void cancelTransaction()
     {
          System.out.println("cancelledTransaction");
        this.engine.changeStateTo(engine.getWaitingForZipCodeState());
    }
    
}

