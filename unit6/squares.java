import processing.core.*;

public class squares
{
    public void Square(PApplet p)
    {
        this.p = p;
        position = PVector(300,300);
        velocity = PVector(2,2);
        c = p.color(0);
    }
    
    public static void display()
    {
        fill(c);
        p.rect(position.x, position.y, 5, 5);
        
        position.add(velocity);
        
    }
    
    private PApplet p;
    private PVector position;
    private PVector velocity;
    private int c;
}