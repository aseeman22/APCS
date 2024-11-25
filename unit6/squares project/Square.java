import processing.core.*;


public class Square
{
    public Square(PApplet p)
    {
        this.p = p;
        position = new PVector(300, 300);
        velocity = new PVector(0,0);
        c = p.color(p.random(256), p.random(256), p.random(256));
    }

    public void display()
    {
        p.fill(c);
        p.rect(position.x, position.y, 12, 12);

        position.add(velocity);

        if (position.x > p.width || position.x < 0)
            position.x = 300;

        if (position.y > p.height || position.y < 0)
            position.y = 300;
    }

    private PApplet p; // reference to main PApplet
    public PVector position;
    public PVector velocity;
    private float radius;
    private int c; // color
}


