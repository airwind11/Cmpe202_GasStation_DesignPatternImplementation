/**
 * Write a description of class FuelSelectEventType here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public enum FuelSelectEventType  
{
    
    OCTANE_RATING_87(1), OCTANE_RATING_89(2), OCTANE_RATING_91(3);
    
    private int id;

    FuelSelectEventType(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
}
