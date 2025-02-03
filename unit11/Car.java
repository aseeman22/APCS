public class Car implements Vehicle
{
    String name = " ";
    int wheelCount = 4;
    boolean isHumanPowered = true;
    
    public Car(String nameInput)
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