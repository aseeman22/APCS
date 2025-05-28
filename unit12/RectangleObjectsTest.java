public class RectangleObjectsTest
{
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
        System.out.print("\nresult:\n" + RectangleObjects.averagePerimeter(rectangles));
        
        //ObjectWithGreatestArea Test
        
        Rectangle[][] rectangles2 = new Rectangle[3][1];
        
        rectangles2[0][0] = new Rectangle("rectangle", 5, 4);
        rectangles2[1][0] = new Rectangle("rectangle2", 6,4);
        rectangles2[2][0] = new Rectangle("rectangle3", 7,4);
        
        //RectangleObjects rectangleObjects2 = new RectangleObjects();
        
        Rectangle expected2 = rectangles2[2][0];
        
        System.out.print("\nexpected:\n" + expected2);
        System.out.print("\nresult:\n" + RectangleObjects.ObjectWithGreatestArea(rectangles2));
        
        
  }
}