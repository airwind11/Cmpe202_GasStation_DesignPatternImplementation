public class ConnectHelpCommand implements Command
{
 State currentState;

public ConnectHelpCommand(State s)

{
     this.currentState = s;
}

public void execute()
{
   currentState.connectHelp();
}

}