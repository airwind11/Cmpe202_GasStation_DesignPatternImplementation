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
    
    public ScreenAndKeypad(StateEngine s, World world){
        this.parentState = s;
        this.world = world;
        screen = new Screen(this.world);
    }
    
    public void render(){
        //draw screen
        this.world.addObject(screen,500,180);
        
        //draw left buttons
        this.world.addObject(new Button(this, ButtonPressEventType.BUTTON_1),150,100);
        this.world.addObject(new Button(this, ButtonPressEventType.BUTTON_2),150,150);
        this.world.addObject(new Button(this, ButtonPressEventType.BUTTON_3),150,200);
        this.world.addObject(new Button(this, ButtonPressEventType.BUTTON_4),150,250);
        
        //draw right buttons
        this.world.addObject(new Button(this, ButtonPressEventType.BUTTON_5),850,100);
        this.world.addObject(new Button(this, ButtonPressEventType.BUTTON_6),850,150);
        this.world.addObject(new Button(this, ButtonPressEventType.BUTTON_7),850,200);
        this.world.addObject(new Button(this, ButtonPressEventType.BUTTON_8),850,250);
        
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
