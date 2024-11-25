import processing.core.*;

public class Move extends PApplet{
    public void settings(){
        size(400,400); 
        background(0);
    }
   
    public void setup(){
        //int vx = 2;
        //int vy = 2;
        //int x = 1;
        //int y = 1;
        //squares = new squares();
        
    }
    
    public void draw(){
       squares MyNewSquare = new squares();
        MyNewSquare.display();
        
    }
        
    public void keyPressed()
    {
        if(keyCode == 'd')
        {
            MyNewSquare.position.x += 2;
        }
        else if(keyCode == 'a')
        {
            MyNewSquare.position.x -=2;
        }
        else if(keyCode == 'w')
        {
            MyNewSquare.position.y += 2;
        }
        else if(keyCode == 's')
        {
            MyNewSquare.position.y -= 2;
        }
    }
    
    public static void main(String[] args){
        PApplet.main("Move");
           
        }
    }
