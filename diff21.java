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
 public static void testdiff21(){
     System.out.println("Testing function for n = 1. Answer should be 20");
     System.out.println(diff21(1)); 
     System.out.println("Testing function for n = 2. Answer should be 19");
     System.out.println(diff21(2));
     System.out.println("Testing function for n = 35. Answer should be 28");
     System.out.println(diff21(35));
     System.out.println("Testing function for n = -20. Answer should be 41");
     System.out.println(diff21(-20));
     System.out.println("Testing function for n = 21. Answer should be 0");
     System.out.println(diff21(21));
 } 
 public static void main(String[] args) 
   {
      testdiff21();
   }
}