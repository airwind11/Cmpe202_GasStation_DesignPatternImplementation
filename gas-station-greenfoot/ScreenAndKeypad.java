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
    State parentState;
    
    public ScreenAndKeypad(State s, World world){
        this.parentState = s;
        this.world = world;
    }
    
    public void render(){
        //draw screen
        this.world.addObject(new Screen(),500,180);
        
        //draw left buttons
        this.world.addObject(new Button(this, 1),150,100);
        this.world.addObject(new Button(this, 2),150,150);
        this.world.addObject(new Button(this, 3),150,200);
        this.world.addObject(new Button(this, 4),150,250);
        
        //draw right buttons
        this.world.addObject(new Button(this, 5),850,100);
        this.world.addObject(new Button(this, 6),850,150);
        this.world.addObject(new Button(this, 7),850,200);
        this.world.addObject(new Button(this, 8),850,250);
        
        this.world.addObject(new Keypad(this),500,450);
    }
    
    public void keypress(String element, int num){
        
        if(element.equalsIgnoreCase("BUTTON")){
            generateButtonEvent(num);
        }else if(element.equalsIgnoreCase("KEYPAD")){
            generateKeypadEvent(num);
        }
        
    }
    
    public void generateButtonEvent(int num){
          
          EventType curEvent = null;  
          switch(num){
          case 1:
            curEvent = EventType.KEYPRESS_BUTTON_1;
            break;
          case 2:
            curEvent = EventType.KEYPRESS_BUTTON_2;
            break;
          case 3:
            curEvent = EventType.KEYPRESS_BUTTON_3;
            break;  
          case 4:
            curEvent = EventType.KEYPRESS_BUTTON_4;
            break;
          case 5:
            curEvent = EventType.KEYPRESS_BUTTON_5;
            break;
          case 6:
            curEvent = EventType.KEYPRESS_BUTTON_6;
            break;
          case 7:
            curEvent = EventType.KEYPRESS_BUTTON_7;
            break;
          case 8:
            curEvent = EventType.KEYPRESS_BUTTON_8;
            break;
          }  
          
          parentState.onEvent(curEvent);
    }
    
    public void generateKeypadEvent(int num){
       EventType curEvent = null;  
          switch(num){
          case 1:
            curEvent = EventType.KEYPRESS_NUMPAD_1;
            break;
          case 2:
            curEvent = EventType.KEYPRESS_NUMPAD_2;
            break;
          case 3:
            curEvent = EventType.KEYPRESS_NUMPAD_3;
            break;  
          case 4:
            curEvent = EventType.KEYPRESS_NUMPAD_4;
            break;
          case 5:
            curEvent = EventType.KEYPRESS_NUMPAD_5;
            break;
          case 6:
            curEvent = EventType.KEYPRESS_NUMPAD_6;
            break;
          case 7:
            curEvent = EventType.KEYPRESS_NUMPAD_7;
            break;
          case 8:
            curEvent = EventType.KEYPRESS_NUMPAD_8;
            break;
          case 9:
            curEvent = EventType.KEYPRESS_NUMPAD_9;
            break;
          case 0:
            curEvent = EventType.KEYPRESS_NUMPAD_0;
            break;
          case -1:
            curEvent = EventType.KEYPRESS_NUMPAD_BACK_SPACE;
            break; 
          }  
          
          parentState.onEvent(curEvent); 
    }
}
