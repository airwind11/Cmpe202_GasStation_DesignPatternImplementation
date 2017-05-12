import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SimpleGasStation extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public SimpleGasStation()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1400, 800, 1); 
        prepare();
    }
    
    
    private void prepare(){
       StateEngine engine1 = new StateEngine(this,GasStationType.SIMPLE_GAS_STATION);
      //  StateEngine engine = new StateEngine();
    }
}
