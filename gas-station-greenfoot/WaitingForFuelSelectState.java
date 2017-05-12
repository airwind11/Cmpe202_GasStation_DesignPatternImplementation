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
    NozzleEventType nozzleEvent = null;
    
    public WaitingForFuelSelectState(World world, StateEngine engine){
        this.world = world;
        this.engine = engine;
    }
    
    public void onEntry(){
        // Resetting state on entry
        fuelType = null;
        nozzleEvent = null;
       // engine.getDisplayConsole().screen.clearScreen();
        engine.getDisplayConsole().setDisplayMessage("Select fuel type and remove nozzle");
        engine.getDisplayConsole().setButtonMappedMessage("Cancel Transaction", 1);
        engine.getDisplayConsole().setButtonMappedMessage("Help", 4);
        
        engine.getButtonAtIndex(0).setCommand(new CancelCommand(this));
        engine.getButtonAtIndex(3).setCommand(new HelpCommand(this));
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
    
    public void onFuelSelectedEvent(FuelSelectEventType event) {
        fuelType = event;
        
        if (this.nozzleEvent == null) {
           engine.getDisplayConsole().setDisplayMessage("Please remove nozzle");
        } else {
           dispenseFuel();
        }
        
    }
    
    public void onCardSwipeEvent(CardSwipeEventType cardSwipeEventType) {}
      
    public void onNozzleEvent(NozzleEventType nozzleEvent) {
        if (nozzleEvent == NozzleEventType.NOZZLE_PRESSED) {
            this.nozzleEvent = nozzleEvent;
            
            if (this.fuelType == null) {
               engine.getDisplayConsole().setDisplayMessage("Please select fuel type");
            } else {
               dispenseFuel();
            }        
        }
    }
    
        
    public void printreceipt()
    {
    }
    
    public void dispenseFuel() {
        System.out.println("dispensing fuel");
        this.engine.changeStateTo(engine.getDispensingFuelState());  
    }
    
    public void help()
    {
        System.out.println("HelpTesting");
        this.engine.changeStateTo(engine.getFuelDispensedState());
    }
    
     public void doNotPrintReceipt()
   {
    }
    
    public void confirm()
    {
    }
    
    

    
    
    public void cancel()
     {
          System.out.println("cancelledTransaction");
        this.engine.changeStateTo(engine.getWaitingForZipCodeState());
    }
    
}

