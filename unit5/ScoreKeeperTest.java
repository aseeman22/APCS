public class ScoreKeeperTest{
     public static void main(String[] args){
        ScoreKeeper Annie = new ScoreKeeper();
        System.out.println("Initial score " + Annie.getScore());
        Annie.scoreNormal();
        System.out.println("Score after adding 100 " + Annie.getScore());
         
         
        System.out.println("intial socre of 100 " + Annie.getScore());
        Annie.scoreBonus();
        System.out.println("100 + 1000 " + Annie.getScore());
     }
}