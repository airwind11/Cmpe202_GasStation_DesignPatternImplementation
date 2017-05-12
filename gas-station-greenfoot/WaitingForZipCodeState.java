import greenfoot.*;
/**
 * State where the gas station prompts for a zipcode for validation and waits for a response.
 * 
 * @author Arun Tej Chennadi
 * @version 1.0
 */
public class WaitingForZipCodeState implements State 
{
    World world;
    StateEngine engine;
    String zipPrompt = "";
    
    public WaitingForZipCodeState(World world, StateEngine engine){
        this.world = world;
        this.engine = engine;
    }
    
    
    public void onEntry(){
        //engine.getDisplayConsole().screen.clearScreen();
        engine.getDisplayConsole().setDisplayMessage("Please enter the zipcode!!");
        engine.getDisplayConsole().setButtonMappedMessage("Confirm", 5);
        engine.getDisplayConsole().setButtonMappedMessage("Cancel", 6);
        engine.getButtonAtIndex(4).setCommand(new ConfirmCommand(this));
        engine.getButtonAtIndex(5).setCommand(new CancelCommand(this));
        zipPrompt = ""; // Reset prompt
        
    }
    
    public void onExit(){
        engine.getDisplayConsole().setDisplayMessage("");
        engine.getDisplayConsole().setDynamicMessage("");
          engine.getButtonAtIndex(4).setCommand(null);
        engine.getButtonAtIndex(5).setCommand(null);
        
        // TODO: Find a better way to do this
        engine.getDisplayConsole().setButtonMappedMessage("", 5);
        engine.getDisplayConsole().setButtonMappedMessage("", 6);
       // engine.getDisplayConsole().screen.clearScreen();
    }
    
    public void drawUI(){}
    
    public void tearDownUI(){}
    
    public void onButtonPressEvent(ButtonPressEventType event) {


        int eid = event.getId();
        //System.out.println(eid);

        // Handling events other than keyPress
        // TODO: We need to have separate events for these
        if (eid > 100) {
            if (eid == 105) {
                // TODO: If zip code valid?
                engine.changeStateTo(engine.getWaitingForFuelSelectState()); return;
            }
            if (eid == 106) {
                // TODO: Back to initial state
                
            }
            
        }

    }
    
    public void onKeyPressEvent(KeyPressEventType keyEvent) {
        int eid = keyEvent.getId();
        //System.out.println(eid);
        // Beep if the prompt has already 5 characters
        if (zipPrompt.length() == 5 && eid != 10) {
            Greenfoot.playSound("beep.wav"); // TODO: This should probably handled by a speaker class or something in StateEngine
            return;
        }
        

        if (eid >= 0 && eid <= 9) {
            zipPrompt += (eid + "");
        } else if (eid == 10) { // Backspace
            if (!zipPrompt.isEmpty()) {
                zipPrompt = zipPrompt.substring(0, (zipPrompt.length() - 1));
            } 
        }

        engine.getDisplayConsole().setDynamicMessage(zipPrompt);        
    }

    
    public void onFuelSelectedEvent(FuelSelectEventType event) {}
    
    public void onCardSwipeEvent(CardSwipeEventType cardSwipeEventType) {}
      
    public void onNozzleEvent(NozzleEventType nozzleEvent) {}
    
        
    public void printreceipt()
    {
    }
    
    public void help()
    {
    }
    
     public void doNotPrintReceipt()
   {
    }
    
    
    public void confirm()
    {
        System.out.println("Yo");
        this.engine.changeStateTo(engine.getWaitingForFuelSelectState());
    }
    
    
    public void cancel()
    {
         System.out.println("Ye");
        this.engine.changeStateTo(engine.getFuelDispensedState());
    }
    
    

    
}
