/**
 * Write a description of class FuelSelectButtonGroup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FuelSelectButtonGroup  
{
    // instance variables - replace the example below with your own
    StateEngine context;

    /**
     * Constructor for objects of class FuelSelectButtonGroup
     */
    public FuelSelectButtonGroup(StateEngine s)
    {
        this.context = s;
    }

    public void render() {
        context.getWorld().addObject(new OctaneRating87(), 250, 370);
        context.getWorld().addObject(new OctaneRating89(), 250, 450);
        context.getWorld().addObject(new OctaneRating91(), 250, 530);
    }

}
