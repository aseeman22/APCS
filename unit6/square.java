import processing.core.*;

public class square extends PApplet{
    public void setting(){
        size(400,400); 
        background(0);
    }
    
    public void setup(){
        vx = 2;
        vy = 2;
        x = 1;
        y = 1;
        
    }
    
    public void draw(){
         rect(x, y, length/2, length/2);
         fill(93, 66, 245);
    }
        
    public void keyPressed{
        if (keyCode == "d")
        {
            
        }
    }
    
    public static void main(String[] args){
        PApplet.main("square");
           
        }
    }
