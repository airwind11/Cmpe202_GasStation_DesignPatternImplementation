import greenfoot.*;

/**
 * Write a description of class CarWashState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarWashState implements State 
{
    World world;
    StateEngine engine;
    
    public CarWashState(World world, StateEngine engine){
        this.world = world;
        this.engine = engine;
    }
    
    public void onEntry(){
        engine.getDisplayConsole().setDisplayMessage("Do You want Car Wash!!"); 
        
         engine.getDisplayConsole().setButtonMappedMessage("Yes", 1);
        engine.getDisplayConsole().setButtonMappedMessage("No", 4);
        
        engine.getButtonAtIndex(0).setCommand(new ConfirmCommand(this));
        engine.getButtonAtIndex(3).setCommand(new CancelCommand(this));
        // this.drawUI();

    }
    
    
    public void onExit(){
        // this.tearDownUI();
        
        engine.getDisplayConsole().setButtonMappedMessage("", 1);
        engine.getDisplayConsole().setButtonMappedMessage("", 4);
        
        engine.getButtonAtIndex(0).setCommand(null);
        engine.getButtonAtIndex(3).setCommand(null);
        
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
       
    }
      
    public void onNozzleEvent(NozzleEventType nozzleEvent) {}
    
        
   
    
    public void help()
    {
    }
    
  private void alwaysPrint()
  {
         this.engine.setShouldPrintReceipt(true);
        
        this.engine.changeStateTo(engine.getPrintingReceiptState());
        
    }
    
    public void confirm()
    {
        
        Message coupon = new Message(100, 100);
        this.world.addObject(coupon, 850, 550);
        coupon.setText("Coupon");
        Greenfoot.delay(100);
        this.world.removeObject(coupon);
    this.alwaysPrint();
        
        
    }
    
    
    public void cancel()
    {
         this.alwaysPrint();
    }
    
}
