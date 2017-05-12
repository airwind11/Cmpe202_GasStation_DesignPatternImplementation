public class HelpCommand implements Command
{
 State currentState;

public HelpCommand(State s)

{
     this.currentState = s;
}

public void execute()
{
   currentState.help();
}

}