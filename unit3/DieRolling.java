public class DieRolling{
    public static int DieRoll(){
        int Die;
        Die = (int) (Math.random() * 6 + 1);
        return Die;  
    }
  public static void main(String[] args){
      for(int i = 1; i<100; i++)
      {
          System.out.println(DieRoll());
      }
  }
}