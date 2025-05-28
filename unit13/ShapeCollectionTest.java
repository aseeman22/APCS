import java.util.*;

public class ShapeCollectionTest
{
 public static void main(String[] args)
  {  //addShape test
    ShapeCollection shapeCollection = new ShapeCollection();
    Shape s = new Shape("square", 4);
          
    System.out.print("expected:\n" + s.getName() + "\n" + s.getNumberOfSides());
    System.out.println("\nresult:");
    shapeCollection.addShape(s);
    shapeCollection.getShapes();
     
     
     //numberOfSidesTest
     
     Shape shape2 = new Shape("square", 4);
     ShapeCollection shapeCollection2 = new ShapeCollection();
     shapeCollection2.addShape(shape2); 
     System.out.print("\nexpected:\n" + shape2.getNumberOfSides());
     System.out.print("\nresult:\n" + shapeCollection2.numberOfSides("square"));
     
     //averageNumberOfSides
     Shape shape3 = new Shape("square", 4);
     Shape shape4 = new Shape("circle", 0);
     Shape shape5 = new Shape("rectangle", 4);
     ShapeCollection shapeCollection3 = new ShapeCollection();
     
     shapeCollection3.addShape(shape3);
     shapeCollection3.addShape(shape4);
     shapeCollection3.addShape(shape5);
     
     double expected = (shape3.getNumberOfSides() + shape4.getNumberOfSides() + shape5.getNumberOfSides())/3.0;
     System.out.print("\nexpected:\n" + expected);
     System.out.print("\nresult:\n" + shapeCollection3.averageNumberOfSides() + "\n");
     
     
     //evenSides test
     
     Shape shape6 = new Shape("square", 4);
     Shape shape7 = new Shape("triangle", 3);
     Shape shape8 = new Shape("rectangle", 4);
    
     ArrayList<Shape> evenSides = new ArrayList<Shape>();
     evenSides.add(shape6);
     evenSides.add(shape8);
     
     ShapeCollection shapeCollection4 = new ShapeCollection();
     shapeCollection4.addShape(shape6);
     shapeCollection4.addShape(shape7);
     shapeCollection4.addShape(shape8);
     
     System.out.print("\nexpected:\n" + evenSides);
     System.out.print("\nresult:\n" + shapeCollection4.EvenSides());
 }
}