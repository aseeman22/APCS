
public class hasTeen{
    
    public static boolean hasTeen(int a, int b, int c) {
        if (a>= 13 && a<=19){
            return true;
            } 
            else if (b>=13 && b<=19){
            return true;
            }
            else if (c>=13 && c<=19){
                return true;
            }
            else
            {
                return false;
            }
        }
 public static void testhasTeen(int a, int b, int c, boolean expected){
     boolean result = hasTeen(a, b, c);
   
    System.out.println(" a: " + a + " b: " + b + " c: " + c + " expected: " + expected + " result: " + result);
    
    if (result == expected)
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
        testhasTeen(15, 16, 21, true);
        testhasTeen(12, 7, 30, false);
        testhasTeen(13, 18, 17, true);
        testhasTeen(1, 3, 7, false);
    }
 }

