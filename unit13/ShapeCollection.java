public class ShapeCollection
{
    ArrayList<Shape> shapes = new ArrayList<Shape>();
    
    public void addShape(Shape object)
    {
        shapes.add(object);
    }
    
    public int numberOfSides(String shapeName)
    {
        int sides = 0;
        for(Shape shape: shapes)
        {
            if(shape.getName() == shapeName)
            {
              sides = shape.getNumberOfSides();  
            }
        }
        
        return sides;
    }
    
    public double averageNumberOfSides()
    {
        double average = 0; 
        for(Shape shape: shapes)
        {
            average += shape.getNumberOfSides();
        }
        
         average = average/shapes.size();
        return average;
    }
    
    public ArrayList<Shape> EvenSides()
    {
        ArrayList<Shape> evenSides = new ArrayList<Shape>();
        for(Shape shape: shapes)
        {
            if(shape.getNumberOfSides % 2 == 0)
            {
                evenSides.add(shape);
            }
        }
        
        return evenSides;
    }
}