/*

 - player cannot move over the blue --> pig can jump through squares that are diagnol to eachother
 */

import processing.core.*;


public class Game extends PApplet
{
   int NumberOfRowSquares = 13; //13
   int NumberOfColumnSquares = 9; //9
   //int offsetX = 0;
   //int offsetY = 0;
  
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
        //size(NumberOfColumnSquares*SquareLength, NumberOfRowSquares*SquareLength);
        
        
        fullScreen();
        
        
    }

    public void setup()
    {
    
    //add offset x and y variables here to center the grid in full screen mode
     
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
              
             // if (values[i][n] == 1)
             // {
              //  println("press");
            //  }
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
}
    

    public void mouseClicked()
    {
        
        boolean ClickedValidSquare = true;
        ClickedValidSquare = addBlueSquare(mouseY, mouseX);
        
        if(ClickedValidSquare)
        {
        
        //old location of player turns to 0
        values[pig.getylocation()][pig.getxlocation()] = 0;
       
       
       
      if(pig.getxlocation() == 0 || pig.getxlocation() == NumberOfRowSquares-1 || pig.getylocation() == 0 || pig.getylocation() == NumberOfColumnSquares - 1)
      {
         //if pig wins
         
         for(int i = 0; i<NumberOfRowSquares; i++)
           {
            for(int n = 0; n<NumberOfColumnSquares; n++)
            {
               
               values[n][i] = 1;
            }
          }
      }
      
      else if(values[pig.getylocation() +1][pig.getxlocation()] == 2 && values[pig.getylocation() - 1][pig.getxlocation()] == 2 && values[pig.getylocation()][pig.getxlocation() + 1] == 2 && values[pig.getylocation()][pig.getxlocation() - 1] == 2)
      
      {
        //if player wins
        for(int i = 0; i< NumberOfRowSquares; i++)
            {
                for(int n = 0; n< NumberOfColumnSquares; n++)
                {
                    values[n][i] = 2;
                }
            }
      }
      
      else
      {
            //update the pigs velocity and its location
        pig.updateVelocity();
        
        int proposedxlocation = 0;
        int proposedylocation = 0;
        
        proposedxlocation = pig.getxvelocity() + pig.getxlocation();
        proposedylocation = pig.getyvelocity() + pig.getylocation();
       
       
       
       // seeing if where the player is moving is a blue square
       
       while(values[proposedylocation][proposedxlocation] == 2)
        {
            pig.updateVelocity();
            proposedxlocation = pig.getxvelocity() + pig.getxlocation();
            proposedylocation = pig.getyvelocity() + pig.getylocation();
       
        }
        
        
        
        pig.updateLocation();
        
         //when the player moves, 0 turns to 1
        
        if(pig.getxlocation() >= 0 && pig.getxlocation() <= NumberOfRowSquares-1 && pig.getylocation()>=0 && pig.getylocation()<=NumberOfColumnSquares - 1)
        {
            values[pig.getylocation()][pig.getxlocation()] = 1;
        }
      }
       
    }
    }

        
        
    // finds where is available to add a blue square
    public boolean addBlueSquare(int mouseY, int mouseX)
    {
        boolean ClickedEquals0 = true;
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
            
            if(values[column][row] == 0)
            {
            
            ClickedEquals0 = true;
            // if the mouse clicks on a square in the grid that = 0, then it is allowed change and = 2. else, nothing happens
            values[column][row] = 2;
            }
            else
            {
                ClickedEquals0 = false;
            }
            
            return ClickedEquals0;
            
            }
            
 public void keyPressed()
 {
 boolean AllSquaresAre2or1 = true;
     
     for(int i = 0; i< NumberOfRowSquares; i++)
        {
         for(int n = 0; n< NumberOfColumnSquares; n++)
            {
            if(values[n][i] != 2 && values[n][i] != 1)
            {
                AllSquaresAre2or1 = false;
            }
            }   
        }
        
        if(key == 'g' && AllSquaresAre2or1)
                {
                setup();

                values[pig.getylocation()][pig.getxlocation()] = 0;
                pig.MoveToCenter();
                values[pig.getylocation()][pig.getxlocation()] = 1;
                }
    }
    
    
    
   

    public static void main(String[] args)
    {
        PApplet.main("Game");
    }
}

