/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameControls;
import State.State;
/**
 *
 * @author Shurahbeel Ahmad
 */
public interface DBInterface {
    
    public State loadState();
    public void saveState(State state);
    public void deleteState();
    
    
}
