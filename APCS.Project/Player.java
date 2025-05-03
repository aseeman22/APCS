public class Player{
    private int xlocation = 6;
    private int ylocation = 4;
    private int xvelocity =0;
    private int yvelocity = 0;
    public Player()
    {
    
    }
    
    public int getxlocation()
    {
        return xlocation;
    }
    
    public int getylocation()
    {
        return ylocation;
    }
    
   
    public int getxvelocity()
    {
        return xvelocity;
    }
    
    public int getyvelocity()
    {
        return yvelocity;
    }
    
    public void updateLocation()
    {
        xlocation+= xvelocity;
        ylocation+= yvelocity;
    }
    
    public void updateVelocity()
    {
        xvelocity = 0;
        yvelocity= 0;
   
    while(xvelocity == 0 && yvelocity == 0)
      {
        if(Math.random()< 0.33)
        {
            xvelocity = -1;
        }
        else if(Math.random()<0.66)
        {
           xvelocity = 1;
        }
        else
        {
            xvelocity = 0;
        }
        
        if(Math.random() < 0.33)
        {
           yvelocity = -1;
        }
        else if(Math.random() < 0.66)
        {
            yvelocity = 1;
        }
        else
        {
            yvelocity = 0;
        }
      }
        
        
        if(xvelocity == 1 || xvelocity == -1)
        {
            yvelocity = 0;
        }
        
        if(yvelocity == 1 || yvelocity == -1)
        {
            xvelocity = 0;
        }
        
        
       
        
    }
    
         
    public void MoveToCenter()
    {
        xlocation = 6;
        ylocation = 4;
    }
        
               
}