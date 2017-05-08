/**
 * Write a description of class NozzleEventType here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public enum NozzleEventType  
{
    NOZZLE_PRESSED(301), NOZZLE_RELEASED(302);

    private int id;

    NozzleEventType(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
}
