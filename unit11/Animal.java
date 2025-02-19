public class Animal
{
    private String name;
    private int legCount;
    public Animal(String nameInput, int legCountInput)
    {
        this.name = nameInput;
        this.legCount = legCountInput;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getLegCount()
    {
        return legCount;
    }
}
