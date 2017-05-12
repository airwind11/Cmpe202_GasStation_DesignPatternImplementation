public class CancelZipCommand implements Command
{
 State currentState;

public CancelZipCommand(State s)

{
     this.currentState = s;
}

public void execute()
{
   currentState.cancelZipcodeEntry();
}

}