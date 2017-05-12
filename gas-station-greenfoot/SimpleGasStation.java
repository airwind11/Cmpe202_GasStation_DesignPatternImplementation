import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class MyWorld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SimpleGasStation extends World
{

    /**
     * Constructor for objects of class MyWorld.
     *
     */
    public SimpleGasStation()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1400, 800, 1);
        prepare();
        StateEngine engine1 = new StateEngine(this,GasStationType.SIMPLE_GAS_STATION);
    }


    private void prepare(){


          String[] choices = { "SIMPLE_GAS_STATION", "PICKY_GAS_STATION", "GAS_STATION_WITH_CARWASH" };
    String input = (String) JOptionPane.showInputDialog(null, "Choose now...",
        "Choose GasStation", JOptionPane.QUESTION_MESSAGE, null,choices,"");

        System.out.println("here");

       StateEngine engine1 = new StateEngine(this,input);

       //StateEngine engine1 = new StateEngine(this,GasStationType.SIMPLE_GAS_STATION);
      //  StateEngine engine = new StateEngine();
    }
}
