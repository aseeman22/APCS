import java.util.*;


public class TransformedList{
    public static ArrayList<String> ReverseAll(ArrayList<String> words){
    ArrayList<String> ReversedWords = new ArrayList<String>(); 
    for(String forwardWord: words)
    {
        ReversedWords.add(reverse(forwardWord));
    }
   return ReversedWords;
  }
    
    public static String reverse(String word)
    {
        String backwardsWord = "";
        for(int i = 0; i<word.length(); i++){
            backwardsWord = backwardsWord + word.substring(word.length()-i-1, word.length()-i); 
        
        
        }
        return backwardsWord;
    }
     public static void main(String[] args)
         
     {
       String Output, Annie = ( "hi");
        Output = reverse(Annie);
         
         if (Output.equals("ih"))
            System.out.println("Yippee!!!");
        else
            System.out.println("Ugh!!!");
         
         ArrayList<String> AllWords = new ArrayList<String>();
            AllWords.add("Annie");
            AllWords.add("jgrup");
            AllWords.add("fjiai");
         ArrayList<String> ExpectedWords = new ArrayList<String>();
            ExpectedWords.add("einnA");
            ExpectedWords.add("purgj");
            ExpectedWords.add("iaijf");
         ArrayList<String> testingReverseAll = new ArrayList<String>();
        testingReverseAll = ReverseAll(AllWords);
         boolean tester = true;
         for(int i = 0; i<testingReverseAll.size(); i++)
         {
            if(testingReverseAll.get(i).equals(ExpectedWords.get(i)))
            {
                tester = true;
            }
             else
             {
                 tester = false;
             }
         }
         if(tester == true)
         {
           System.out.println("yay!");  
         }
         else
         {
            System.out.println("No!");
         }
     }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    