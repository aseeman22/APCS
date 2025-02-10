public class Motorcycle implements Vehicle
{
    String name = " ";
    int wheelCount = 2;
    boolean isHumanPowered = true;
    
    public Motorcycle(String nameInput)
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