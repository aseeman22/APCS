public class RectangleObjects
{
    public double averagePerimeter(Rectangle[][] rectangles)
    {
        double perimeter = 0; 
        for(int i = 0; i<rectangles.length; i++)
        {
            for(int j = 0; j<rectangles.length; i++)
            {
                perimeter = (i + j)/rectangles.length;
            }
        }
        
        return perimeter;
    }
}

    public Rectangle ObjectWithGreatestArea(Rectangle[][] rectangles)
    {
        
    }