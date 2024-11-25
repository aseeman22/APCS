


import processing.core.*;
import java.util.*;   // for ArrayList


public class Bounce extends PApplet
{
    public void settings()
    {
        size(600, 600);
    }

    public void setup()
    {
        squares = new ArrayList<Square>();
        squares.add(new Square(this));
    }

    public void draw()
    {
        background(0);
        for (Square s : squares)
            s.display();
    }

    public void keyPressed()
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

    private ArrayList<Square> squares;

    public static void main(String[] args)
    {
        PApplet.main("Bounce");
    }
}
