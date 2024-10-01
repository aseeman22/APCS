public class NearHundred {

public static boolean NearHundred(int n) {
  if(n>=90 && n<=110)
  {
    return true;
  } else if (n>=190 && n<=210)
  {
    return true;
  }
  else 
  {
    return false;
  }
 }
    public static void testNearHundred(int n, boolean expected){
        boolean result = NearHundred(n);
        
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
        testNearHundred(91, true);
        testNearHundred(209, true);
        testNearHundred(300, false);
        testNearHundred(84, false);
    }
}