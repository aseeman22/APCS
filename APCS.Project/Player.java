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
    
    public void updateLocation()
    {
        xlocation+= xvelocity;
        ylocation+= yvelocity;
    }
    
    public void updateVelocity()
    {
        if(Math.random() > 0.5)
        {
            xvelocity = -1;
        }
        else
        {
            xvelocity = 1;
        }
        
        if(Math.random() > 0.5)
        {
            yvelocity = -1;
        }
        else
        {
            yvelocity = 1;
        }
    }
}