/**
 * Write a description of class CardSwipeEventType here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public enum CardSwipeEventType  
{
    CARD_SWIPED(201);

    private int id;

    CardSwipeEventType(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
}
