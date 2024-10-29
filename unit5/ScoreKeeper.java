public class ScoreKeeper{
    private int score = 0;
    public ScoreKeeper()
    {
        
    }
    public int getScore()
    {
        return score;
    }
    
    public void scoreNormal(){
        score = 100 + score;
    }
    
    public void scoreBonus(){
        score = 1000 + score;
    }
}