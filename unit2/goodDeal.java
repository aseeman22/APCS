public class goodDeal {
 
   public static boolean goodDeal(double originalPrice, double salePrice) 
   {
       if(salePrice<0.75 * originalPrice)
       {
           return(true);
       }
       else
       {
           return(false);
       }
   }
}

public static void testgoodDeal(double originalPrice, double salePrice, boolean expected){
    boolean result = goodDeal(originalPrice, salePrice);
         
        System.out.println("originalPrice: " + originalPrice +  " salePrice: " + salePrice + " expected: " + expected + " result: " + result);
     
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
     testisVampire(25, 15, true);
     testisVampire(16, 15, false);
     testisVampire(100, 50, true);
     testisVampire(78, 78, false);
     testisVampire(300, 283, false);
   }
