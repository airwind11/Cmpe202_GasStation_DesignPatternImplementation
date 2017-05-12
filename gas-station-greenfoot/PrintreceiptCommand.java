/**
 * Write a description of class PrintreceiptCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrintreceiptCommand  implements Command
{

    State currentState;

public PrintreceiptCommand(State s)

{
    this.currentState = s;
}

public void execute()
{
    //currentState.printreceipt();
}
}
