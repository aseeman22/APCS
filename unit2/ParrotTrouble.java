public class ParrotTrouble{
public static boolean ParrotTrouble(boolean talking, int hour) {
  if (talking == true && (hour<7 || hour>20))
  {
    return true;
  }
  else
  {
    return false;
  }
}
    
public static void testParrotTrouble(boolean talking, int hour, boolean expected){
   boolean result = ParrotTrouble(talking, hour);
   
    System.out.println(" talking: " + talking + " hour: " + hour + " expected: " + expected + " result: " + result);
    
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
        testParrotTrouble(true, 7, false);
        testParrotTrouble(true, 3, true);
        testParrotTrouble(true, 18, false);
        testParrotTrouble(false, 24, false);
    }
}
