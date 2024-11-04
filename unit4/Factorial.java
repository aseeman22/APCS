public class Factorial{
    public static int factorial(int number){
        int finalNumber = 1;
        if(number == 0){
            finalNumber = 1;
        }
        else{
        
        for(int i = 0; i < number; i++){
        finalNumber *= number - i;
      }
     }
        return finalNumber;
 }
    
     public static void testFactorial(int number, int expected){
        int result = factorial(number);
        
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
        testFactorial(5, 120);
        testFactorial(2, 2);
        testFactorial(4, 24);
        testFactorial(3, 6);
        testFactorial(0, 1);
    }
}
 