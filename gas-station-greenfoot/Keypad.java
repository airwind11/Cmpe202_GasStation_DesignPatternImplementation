import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Keypad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Keypad extends Actor
{
    ScreenAndKeypad parent;
    
    public Keypad(ScreenAndKeypad parent){
        this.parent = parent;
    }
    
    /**
     * Act - do whatever the Keypad wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mousePressed(this)){
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if(mouse!=null){
                int mx = mouse.getX();
                int my = mouse.getY();
                //System.out.println("mouse location: "+mx+" "+my);
                if(mx < 452 && my < 391){
                    parent.keypress("KEYPAD", 1);
                }else if((mx > 452 && mx < 555)&& my < 391){
                    parent.keypress("KEYPAD", 2);
                }else if((mx > 555 && mx < 652)&& my < 391){
                    parent.keypress("KEYPAD", 3);
                }else if((mx < 452)&& (my > 391 && my < 445)){
                    parent.keypress("KEYPAD", 4);
                }else if((mx > 452 && mx < 555) && (my > 391 && my < 445)){
                    parent.keypress("KEYPAD", 5);
                }else if((mx > 555 && mx < 652) && (my > 391 && my < 445)){
                    parent.keypress("KEYPAD", 6);
                }else if((mx < 452) && (my > 445 && my < 501)){
                    parent.keypress("KEYPAD", 7);
                }else if((mx > 452 && mx < 555) && (my > 445 && my < 501)){
                    parent.keypress("KEYPAD", 8);
                }else if((mx > 555 && mx < 652) && (my > 445 && my < 501)){
                    parent.keypress("KEYPAD", 9);
                }else if((mx > 452 && mx < 555) && (my > 501 && my < 559)){
                    parent.keypress("KEYPAD", 0);
                }else if((mx > 555 && mx < 652) && (my > 501 && my < 559)){
                    parent.keypress("KEYPAD", -1);
                }
                
            }
            
            
        }
    }    
}
