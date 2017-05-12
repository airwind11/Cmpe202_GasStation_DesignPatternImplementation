/**
 * Write a description of class KeyPressEventType here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public enum KeyPressEventType  
{

    NUMPAD_1(1), NUMPAD_2(2), NUMPAD_3(3), NUMPAD_4(4), 
    NUMPAD_5(5), NUMPAD_6(6), NUMPAD_7(7), NUMPAD_8(8), 
    NUMPAD_9(9), NUMPAD_0(0), NUMPAD_BACKSPACE(10);
    
    private int id;

    KeyPressEventType(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
    
}
