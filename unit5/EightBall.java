public class EightBall{
private final String x = "yes";
private final String y= "no";
private final String z = "maybe";
public EightBall(){
    
}
public String ask(String question)
    {
      int value = (int) (Math.random() * 3 + 1);
    if(value == 1){
        return x;
    }
    else if(value == 2){
        return y;
    }
    else
    {
        return z;
    }
  }
}