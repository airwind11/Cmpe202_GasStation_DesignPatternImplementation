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
        engine.getDisplayConsole().setDisplayMessage("Please enter the zipcode!!");
        engine.getDisplayConsole().setButtonMappedMessage("Confirm", 5);
        engine.getDisplayConsole().setButtonMappedMessage("Cancel", 6);
        zipPrompt = ""; // Reset prompt
        
    }
    
    public void onExit(){}
    
    public void drawUI(){}
    
    public void tearDownUI(){}
    
    public void onEvent(EventType event) {


        int eid = event.getId();
        System.out.println(eid);

        // Handling events other than keyPress
        // TODO: We need to have separate events for these
        if (eid > 100) {
            if (eid == 105) {
                // TODO: If zip code valid?
                engine.changeStateTo(engine.getFuelSelectState()); return;
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
}
