public class DoubleX {
   boolean doubleX(String str) {
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
        String result = DoubleX(str);
        
        System.out.println("String: " + str + " expected: " + expected + " result: " + result);
        
        if(result.equals(expected))
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
        teststringTimes("abcdefx", false);
        teststringTimes("xxdkt", true);
        teststringTimes("thebnflxxnfjen", true);
        teststringTimes("thebxditu", false);
    }
}
