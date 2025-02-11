import processing.core.*;


public class Setup extends PApplet
{
    public void settings()
    {
        size(600, 600);
    }

    public void setup()
    {
        avatar = new ArrayList<Avatar>();
        avatar.add(new Avatar(this));
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
        
    for (Avatar a : avatar)
        a.display();
            
            
    }

   /* public void keyPressed()
    {
            
             if(key == 'd')
        {
           for(Square s : squares){
          // squares.get(0).position.x += 7;
           s.position.x += 7;
           }
        }
        else if(key == 'a')
        {
           for(Square s : squares){
           s.position.x -=7;
           }
        }
        else if(key == 'w')
        {
           for(Square s : squares){
           s.position.y -= 7;
           }
        }
        else if(key == 's')
        { 
          for(Square s : squares){ 
           s.position.y += 7;
           }
        }
        else if(key == 'b')
        {
         for (int i=0; i<2; i++)
            squares.add(new Square(this));
        }
    }
*/
    private ArrayList<Avatar> avatar;

    public static void main(String[] args)
    {
        PApplet.main("Setup");
    }
}
