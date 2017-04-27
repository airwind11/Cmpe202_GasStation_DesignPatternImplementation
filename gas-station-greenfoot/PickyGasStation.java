import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PickyGasStation extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public PickyGasStation()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        prepare();
    }
    
    
    private void prepare(){
        StateEngine engine = new StateEngine(this,GasStationType.PICKY_GAS_STATION);
    }
}