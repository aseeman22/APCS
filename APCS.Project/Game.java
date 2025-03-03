import processing.core.*;


public class Game extends PApplet
{
   int NumberOfRowSquares = 9;
   int NumberOfColumnSquares = 13;
  
  //0=nothing 1=avatar 2=barrier
   int[][] values = new int[NumberOfRowSquares][NumberOfColumnSquares];
   
   
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
        size(NumberOfRowSquares*SquareLength, NumberOfColumnSquares*SquareLength);
    }

    public void setup()
    {
     
     //building 2D array
     for(int i = 0; i<NumberOfRowSquares; i++)
    {
    for(int n = 0; n<NumberOfColumnSquares; n++)
    {
      if(i == 4 && n ==7)
      {
        values[i][n] = 1;
      }
      else
      {
        values[i][n] = 0;
      }
        
       }
     }  
    }

    public void draw()
    {
        background(255);
        
        //filling in colors for squares
        for(int n = 0; n<NumberOfRowSquares; n++)
        {
            for(int i = 0; i<NumberOfColumnSquares; i++)
            {
             
             rect(n * SquareLength, i * SquareLength, SquareLength, SquareLength);
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
    

    public void keyPressed()
    {
                
    }

   

    public static void main(String[] args)
    {
        PApplet.main("Game");
    }
}

