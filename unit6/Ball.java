public class Ball // can have variables and functions, describes the properties
{ 
  float x; 
  float y;
  float vx = 1;
  float vy = 5;
  float r = 10;
  int c = color(255, 0, 0);
  float b;

  Ball()//  constructor // looks, size, velocity, color of ball
  {
    x = 0;
    y = 390;
    vx = 3;
    vy = -3;
    r = random(5, 50);
    c = color(random(256), random(256), random(256), random(256)); // makes the color random // the 4th value makes the balls transparent 
    b = random(-1, 1); // used to add and subtract a random size to the radius
}
 
   void display() // how the ball will look
   {
    fill(c);
    ellipse(x, y, r*2, r*2);
  
   r += b;
    
     if (x < 400) // original motion ( bottom left to top right) the radius increases as it moves
   {
     x += vx; // x = x + vx // x position increases in a positive direction
     y += vy; // y position increases in the negative direction because vy is negative
    // r +=b; // didnt want the size of the circle to increase conditionaly so moved out of conditional statement
   }
   
  
    
   // if (x>= 200)
   if (x > 400)// creates rules for when the ball reaches the left side of the screen
    {
      x += vx; // x = x + vx
      y += vy;
      vy = -vy; // changes the y direction of the ball
      x = 0; // moves the ball back to the left once it reaches the right
     // y = 0;
     // r -=b;
      r = 5; // resets the radius to the minimum once it reaches the right side of the screen
    }
    
  
  // if (y > 390) // resets to original position // tried setting rules based off of the position of y but realized i needed to set rules based off of x instead
   //{
    // x = 0;
    // y = 400;
    // y += vy;
    // x += vx;
    // vy = -3;
    // r -=b;
  // }
   
  

  
   // if ( r>50) // tried to make the radius smaller once it hit the maximum, but this did not work
   // {
      //r -=1;
   
      //r = 10;
    //}
    

  }
 
}