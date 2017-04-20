// Have to read more about this. But do we need a mediator pattern instead of
// the Observer pattern?


// The Mediator
class GasPumpMachine {

  Keypad keypad = new Keypad(this);

  CreditCardReader creditcardreader;
  ReceiptPrinter receiptPrinter;
  Display display;
  Speaker speaker;

  // Constructor
  // This will determine if gas station 
  // 1. has a car wash
  // 2. asks for print receipt at the beginning
  initialize(receipt_question_first = false, car_wash = false) {
    this.receipt_question_first = receipt_question_first;
    this.car_wash = car_wash;
  }

  // Different states. Need to scrutinize this list
  State waitingForCreditCard = new WaitingForCreditCardState();
//  State waitingForZipCode = new WaitingForZipCodeState();
//  State waitingForConfirmation = new WaitingForConfirmationState();
//  State dispensingFuel = new DispensingFuelState();
//  State dispensedFuel = new DispensedFuelState();
//  State printReceiptConfirmation = new PrintReceiptConfirmationState();

  State currentState = waitingForCreditCard;

   // All events that can change cause a state change
   void onKeyPressed(key) {
      currentState.onKeyPressed();
   }

   void onInputEntered(message) {
      currentState.onInputEntered();
   }


  // All methods that delegate duties to child components
   void displayKey(key) {
    Display.fill_prompt(key);
   }

   void beep() {
    Speaker.beep();
  }

}

class WaitingForCreditCardState implements State {
  waitingForCreditCard(Context context) {
    this.context = context;
  }

  void onKeyPressed() {
    context.beep();
  }
}

class WaitingForZipCodeState implements State {
  waitingForCreditCard(Context context) {
    this.context = context;
  }

  void onKeyPressed(key) {
    context.fillPrompt(key);
  }

  void onInputEntered(message) {
    if valid_zipcode?(message)
      context.setState(new WaitingConfirmationState);
    else
      context.clearPrompt();
      context.displayMessage("Re enter zip code");
    end
  }
}

// All State Classes will implement all input events

// Composite objects of the Gas Machine
class Keypad {

  Keypad(KeypadController keypadController) {
    this.keypadController  = keypadController;
  }


  // May have to read up on the implementation the
  // Prof has been showing in class with the 
  // iPhone touchpad screen
  has_many Buttons;

  void onKeyPress(key) {
    keypadController.onKeyPress(key);

    if ENTER {
       onInputEntered(current_buffer);
       clear_current_buffer();
    }

    if BACKSPACE
      current_buffer.remove_last_character
    else
      current_buffer += key;
    end

  }

  void onInputEntered(current_buffer) {
    keypadController.onInputEntered(current_buffer);
  }

}

class CreditCardReader {
}

class ReceiptPrinter {
  print(message);
}

class Display {
  displayMessage();
}
