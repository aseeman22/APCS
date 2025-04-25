public class Player{
    private int xlocation = 6;
    private int ylocation = 4;
    private int xvelocity =1;
    private int yvelocity = 1;
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
        
        // see location (assume player is at (i,j)) --> then check if there is a 2 (i+1, j), (i-1, j), (i, j+1), (i, j-1)
        
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
}