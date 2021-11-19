/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import State.State;
import GameControls.GUI_Interface;
/**
 *
 * @author Shurahbeel Ahmad
 */
public class GUI_Implementation implements GUI_Interface{

    public State getGrid()
    {
        State state=new State();
        return state;
    }
}
