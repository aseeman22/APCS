public class Shape
{
    private String name;
    private int numberOfSides;
    
    public Shape(String name, int numberOfSides)
    {
        name = name;
        numberOfSides = numberOfSides;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getNumberOfSides()
    {
        return numberOfSides;
    }
}