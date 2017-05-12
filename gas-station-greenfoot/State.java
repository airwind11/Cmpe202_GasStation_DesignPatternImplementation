/**
 * The interface which enforces the State pattern.
 * 
 * @author Arun Tej Chennadi
 * @version 1.0
 */
public interface State  
{
    void onEntry();
    
    void onExit();
    
    void drawUI();
    
    void tearDownUI();
    
    void printreceipt();
    
    void connectHelp();
    
    void doNotPrintReceipt();
    
    void validateCreditCard();
    
    void cancelZipcodeEntry();
    
    void cancelTransaction();
    
    void onButtonPressEvent(ButtonPressEventType event);
    
    void onKeyPressEvent(KeyPressEventType event);
    
    void onFuelSelectedEvent(FuelSelectEventType event);
    
    void onCardSwipeEvent(CardSwipeEventType cardSwipeEventType);
      
    void onNozzleEvent(NozzleEventType nozzleEvent);

}
