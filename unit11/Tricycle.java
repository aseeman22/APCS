public class Tricycle implements Vehicle
{
    String name = " ";
    int wheelCount = 3;
    boolean isHumanPowered = true;
    
    public Tricycle(String nameInput)
    {
      this.name = nameInput;  
    }
    
    public String name()
    {
       return this.name;
    }
    
    public int wheelCount()
    {
        return this.wheelCount;
    }
    
    public boolean isHumanPowered()
    {
        return this.isHumanPowered;
    }
    
    
    
}