/**
 * Write a description of class ButtonPressEventType here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public enum ButtonPressEventType  
{
    
    BUTTON_1(101), BUTTON_2(102), BUTTON_3(103), BUTTON_4(104), 
    BUTTON_5(105), BUTTON_6(106), BUTTON_7(107), BUTTON_8(108);
    
    private int id;

    ButtonPressEventType(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
 
}
