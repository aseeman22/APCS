public class SumOfSquares{
    public static int sumOfSquares(int number){
        int a = 0;
        for(int b = 1; b <= number; b++){
            a += b * b; 
        }
        
        return a;
    }
         public static void testSumOfSquares(int number, int expected){
        int result = sumOfSquares(number);
        
        System.out.println("number: " + number + " expected: " + expected + " result: " + result);
        
        if(result == expected)
        {
            System.out.println("YAY!");
        } 
        else
        {
            System.out.println("BOOHOO!");
        }
    }
    
    public static void main(String[] args)
    {
        testSumOfSquares(5, 55);
        testSumOfSquares(2, 5);
        testSumOfSquares(7, 140);
        testSumOfSquares(4, 30);
    }
   }
