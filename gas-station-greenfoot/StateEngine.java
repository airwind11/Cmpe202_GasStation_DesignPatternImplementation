import greenfoot.*;
/**
 * The controller class which executes state changes.
 * 
 * @author Arun Tej Chennadi
 * @version 1.0
 */
public class StateEngine  
{
    private World world;
    State waitingForCreditCardState;
    State waitingForZipCodeState;
    State waitingForFuelSelectState;
    State dispensingFuelState;
    State fuelDispensedState;
    State receiptConfirmationState;
    State helpState;
    
    
    States currentState;
    State currentStateObj;
    GasStationType type;
    
    private ScreenAndKeypad simpleUI;
    private CardAndSwipeUI cardSwipe;
    private FuelSelectButtonGroup fuelSelectButtonGroup;
    
    public StateEngine(World world, GasStationType type){
        this.world = world;
        this.type = type;
        
        // Render initial state
        render();
        
        this.waitingForCreditCardState = new WaitingForCreditCardState(world,this);
        this.waitingForZipCodeState = new WaitingForZipCodeState(world,this);
        this.waitingForFuelSelectState = new WaitingForFuelSelectState(world, this);
        this.dispensingFuelState = new DispensingFuelState(world, this);
        this.fuelDispensedState =  new FuelDispensedState(world, this);
        this.receiptConfirmationState = new ReceiptConfirmationState(world, this);
        this.helpState = new HelpState(world, this);
        this.currentState = States.WaitingForCreditCard;
        this.currentStateObj = this.waitingForCreditCardState;
        
        this.currentStateObj.onEntry();
    }
    
    public StateEngine(){
    
    }
    
    public World getWorld() {
        return world;
    }
    
    private void render() {
        simpleUI = new ScreenAndKeypad(this, this.world);
        simpleUI.render();
        simpleUI.setDisplayMessage("Please swipe your card to begin!!"); 
        
        cardSwipe = new CardAndSwipeUI(this, this.world);
        cardSwipe.render();
        
        fuelSelectButtonGroup = new FuelSelectButtonGroup(this);
        fuelSelectButtonGroup.render();
        
        Nozzle nozzle = new Nozzle(this);
        getWorld().addObject(nozzle, 750, 450);
        
        Car car = new Car();
        getWorld().addObject(car, 950, 450);
    }
    
    public void changeStateTo(State newState){
        currentStateObj.onExit();
        currentStateObj = newState;
        currentStateObj.onEntry();
    }
    
    private void getNextState(){
    
        
        switch(this.currentState){
        case WaitingForCreditCard:
            this.currentState = States.WaitingForZipCode;
            this.currentStateObj = this.waitingForZipCodeState;
            break;
        default:     
            break;
        }
    }
   
    public void onButtonPressEvent(ButtonPressEventType event) {
        currentStateObj.onButtonPressEvent(event);
    }
    
    public void onCardSwipeEvent(CardSwipeEventType cardSwipeEventType) {
        currentStateObj.onCardSwipeEvent(cardSwipeEventType);
    }
    
    public void onKeyPressEvent(KeyPressEventType keyEvent){
        currentStateObj.onKeyPressEvent(keyEvent);
    }
    
    public void onFuelSelected(FuelSelectEventType fuelSelectedEvent){
        currentStateObj.onFuelSelectedEvent(fuelSelectedEvent);
    }
    
    public void onNozzleEvent(NozzleEventType nozzleEvent) {
        currentStateObj.onNozzleEvent(nozzleEvent);
    }
    
    public State getWaitingForCreditCardState() {
        return waitingForCreditCardState;
    }
    
    public State getWaitingForZipCodeState() {
        return waitingForZipCodeState;
    }
    
    public State getWaitingForFuelSelectState() {
        return waitingForFuelSelectState;
    }
    
     public State getDispensingFuelState() {
        return dispensingFuelState;
    }
    
     public State getFuelDispensedState() {
        return fuelDispensedState;
    }
    
    
    
    public ScreenAndKeypad getDisplayConsole()  {
        return simpleUI;
    }
    
    public Button getButtonAtIndex(int i) {
        return getDisplayConsole().getButtonAtIndex(i);
    }

    

}
