public class SumOfSquares{
    public static int sumOfSquares(){
        int a = 0;
        for(int b = 1; b <= 10; b++){
            a += b * b;
        }
        
        return a;
    }
    
   public static void main(String[] args){
    System.out.println(SumOfSquares());
   }
}