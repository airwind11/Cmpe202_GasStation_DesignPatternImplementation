import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CardSwipe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardSwipe extends Actor
{
    CardAndSwipeUI parent;
    World world;
    
    
    
    public CardSwipe(CardAndSwipeUI parent, World world){
        this.parent = parent;
        this.world = world;
    }
    
    
    /**
     * Act - do whatever the CardSwipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        CreditCard cc =(CreditCard) getOneIntersectingObject(CreditCard.class);
        if(cc != null){
            world.removeObject(cc);
            parent.onSwipe();
        }
    }    
}
