public class CoinFlip {
    public static String CoinFlipping(){
        int Coin; 
        Coin = (int) (Math.random() * 2); 
            if (Coin == 0)
            {
                return "heads";
            }
            else
            {
                return "tails";
            }
    } 
    
    public static void main(String[] args){
      for(int i = 1; i<=10; i++)
      {
          System.out.println(CoinFlipping());
      }
    }
}