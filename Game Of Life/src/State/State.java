/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author Shurahbeel Ahmad
 */
public class State {
 int rows;
 int cols;
 //int size=10;
 boolean[][] grid;//=new float[rows][cols];
 public State()//default constructor
 {
     rows=3;
     cols=3;
     //int count=0;
     grid=new boolean[rows][cols];
     for(int i=0; i<rows;i++)
     {
         for(int j=0; j<cols;j++)
             grid[i][j]=false;
     }
 }
 public State(int rows, int cols)//Default values constuctor
 {
     this.rows=rows;
     this.cols=cols;
     grid=new boolean[rows][cols];
     for(int i=0; i<rows;i++)
     {
         for(int j=0; j<cols;j++)
             grid[i][j]=false;
     }
 }
 public State(State copyState)//Default copy constuctor
 {
     this.rows=copyState.rows;
     this.cols=copyState.cols;
     grid=new boolean[rows][cols];
     for(int i=0; i<rows;i++)
     {
         for(int j=0; j<cols;j++)
             grid[i][j]=copyState.grid[i][j];
     }
 }/*
 public void print()
 {
     for(int i=0; i<rows;i++)
     {
         for(int j=0; j<cols;j++)
             System.out.print(grid[i][j]+"-");
         System.out.println("");
     }
 }*/
 public int getRows()
 {
     return rows;
 }
 public int getCols()
 {
     return cols;
 }
 public boolean getInstance(int row, int col)
 {
     if(grid[row][col]==true)
         return true;
     else
         return false;
 }
 public void setInstance(int row, int col, boolean status)
 {
     this.grid[row][col]=status;
 }
 /*
 public static void main(String[] args)
 {
     State state=new State(5,5);
     State newState=new State(state);
     newState.grid[0][0]=true;
     state.print();
     
     System.out.println("Constructor affect");
     state=new State(newState);
     state.grid[2][2]=true;
     newState.print();
     
     
 }*/
}
