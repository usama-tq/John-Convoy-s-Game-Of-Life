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
    State currentState=new State(7, 7);
    currentState.setInstance(2, 3, true);
    currentState.setInstance(3, 3, true);
    currentState.setInstance(4, 3, true);
    @Override
    public State getGrid()
    {
        //State state=new State(10, 10);
        
        //printGrid(currentState);
        System.out.println("Printed the Current Grid");
        return currentState;
    }
    
    public void setGrid(State state)
    {
        currentState=state;
        state=null;
        printGrid(currentState);
    }
    
    public void printGrid(State state)
    {
        for(int i=0; i<state.getRows();i++)
     {
         for(int j=0; j<state.getCols();j++)
         {
             //System.out.print(state.getInstance(i, j)+"-");
             if(state.getInstance(i, j)==true)
                 System.out.print(1+"-");
             else
                 System.out.print(0+"-");
         }
         System.out.println("");
     }
        System.out.println("Printed the New Grid");

    }
}
