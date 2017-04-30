import greenfoot.*;
/**
 * Initial State where the gas station waits for a card swipe.
 * 
 * @author Arun Tej Chennadi
 * @version 1.0
 */
public class WaitingForCreditCardState implements State 
{
    World world;
    StateEngine engine;
    
    public WaitingForCreditCardState(World world, StateEngine engine){
        this.world = world;
        this.engine = engine;
    }
    
    public void onEntry(){
        this.drawUI();
    }
    
    
    public void onExit(){
        this.tearDownUI();
    }
    
    public void drawUI(){
        ScreenAndKeypad simpleUI = new ScreenAndKeypad(this, this.world);
        simpleUI.render();
        
    }
    
    public void tearDownUI(){}
    
    public void onEvent(EventType event){
        System.out.println(event);
        if(event != EventType.CARD_SWIPED){
            Greenfoot.playSound("beep.wav");
        }else{
        
        }
    }
    
}
