/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameControls;
import GUI.GUI_Implementation;
import State.State;
/**
 *
 * @author Shurahbeel Ahmad
 */
public class GameControls {
    
    GUI_Implementation gui;
    public State Next()
    {
        State currentState=new State(gui.getGrid());
        State newState=new State(currentState.getRows(), currentState.getCols());
        for(int i=1; i<currentState.getRows(); i++)
        {
            for(int j=1; j<currentState.getCols(); j++)
            {
                
            }
        }
        
        return newState;
    }
}
