 public class Attention{
  public static boolean attention(String attentionString){
      String attentionSubstring;
      attentionSubstring = attentionString.substring(0,9);
      if(attentionSubstring.equals("Hey, You!"))
      {
          return true;
      }
      else 
      {
          return false;
      }
  }
    
    public static void testAttention(String attentionString, boolean expected){
        boolean result = attention(attentionString);
        
        System.out.println("attention: " + attentionString + " expected: " + expected + " result " + result);
            
        if (result == expected)
        {
            System.out.println("YAY!");
        } 
        else
        {
            System.out.println("BOOHOO!");
        }
    }
     public static void main(String[] args){
         testAttention("Hey, You! I am happy.", true);
         testAttention("Hey, I am happy.", false);
         testAttention("I am happy.", false);
     }
         
}