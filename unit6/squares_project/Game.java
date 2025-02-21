import processing.core.*;


public class Game extends PApplet
{
    public void settings()
    {
        size(600, 600);
    }

    public void setup()
    {
        fill(255);
        background(255);
    }

    public void draw()
    {
        fill(200,25,25);
        rect(5,5,300,300);
       
    }

    public void keyPressed()
    {
                
    }

   

    public static void main(String[] args)
    {
        PApplet.main("Game");
    }
}

