public class Fibonacci {
 
   public static void main(String[] args) 
   {
       int a = 0;
       int b = 1;
       {
           System.out.println(b);
       }
       for(int i = 1; i <31; i++)
       {
           int j = a + b;
           a = b;
           b = j;
           
           //int k = i + 1;
           //int l = j + k;
           {
               System.out.println(j);
           }
       }
   }
   
}