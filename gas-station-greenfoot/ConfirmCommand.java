public class ConfirmCommand implements Command
{
 State currentState;

public ConfirmCommand(State s)

{
     this.currentState = s;
}

public void execute()
{
   currentState.confirm();
}

}