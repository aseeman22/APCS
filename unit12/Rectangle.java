public class Rectangle
{
    private String name;
    private double width;
    private double height;
    public Rectangle(String nameInput, double widthInput, double heightInput)
    {
        this.name = nameInput;
        this.width = widthInput;
        this.height = heightInput;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public double area()
    {
        double area = width * height;
        return area;
    }
    
    public double perimeter()
    {
        double perimeter = (2 * height) + (2 * width);
        return perimeter;
    }
}