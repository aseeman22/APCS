public class Vampire {
  public static boolean isVampire(float hour, boolean awake){
      if (awake==true && hour<6 || hour>22){
              return true;
      }
       else if(awake == false && (hour>=6 && hour<= 22))
              {
                  return true;
              } else {
                  return false;
              }
          }
      
  
 public static void testisVampire(float hour, boolean awake, boolean expected){
     boolean result = isVampire(hour, awake);

     System.out.println("hour: " + hour +  " awake: " + awake + " expected: " + expected + " result: " + result);
     
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
     testisVampire(22, true, true);
     testisVampire(16, true, false);
     testisVampire(1, false, false);
     testisVampire(8, false, true);
     testisVampire(24, true, true);
   }
}