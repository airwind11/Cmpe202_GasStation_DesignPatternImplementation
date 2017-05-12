import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nozzle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nozzle extends Actor
{
    
    Boolean touchingCar = false;
    StateEngine parent;
    
    public Nozzle(StateEngine e) {
        this.parent = e;
    }
    
    /**
     * Act - do whatever the Nozzle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        int mouseX, mouseY ;
        
        if(Greenfoot.mouseDragged(this)) {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();  
            setLocation(mouseX, mouseY);  
        } 

        if (isTouching(Car.class)) {
            if (!touchingCar) {
                touchingCar = true;
                parent.onNozzleEvent(NozzleEventType.NOZZLE_PRESSED);
            }
        } else {
            if (touchingCar) {
                touchingCar = false;
                parent.onNozzleEvent(NozzleEventType.NOZZLE_RELEASED);                
            }
        }

    }    
    

}
