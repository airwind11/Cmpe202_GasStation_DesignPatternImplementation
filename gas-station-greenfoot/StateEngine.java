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
    State waitingForReceiptConfirmationState;
    State printingReceiptState;
    State thankYouState;
    State helpState;
    State carWashState;
    
    States currentState;
    State currentStateObj;
    GasStationType type;
    
    private Boolean shouldPrintReceipt = true;
    private ScreenAndKeypad simpleUI;
    private CardAndSwipeUI cardSwipe;
    private FuelSelectButtonGroup fuelSelectButtonGroup;
    
    public StateEngine(World world, String type){
        this.world = world;
 
        if (type.equals("SIMPLE_GAS_STATION")) {
            this.type = GasStationType.SIMPLE_GAS_STATION;
        } else if (type.equals("PICKY_GAS_STATION")) {
            this.type = GasStationType.PICKY_GAS_STATION;
        }
                else if (type.equals("PICKY_GAS_STATION")) {
            this.type = GasStationType.PICKY_GAS_STATION;
        }
            else if (type.equals("GAS_STATION_WITH_CARWASH")) {
            this.type = GasStationType.GAS_STATION_WITH_CARWASH;
        }
        
        //this.type = GasStationType.PICKY_GAS_STATION;
        // Render initial state
        render();
        
        this.waitingForCreditCardState = new WaitingForCreditCardState(world,this);
        this.waitingForZipCodeState = new WaitingForZipCodeState(world,this);
        this.waitingForFuelSelectState = new WaitingForFuelSelectState(world, this);
        this.dispensingFuelState = new DispensingFuelState(world, this);
        this.waitingForReceiptConfirmationState =  new WaitingForReceiptConfirmationState(world, this);
        this.printingReceiptState = new PrintingReceiptState(world, this);
        this.carWashState = new CarWashState(world, this);
        this.thankYouState = new ThankYouState(world, this);
        this.helpState = new HelpState(world, this);
        this.currentState = States.WaitingForCreditCard;
        this.currentStateObj = this.waitingForCreditCardState;
        
        this.currentStateObj.onEntry();
    }
    
    public StateEngine(){
    
    }
    
    
    public GasStationType getGasStationType() {
        return this.type;
    }
    public World getWorld() {
        return world;
    }
    
    private void render() {
        simpleUI = new ScreenAndKeypad(this, this.world);
        simpleUI.render();
               
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
    
    public State getCarWashState() {
        return carWashState;
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
    
    public State getWaitingForReceiptConfirmationState() {
        return waitingForReceiptConfirmationState;
    }
    
    public State getPrintingReceiptState() {
        return printingReceiptState;
    }

    public State getThankYouState() {
        return thankYouState;
    }
    
     public State getHelpState() {
        return helpState;
    }    
    
    public void printReceipt() {
        Receipt r = new Receipt();
        getWorld().addObject(r, 850, 550);
        Message receipt= new Message(100, 100);
        this.world.addObject(receipt, 850, 550);
        receipt.setText("Receipt");
        Greenfoot.delay(150);
        getWorld().removeObject(r);
        getWorld().removeObject(receipt);
                
    }
    
    public ScreenAndKeypad getDisplayConsole()  {
        return simpleUI;
    }
    
    public Button getButtonAtIndex(int i) {
        return getDisplayConsole().getButtonAtIndex(i);
    }

    public void setShouldPrintReceipt(Boolean b) {
        this.shouldPrintReceipt = b;
    }
    
    public Boolean getShouldPrintReceipt() {
        return this.shouldPrintReceipt;
    }
    

}
