import greenfoot.*;
import java.util.List;
/**
 * Initial State where the gas station waits for a card swipe.
 * 
 * @author Arun Tej Chennadi
 * @version 1.0
 */
public class WaitingForCreditCardState implements State 
{
    World world;
    StateEngine engine;
    
    public WaitingForCreditCardState(World world, StateEngine engine){
        this.world = world;
        this.engine = engine;
    }
    
    public void onEntry(){
        
        //engine.getDisplayConsole().screen.clearScreen();
        // this.drawUI();

    }
    
    
    public void onExit(){
        // this.tearDownUI();
        
        //engine.getDisplayConsole().screen.clearScreen();
    }
    
    public void drawUI(){
        //ScreenAndKeypad simpleUI = new ScreenAndKeypad(this, this.world);
        //simpleUI.render();
        //simpleUI.setDisplayMessage("Please swipe your card to begin!!"); 
        //CardAndSwipeUI cardSwipe = new CardAndSwipeUI(this, this.world);
        //cardSwipe.render();

        
    }
    
    public void tearDownUI(){
        //List objects = world.getObjects(null);
        //world.removeObjects(objects);
    }
    
    
    public void onKeyPressEvent(KeyPressEventType keyEvent){
        Greenfoot.playSound("beep.wav");
    }
    
    public void onButtonPressEvent(ButtonPressEventType event) {
        Greenfoot.playSound("beep.wav");
    }
    
    public void onFuelSelectedEvent(FuelSelectEventType event) {}
    
    public void onCardSwipeEvent(CardSwipeEventType cardSwipeEventType) {
        this.engine.changeStateTo(engine.getWaitingForZipCodeState());
    }
      
    public void onNozzleEvent(NozzleEventType nozzleEvent) {}
    
        
    public void printreceipt()
    {
    }
    
    public void connectHelp()
    {
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
    }
    
}
