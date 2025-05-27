import java.util.*;

public class ShapeCollectionTest
{
 public static void main(String[] args)
  {  //addShape test
    Shape shape = new Shape("square", 4);
    ArrayList<Shape> shapes = new ArrayList<Shape>();
    shapes.add(shape);
    ShapeCollection shapeCollection = new ShapeCollection();
    
    System.out.print("expected: " + shapes + "\n");
    System.out.println("result: ");
    shapeCollection.addShape(shape);
    shapeCollection.getShapes();
     //Why is this returning a null?
     
     //numberOfSidesTest
     
     Shape shape2 = new Shape("square", 4);
     ShapeCollection shapeCollection2 = new ShapeCollection();
     System.out.print("expected: " + shape2.getNumberOfSides() + shape2.getName());
     System.out.print("result: " + shapeCollection2.numberOfSides());
 }
}