public class Reverse{
    public static String reverse(String word){
        for(int i = 1; i <= word.length(); i++){
            word.substring(word.length() - 1, 0);  //word.length
        }
        return word.substring(word.length() - 1, 0);
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