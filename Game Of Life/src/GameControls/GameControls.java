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
    
    GUI_Implementation gui=new GUI_Implementation();
    boolean stop=false;
    
    
    
    
    private boolean actionOnActive(int neighboursCount)
    {
        if(neighboursCount<=1)
            return false;
        else if(neighboursCount>=4)
            return false;
        return true;
    }
    private boolean actionOnDead(int neighboursCount)
    {
        return neighboursCount==3; //return false;
    }
    public State Next()
    {
        //gui=new GUI_Implementation();
        State currentState=gui.getGrid();//getting the current state from grid
        State newState=new State(currentState.getRows(), currentState.getCols());//making new state for changes
        int neighbours=0;// for neighbour count
        
        //Count the neighbours code
        for(int i=1; i<currentState.getRows()-1; i++)
        {
            for(int j=1; j<currentState.getCols()-1; j++)
            {
                if(currentState.getInstance(i-1, j-1)) {
                    neighbours++;
                }
                if(currentState.getInstance(i-1, j)) {
                    neighbours++;
                }
                if(currentState.getInstance(i-1, j+1)) {
                    neighbours++;
                }
                if(currentState.getInstance(i, j-1)) {
                    neighbours++;
                }
                if(currentState.getInstance(i, j+1)) {
                    neighbours++;
                }
                if(currentState.getInstance(i+1, j-1)) {
                    neighbours++;
                }
                if(currentState.getInstance(i+1, j)) {
                    neighbours++;
                }
                if(currentState.getInstance(i+1, j+1)) {
                    neighbours++;
                }
                //define action on corrent cell
                if(currentState.getInstance(i, j))
                {
                    if(actionOnActive(neighbours))
                    {
                        newState.setInstance(i, j, true);
                    }
                    else
                        newState.setInstance(i, j, false);              
                }
                else
                {
                    if(actionOnDead(neighbours))
                        newState.setInstance(i, j, true);
                    else
                        newState.setInstance(i, j, false);
                }
                neighbours=0;
            }
        }
        gui.setGrid(newState);
        return newState;
    }
    
    
    
    public State Start()
    {
        stop=false;
        State newState=gui.getGrid();
        gui.printGrid(newState);
        int i=3;
        while(i>0)
        {
            i--;
            newState=Next();
        }
        return newState;
    }
    
    public void Stop()
    {
        stop=true;
    }
            
            
    public static void main(String[] args)
    {/*
        State state=new State(10, 10);
        state.setInstance(3, 3, true);
        state.setInstance(3, 4, true);
        state.setInstance(3, 5, true);
        state.print();*/
        GameControls GOL=new GameControls();
        State state=GOL.Next();
        GOL.Next();
        GOL.Next();
        //state.print();
    }
}
