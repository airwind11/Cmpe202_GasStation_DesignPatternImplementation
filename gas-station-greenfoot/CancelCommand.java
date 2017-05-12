public class CancelCommand implements Command
{
 State currentState;

public CancelCommand(State s)

{
     this.currentState = s;
}

public void execute()
{
   currentState.cancel();
}

}