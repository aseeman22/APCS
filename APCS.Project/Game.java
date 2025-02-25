import processing.core.*;


public class Game extends PApplet
{
   //0=nothing 1=avatar 2=barrier
   int [][] values = 
   {
   {0,0,0,0,0,0,0,0,0,0,0},
   {0,0,0,0,0,0,0,0,0,0,0},
   {0,0,0,0,0,0,0,0,0,0,0},
   {0,0,0,0,0,1,0,0,0,0,0},
   {0,0,0,0,0,0,0,0,0,0,0},
   {0,0,0,0,0,0,0,0,0,0,0}
   };
   
   int SquareLength = 50;

   
   public void settings()
    {
        size(600, 600);
    }

    public void setup()
    {
        
    }

    public void draw()
    {
        background(255);
        for(int n = 0; n<6; n++)
        {
            for(int i = 0; i<11; i++)
            {
              if(values[n][i] == 0)
              {
                System.out.println("Zero");
              }
              else if(values[n][i]==1)
              {
                System.out.println("one");
              }
              else if(values[n][i]==2)
              {
                System.out.println("two");
              }
            
            }
         
        }
        
       
       for(int n = 0; n<11; n++)
       {
        for(int i = 0; i<6; i++)
        {
            rect(n, i + SquareLength, SquareLength, SquareLength);
            rect(n + SquareLength, i, SquareLength, SquareLength);
        }
       }
    }
    

    public void keyPressed()
    {
                
    }

   

    public static void main(String[] args)
    {
        PApplet.main("Game");
    }
}

