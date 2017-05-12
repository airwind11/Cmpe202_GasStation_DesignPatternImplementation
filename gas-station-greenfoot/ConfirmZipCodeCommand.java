public class ConfirmZipCodeCommand implements Command
{
 State currentState;

public ConfirmZipCodeCommand(State s)

{
     this.currentState = s;
}

public void execute()
{
   currentState.validateCreditCard();
}

}