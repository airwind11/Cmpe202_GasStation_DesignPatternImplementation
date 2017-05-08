import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OctaneRating87 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OctaneRating87 extends OctaneRating
{
    private FuelSelectButtonGroup parent;
    public OctaneRating87(FuelSelectButtonGroup parent) {
        this.parent = parent;
    }
    /**
     * Act - do whatever the OctaneRating89 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mousePressed(this)){
            parent.onFuelSelected(FuelSelectEventType.OCTANE_RATING_87);
        }
    }   
}
