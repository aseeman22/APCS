public class Reverse{
    public static String reverse(String word){
        for(int i = 1; i <= word.length; i++){
            word.substring(word.length, 0);
        }
    }
}