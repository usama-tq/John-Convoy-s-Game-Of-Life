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
public class GUI_Implementation  implements GUI_Interface{

    @Override
    public State getGrid()
    {
        State state=new State(10, 10);
        state.setInstance(3, 3, true);
        state.setInstance(3, 4, true);
        state.setInstance(3, 5, true);
        state.print();
        System.out.println("Printed the Current Grid");
        return state;
    }
    public void printGrid(State state)
    {
        state.print();
        System.out.println("Printed the New Grid");

    }
}
