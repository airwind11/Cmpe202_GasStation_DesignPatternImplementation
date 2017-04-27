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
    
    State currentState;
    State nextState;
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
        
        
    }
    
    public void start(){
    
    }
}
