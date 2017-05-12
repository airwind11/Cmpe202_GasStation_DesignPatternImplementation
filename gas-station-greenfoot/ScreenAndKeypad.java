import greenfoot.*;
/**
 * Write a description of class ScreenAndKeypad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScreenAndKeypad  
{
    World world;
    StateEngine parentState;
    Screen screen;
    Button[] buttons = new Button[8];
    
    public ScreenAndKeypad(StateEngine s, World world){
        this.parentState = s;
        this.world = world;
        screen = new Screen(this.world);
        
        for (int i = 0; i < 8; i++) {
            buttons[i] = new Button();
        }
        
    }
    
    public Button getButtonAtIndex(int i) {
        return buttons[i];
    }
    
    public void render(){
        //draw screen
        this.world.addObject(screen,500,180);
        
        //draw left buttons
       
        this.world.addObject(buttons[0],150,100);
        this.world.addObject(buttons[1],150,150);
        this.world.addObject(buttons[2],150,200);
        this.world.addObject(buttons[3],150,250);
        
        //draw right buttons
        this.world.addObject(buttons[4],850,100);
        this.world.addObject(buttons[5],850,150);
        this.world.addObject(buttons[6],850,200);
        this.world.addObject(buttons[7],850,250);
        
        this.world.addObject(new Keypad(this),500,450);
    }
    
    public void keypress(KeyPressEventType keycode) {
        parentState.onKeyPressEvent(keycode);
    }

    public void buttonpress(ButtonPressEventType event) {
        parentState.onButtonPressEvent(event);
    }
     
    public void setDisplayMessage(String msg){
        screen.setDisplayMessage(msg);
    }
    
    public void setButtonMappedMessage(String msg, int buttonNo){
        screen.setButtonMappedMessage(msg, buttonNo);
    }
    
    public void setDynamicMessage(String message) {
        screen.setDynamicMessage(message);
    }
}
