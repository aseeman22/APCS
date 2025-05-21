public class ArrayInitialization
{
 public static void tenbyten(){
    int[][] values = new int[10][10];
   for(int i = 0; i<10; i++){
       for(int j = 0; j<10; j++){
   
        if(i == j)
        {
            values[i][j] = 1;
        }
        else 
        {
            values[i][j] = 0;
        }
          System.out.print(values[i][j] + " ");
           if(j == 9)
          {
              System.out.print(" \n");
          }
      }
    }
   }
    
    
    
    public static void ArrayOfStrings()
    {
              
        String[][] words = new String[10][10];
          for(int i = 0; i<10; i++){
              for(int j = 0; j<10; j++){
                  words[i][j] = "";
                  
                  System.out.print(" " + "\"" + words[i][j] + "\"" );
                  if(j == 9)
                  {
                      System.out.print(" \n");
                  }
              }
          }
   
    }
    
    
    
    
    public static void ArrayOfDoubles()
    {
        double[][] numbers = new double[5][5];
            for(int i = 0; i<5; i++)
            {
                for(int j = 0; j<5; j++)
                {
                   numbers[i][j] = 1.0 * 10.0;
                }
            }
    }
    
    
    public void ArrayOfIntegers()
    {
        int[][] numbers = new int[6][5];
             for(int i = 0; i<5; i++)
            {
                for(int j = 0; j<5; j++)
                {
                   numbers[i][j]= i + 1;
                    
                }
             }
            
    }
    
    public static void main(String[] args)
  {
    }
    
}