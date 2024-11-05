public class Ball{
    public static void main(String[] args){
        Ball A;
        ArrayList<Ball> balls;
        setup();
    }

        void setup()
        {
            background(0); // sets background color
            size(400,400); // sets frame size
  
            A = new Ball();
  
            balls = new ArrayList <Ball>(); // displays new balls 
            loop();
        }  

        void draw()
        {
            background(255); // white bachground
            //  fill(0, 255, 0);
            //ellipse(200, 200, 50, 50);
            // A.display();
            for (Ball ball : balls) // for each object in the list of balls the display function is called
            {
                ball.display();
            }
             loop();
         }


            void keyPressed() // displays new ball upon click 
            {
                Ball bob = new Ball();
                balls.add(bob);


            }
    }