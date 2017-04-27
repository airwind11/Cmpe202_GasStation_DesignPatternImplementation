/**
 * An Enum class which contains the possible states.
 * 
 * @author Arun Tej Chennadi
 * @version 1.0
 */
public enum States  
{
  WaitingForCreditCard(0),WaitingForZipCode(1), FuelSelect(2), DispensingFuel(3), FuelDispensed(4), ReceiptConfirmation(5);
   
  private int id;

  States(int id){
    this.id = id;
  }

  public int getId(){
    return id;
  }
}
