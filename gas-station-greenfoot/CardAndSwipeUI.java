import greenfoot.*;
/**
 * Write a description of class CardAndSwipe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardAndSwipeUI  
{
    World world;
    StateEngine parentState;
    
    public CardAndSwipeUI(StateEngine s, World world){
        this.parentState = s;
        this.world = world;
    }
    
    public void render(){
        this.world.addObject(new CreditCard(), 1100, 200);
        this.world.addObject(new CardSwipe(this, this.world), 1100, 350);
    }
    
    public void onSwipe(){
        parentState.onEvent(EventType.CARD_SWIPED);
    }
}
