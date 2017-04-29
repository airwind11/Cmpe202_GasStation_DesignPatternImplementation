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
    State fuelSelectState;
    State dispensingFuelState;
    State fuelDispensedState;
    State receiptConfirmationState;
    
    States currentState;
    State currentStateObj;
    GasStationType type;
    
    public StateEngine(World world, GasStationType type){
        this.world = world;
        this.type = type;
        this.waitingForCreditCardState = new WaitingForCreditCardState(world,this);
        this.waitingForZipCodeState = new WaitingForZipCodeState(world,this);
        this.fuelSelectState = new FuelSelectState(world, this);
        this.dispensingFuelState = new DispensingFuelState(world, this);
        this.fuelDispensedState =  new FuelDispensedState(world, this);
        this.receiptConfirmationState = new ReceiptConfirmationState(world, this);
        this.currentState = States.WaitingForCreditCard;
        this.currentStateObj = this.waitingForCreditCardState;
        
        this.currentStateObj.onEntry();
    }
    
    public StateEngine(){
    
    }
    
    public void stateChange(){
        this.currentStateObj.onExit();
        getNextState();
        this.currentStateObj.onEntry();
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
}
