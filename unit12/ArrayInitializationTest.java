public class ArrayInitializationTest
{
  public static void main(String[] args)
  {
     //10x10 Array
      System.out.println("result: ");
      
      ArrayInitialization.tenbyten();
                    String expected = "Expected:\n1 0 0 0 0 0 0 0 0 0\n0 1 0 0 0 0 0 0 0 0\n0 0 1 0 0 0 0 0 0 0\n0 0 0 1 0 0 0 0 0 0\n0 0 0 0 1 0 0 0 0 0\n0 0 0 0 0 1 0 0 0 0\n0 0 0 0 0 0 1 0 0 0\n0 0 0 0 0 0 0 1 0 0\n0 0 0 0 0 0 0 0 1 0\n  0 0 0 0 0 0 0 0 0 1";
      System.out.print(expected);
      
      //Initialize a 2D Array Of Strings
      
      System.out.println("result: ");
      ArrayInitialization.ArrayOfStrings();
      
        
          
    System.out.println("expected: \n \"\" \"\" \"\" \"\" \"\" \"\" \"\" \"\" \"\" \"\" \n \"\" \"\" \"\" \"\" \"\" \"\" \"\" \"\" \"\" \"\" \n \"\" \"\" \"\" \"\" \"\" \"\" \"\" \"\" \"\" \"\"\n \"\" \"\" \"\" \"\" \"\" \"\" \"\" \"\" \"\" \"\" \n \"\" \"\" \"\" \"\" \"\" \"\" \"\" \"\" \"\" \"\" \n \"\" \"\" \"\" \"\" \"\" \"\" \"\" \"\" \"\" \"\" \n \"\" \"\" \"\" \"\" \"\" \"\" \"\" \"\" \"\" \"\" \n \"\" \"\" \"\" \"\" \"\" \"\" \"\" \"\" \"\" \"\" ");
      
      
      //Array Of Doubles
      
      System.out.println("result : ");
      ArrayInitialization.ArrayOfDoubles();
    
          
          System.out.println("expected: \n 11.0 12.0 13.0 14.0 15.0 \n 21.0 22.0 23.0 24.0 25.0 \n 31.0 32.0 33.0 34.0 35.0 \n 41.0 42.0 43.0 44.0 45.0 \n 51.0 52.0 53.0 54.0 55.0");
      
      //Array Of Integers
      
      System.out.print("result:\n");
      ArrayInitialization.ArrayOfIntegers();
      
      System.out.println("expected: \n 1 1 1 1 1\n 2 2 2 2 2\n 3 3 3 3 3\n 4 4 4 4 4\n 5 5 5 5 5\n 6 6 6 6 6");
      
    
      
          
  }
}