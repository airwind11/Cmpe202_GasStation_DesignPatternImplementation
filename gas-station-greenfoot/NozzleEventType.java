/**
 * Write a description of class NozzleEventType here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public enum NozzleEventType  
{
    NOZZLE_PRESSED(0), NOZZLE_RELEASED(1);

    private int id;

    NozzleEventType(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
}
