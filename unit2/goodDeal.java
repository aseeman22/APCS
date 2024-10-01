public class GoodDeal {
 
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


public static void testGoodDeal(double originalPrice, double salePrice, boolean expected){
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
     testGoodDeal(25, 15, true);
     testGoodDeal(16, 15, false);
     testGoodDeal(100, 50, true);
     testGoodDeal(78, 78, false);
     testGoodDeal(300, 283, false);
   }
}