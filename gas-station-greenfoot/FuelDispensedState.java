import greenfoot.*;
/**
 * End State which shows the bill and displays thank you message.
 * 
 * @author Arun Tej Chennadi
 * @version 1.0
 */
public class FuelDispensedState implements State 
{
    World world;
    StateEngine engine;
    
    public FuelDispensedState(World world, StateEngine engine){
        this.world = world;
        this.engine = engine;
    }
    
    public void onEntry()
    {
         engine.getDisplayConsole().setDisplayMessage("Do You Want  to print Receipt?");
         engine.getDisplayConsole().setButtonMappedMessage("Yes", 1);
        engine.getDisplayConsole().setButtonMappedMessage("No", 4);
        engine.getButtonAtIndex(0).setCommand(new PrintreceiptCommand(this));
        engine.getButtonAtIndex(3).setCommand(new DoNotPrintReceiptCommand(this));
    }
    
    public void onExit(){
     engine.getButtonAtIndex(0).setCommand(new PrintreceiptCommand(null));
        engine.getButtonAtIndex(1).setCommand(new DoNotPrintReceiptCommand(null));
    
    
    
    }
    
    public void drawUI(){}
    
    public void tearDownUI(){}
    
    public void onButtonPressEvent(ButtonPressEventType buttonEvent){}
    
    public void onCardSwipeEvent(CardSwipeEventType cardSwipeEventType){}
      
    public void onNozzleEvent(NozzleEventType nozzleEvent){}
    
    public void onKeyPressEvent(KeyPressEventType keyEvent){}
    
    public void onFuelSelectedEvent(FuelSelectEventType event) {}
    
     public void doNotPrintReceipt()
     
   {
         System.out.println("Ye");
         engine.getDisplayConsole().setDisplayMessage("Have a Good Day");
        this.engine.changeStateTo(engine.getWaitingForCreditCardState());
    }
    
        
    public void printreceipt()
    {
          System.out.println("Ye");
          Message Receipt = new Message(300, 75);
        this.world.addObject(Receipt, 1000, 1000);
         engine.getDisplayConsole().setDisplayMessage("Have a Good Day");
        Receipt.setText("Your Receipt");
        this.engine.changeStateTo(engine.getWaitingForCreditCardState());
    }
    
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


