public class CancelTransactionCommand implements Command
{
 State currentState;

public CancelTransactionCommand(State s)

{
     this.currentState = s;
}

public void execute()
{
   currentState.cancelTransaction();
}

}