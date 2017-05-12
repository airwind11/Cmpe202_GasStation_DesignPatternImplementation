public class DoNotPrintReceiptCommand  implements Command
{

    State currentState;

public DoNotPrintReceiptCommand(State s)

{
    this.currentState = s;
}

public void execute()
{
    //currentState.doNotPrintReceipt();
}
}
