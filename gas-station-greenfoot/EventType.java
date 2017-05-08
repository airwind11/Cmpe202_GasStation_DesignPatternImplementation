/**
 * Write a description of class EventType here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public enum EventType  
{
    // TODO: These events should be separated into separate event types
    // e.g KeyEvents, ButtonEvents
    KEYPRESS_BUTTON_1(101), KEYPRESS_BUTTON_2(102), KEYPRESS_BUTTON_3(103), KEYPRESS_BUTTON_4(104), 
    KEYPRESS_BUTTON_5(105), KEYPRESS_BUTTON_6(106), KEYPRESS_BUTTON_7(107), KEYPRESS_BUTTON_8(108), 
    CARD_SWIPED(201), 
    FUEL_PUMP_START(301), FUEL_PUMP_END(302);

    private int id;

    EventType(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
}
