public class CountOfOccurences{
    public static int countOfOccurences(String word, String part){
        String wordSubstring;
        int numberOfMatches = 0;
        for(int i = 0; i<word.length(); i++){
           wordSubstring = word.substring(i, i+part.length());
            if(wordSubstring.equals(part))
            {
              numberOfMatches = numberOfMatches + 1;
            }
        }
        return numberOfMatches;
    }
    
     public static void testCountOfOccurences(String word, String part, int expected){
        int result = countOfOccurences(word, part);
        
        System.out.println("word: " + word + " part: " + part + " expected: " + expected + " result: " + result);
        
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
        testCountOfOccurences("Annieieieieie", "ie", 5);
        testCountOfOccurences("helelelelloooo", "el", 4);
        testCountOfOccurences("pilillow", "il", 2);
        testCountOfOccurences("typiiiiiiiiiiiing", "i", 12);
    }
}