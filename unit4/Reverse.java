public class Reverse{
    public static String reverse(String word){
       String reverseWord = "";
        for(int i = 1; i <= word.length(); i++){
            reverseWord = reverseWord + word.substring(word.length() - i, word.length() - (i - 1));
        }
        return reverseWord;
    }
    
     public static void testReverse(String word, String expected){
        String result = reverse(word);
        
        System.out.println("word: " + word + " expected: " + expected + " result: " + result);
        
        if(result.equals(expected))
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
        testReverse("annie", "einna");
        testReverse("Hello", "olleH");
        testReverse("phone", "enohp");
        testReverse("computer", "retupmoc");
    }
}


