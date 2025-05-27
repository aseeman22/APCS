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


    public Rectangle ObjectWithGreatestArea(Rectangle[][] rectangles)
    {
        double GreatestArea = 0;
        Rectangle rectWithGreatestArea = new Rectangle("Annie", 5, 5);
        
        
        for(int i = 0; i<rectangles.length; i++)
        {
            for(int n = 0; n<rectangles.length; n++)
            {
                if(rectangles[i][n].area() > GreatestArea)
                {
                    GreatestArea = rectangles[i][n].area();
                    rectWithGreatestArea = rectangles[i][n];
                }
                  
            }
            
        }
        
        return rectWithGreatestArea;
        
    } 
    
    
     public static void main(String[] args)
  {
    
  }
}