import processing.core.*;


public class Setup extends PApplet
{

int gameState = 0;
    public void settings()
    {
        size(600, 600);
    }

    public void setup()
    {
    
    }
    public void drawStart()
    {
        background(52, 192, 235);
        System.out.println("Block The Ball");
        System.out.println("Click the spacebar to continue");
    }
    
    public void drawGame()
    {
      background(52, 192, 235);
    }
   
   public void draw()
    {
        background(0);
    if (gameState== 1);
    {
      drawStart();
    }
    if (gameState == 2);
    {
      drawGame();
    }
        
  
            
            
    }



    public static void main(String[] args)
    {
        PApplet.main("Setup");
    }
}
