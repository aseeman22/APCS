/*

 -fix: on the first click, the player jumps four squares
 -player should moe to the edges of the screen
 -if player is surrounded by blue, the game is over
 - player cannot move over the blue
 -why is player moving only diagonally?
 -should not be able to click on a blue square twice (the player moves when the blue square is clicked again)
 -
 */

import processing.core.*;


public class Game extends PApplet
{
   int NumberOfRowSquares = 13;
   int NumberOfColumnSquares = 9;
  
  //0=nothing 1=avatar 2=barrier
   int[][] values = new int[NumberOfColumnSquares][NumberOfRowSquares];
   
   private Player pig = new Player();
   
   
   /*{
   {0,0,0,0,0,0,0,0,0,0,0},
   {0,0,0,0,0,0,0,0,0,0,0},
   {0,0,0,0,0,0,0,0,0,0,0},
   {0,0,0,0,0,1,0,0,0,0,0},
   {0,0,0,0,0,0,0,0,0,0,0},
   {0,0,0,0,0,0,0,0,0,0,0}
   };*/
   
   int SquareLength = 50;

   
   public void settings()
    {
        size(NumberOfColumnSquares*SquareLength, NumberOfRowSquares*SquareLength);
    }

    public void setup()
    {
     
     //building 2D array
     for(int i = 0; i<NumberOfRowSquares; i++)
    {
    for(int n = 0; n<NumberOfColumnSquares; n++)
    {
     values[n][i] =0;
       }
     } 
     
     System.out.println(pig.getylocation() + " " + pig.getxlocation());
     values[pig.getylocation()][pig.getxlocation()] = 1;
    }

    public void draw()
    {
        background(255);
        
        //filling in colors for squares
        for(int i = 0; i<NumberOfRowSquares; i++)
        {
            for(int n = 0; n<NumberOfColumnSquares; n++)
            {
             
             
             if(values[n][i] == 0)
              {
                fill(255, 0, 0);
              }
              else if(values[n][i]==1)
              {
                fill(0, 255, 0);
              }
              else if(values[n][i]==2)
              {
                fill(0, 0, 255);
              }
              rect(n * SquareLength, i * SquareLength, SquareLength, SquareLength);
            }
         
        }
       
       
       // drawing the grid
      // for(int n = 0; n<NumberOfColumnSquares; n++)
      // {
       // for(int i = 0; i<NumberOfRowSquares; i++)
      //  {
           // rect(i * SquareLength, n * SquareLength, SquareLength, SquareLength);
           
           //rect(n + SquareLength, 0, SquareLength, SquareLength);
           //rect(0, i+SquareLength, SquareLength, SquareLength);
           
           //rect(n, i, SquareLength, SquareLength);
           
           //rect(50,50,50,50);
           
            //rect(n + i, n+ i, SquareLength, SquareLength);
           
           
       // }
      // }
    }
    

    public void mouseClicked()
    {
        int column = 0;
        int row = 0;
        
        // if the mouse is cicked, mouseX determines what 50pixels on the X axis that was clicked.
        for(int i = 0; i<NumberOfColumnSquares; i++)
        {
            if(mouseX> i*SquareLength && mouseX<= (i+1)*SquareLength)
            {
              column = i;
            }
        }
        
        //// if the mouse is cicked, mouseY determines what 50pixels on the y axis that was clicked
        for(int j = 0; j<NumberOfRowSquares; j++)
        {
            if(mouseY> j*SquareLength && mouseY<= (j+1)*SquareLength)
            {
              row = j;
            }
        }
        // 0 turns to 2
        values[column][row] = 2;
        
        //old location of player turns to 0
        values[pig.getxlocation()][pig.getylocation()] = 0;
       
       //SET LOCATION OF PLAYER TURNS TO 0
       if(values[4][6] == 1)
        {
            values[4][6]= 0;
        }
       //update the pigs velocity and its location
        pig.updateVelocity();
        pig.updateLocation();
        
        //when the player moves, 0 turns to 1
        
        if(pig.getxlocation() >= 0 && pig.getxlocation() <= NumberOfRowSquares-1 && pig.getylocation()>=0 && pig.getylocation()<=NumberOfColumnSquares - 1)
        {
            values[pig.getxlocation()][pig.getylocation()] = 1;
        }
        
        
        
        
        
        //victory condition
       
       
       if(pig.getxlocation() == 0 || pig.getxlocation() == NumberOfRowSquares-1)
        {
           for(int i = 0; i<NumberOfRowSquares; i++)
           {
            for(int n = 0; n<NumberOfColumnSquares; n++)
            {
               
               values[n][i] = 1;
            }
          }
            
        }
        if(pig.getylocation() == 0 || pig.getylocation() == NumberOfColumnSquares-1)
        {
         for(int i = 0; i<NumberOfRowSquares; i++)
           {
            for(int n = 0; n<NumberOfColumnSquares; n++)
            {
                values[n][i] = 1;
            }
          }
        }
         
    }

   

    public static void main(String[] args)
    {
        PApplet.main("Game");
    }
}

