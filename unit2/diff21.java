public class diff21 {
  public static int diff21(int n){
        int j = 21 - n;
        int x = n - 21;
        if(n>21){
            return(x*2);
        }
        else
        {
            return(j);
        }
    }
 public static void testdiff21(int n, int expected){
     int result = diff21(n);

     System.out.println("n: " + n + " expected: " + expected + " result: " + result);
     
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
     testdiff21(20, 1);
     testdiff21(26, 10);
     testdiff21(1, 20);
     testdiff21(10, 11);
     testdiff21(24, 6);
   }
}