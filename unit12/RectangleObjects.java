public class RectangleObjects
{
    public static double averagePerimeter(Rectangle[][] rectangles)
    {
        double perimeter = 0; 
        int total = 0;
        for(int i = 0; i<rectangles.length; i++)
        {
            for(int j = 0; j<rectangles[i].length; j++)
            {
                perimeter += rectangles[i][j].perimeter();
                //perimeter += (i + j)*2;
                total++;
            }
        }
        perimeter = perimeter/total; 
        
        return perimeter;
    }


    public static Rectangle ObjectWithGreatestArea(Rectangle[][] rectangles)
    {
        double GreatestArea = 0;
        Rectangle rectWithGreatestArea = new Rectangle("Annie", 5, 5);
        
        
        for(int i = 0; i<rectangles.length; i++)
        {
            for(int n = 0; n<rectangles[i].length; n++)
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
        //average perimeter
         Rectangle[][] rectangles = new Rectangle[3][1];
        
        rectangles[0][0] = new Rectangle("rectangle", 4, 4);
        rectangles[1][0] = new Rectangle("rectangle2", 4,4);
        rectangles[2][0] = new Rectangle("rectangle3", 4,4);
       
        //RectangleObjects rectangleObjects = new RectangleObjects();
        
        
        double expected = (rectangles[0][0].perimeter() + rectangles[1][0].perimeter() + rectangles[2][0].perimeter())/3.0;
            
        System.out.print("expected:\n" + expected);
        System.out.print("\nresult:\n" + averagePerimeter(rectangles));
        
        //ObjectWithGreatestArea Test
        
        Rectangle[][] rectangles2 = new Rectangle[3][1];
        
        rectangles2[0][0] = new Rectangle("rectangle", 5, 4);
        rectangles2[1][0] = new Rectangle("rectangle2", 6,4);
        rectangles2[2][0] = new Rectangle("rectangle3", 7,4);
        
        //RectangleObjects rectangleObjects2 = new RectangleObjects();
        
        Rectangle expected2 = rectangles2[2][0];
        
        System.out.print("\nexpected:\n" + expected2);
        System.out.print("\nresult:\n" + ObjectWithGreatestArea(rectangles2));
        
        
  }
   
}