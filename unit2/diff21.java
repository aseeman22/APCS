public class diff21 {
  public static int diff21(int n){
        int j = 21 - n;
        if(n>21){
            return(j*-2);
        }
        else
        {
            return(j);
        }
    }
 public static void testdiff21(int n, boolean expected){
     boolean result = diff21(n);

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
     testdiff21(20, false);
     testdiff21(16, true, false);
     testdiff21(1, false, false);
     testdiff21(8, false, true);
     testdiff21(24, true, true);
   }
}