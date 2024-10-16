public class DoubleX {
   static boolean doubleX(String str) {
        int index = 0; 
    while(index < str.length() - 1)
    {
        if(str.substring(0 + index, 1 + index).equals("x")) 
        {
            if(str.substring(1 + index, 2 + index).equals("x"))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        index++;
    }
  return false;
}
     public static void testDoubleX(String str, boolean expected){
        boolean result = doubleX(str);
        
        System.out.println("String: " + str + " expected: " + expected + " result: " + result);
        
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
        testDoubleX("abcdefx", false);
        testDoubleX("xxdkt", true);
        testDoubleX("thebnflxxnfjen", true);
        testDoubleX("thebxditu", false);
    }
}
