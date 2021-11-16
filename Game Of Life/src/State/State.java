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
 public State()
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
 public State(int rows, int cols)
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
 public void print()
 {
     for(int i=0; i<rows;i++)
     {
         for(int j=0; j<cols;j++)
             System.out.print(grid[i][j]+"-");
         System.out.println("");
     }
 }
 public static void main(String[] args)
 {
     State state=new State(5,5);
     state.print();
     System.out.println("Hanzla di layi");
 }
}
