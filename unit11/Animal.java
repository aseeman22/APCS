public class Animal
{
    private String name;
    private int legCount;
    private boolean furriness;
    public Animal(String nameInput, int legCountInput, boolean furrinessInput)
    {
        this.name = nameInput;
        this.legCount = legCountInput;
        this.furriness = furrinessInput;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getLegCount()
    {
        return legCount;
    }
    
    public boolean getFurriness()
    {
        return furriness;
    }
}
