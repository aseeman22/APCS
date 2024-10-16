public class stringTimes{
    public String stringTimes(String str, int n) {
        String hi = "";
        for(int i = 1; i<= n; i++)
     {
          hi = hi + str; 
     }
        return hi;
  }
     public static void teststringTimes(String str, int n, String expected){
        String result = stringTimes(str, n);
        
        System.out.println("String: " + str + " n: " + n + " expected: " + expected + " result: " + result);
        
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
        teststringTimes(Annie, 5, "AnnieAnnieAnnieAnnieAnnie");
        teststringTimes(y, 3, "yyy");
        teststringTimes(Hi, 4, "HiHiHiHi");
        teststringTimes(String, 7, "StringStringStringStringStringStringString");
    }
  }
}
