/**
 * The interface which enforces the State pattern.
 * 
 * @author Arun Tej Chennadi
 * @version 1.0
 */
public interface State  
{
    void onEntry();
    
    void onExit();
    
    void drawUI();
    
    void tearDownUI();
}
