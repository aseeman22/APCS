public class Vampire {
  public static boolean isVampire(float hour, boolean awake){
      if (awake){
          if (hour<6 || hour>22){
              return(true);
          } else {
              return(false);
          } 
      } else {
          if (!awake){
              if(hour>=6 && hour<= 22)
              {
                  return(true);
              } else {
                  return(false);
              }
          }
      }
      return(true);
    }
 public static void testisVampire(){
     System.out.println("Testing function for hour = 1 and awake = false. Answer should be false");
     System.out.println(isVampire(1,false)); 
     System.out.println("Testing function for hour = 7 and awake = false. Answer should be true");
     System.out.println(isVampire(7,false));
     System.out.println("Testing function for  hour = 21 and awake = true. Answer should be false");
     System.out.println(isVampire(21,true));
     System.out.println("Testing function for hour = 24 and awake = false. Answer should be false");
     System.out.println(isVampire(24,false));
     System.out.println("Testing function for hour = 3 and awake = true. Answer should be true");
     System.out.println(isVampire(3, true));
 } 
 public static void main(String[] args) 
   {
      testisVampire();
   }
}