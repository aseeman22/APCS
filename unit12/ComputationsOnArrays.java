
public class ComputationsOnArrays{

    public int SmallestInteger(int[][] numbers)
    {
        int SmallestNumber = 0;
        for(int i = 0; i<numbers.length; i++)
        {
            for(int j = 0; j<numbers.length; i++)
            {
                if(numbers[i][j] > SmallestNumber)
                {
                    SmallestNumber = numbers[i][j];
                }
            }
        }
          return SmallestNumber;
    }
    
    
    public float SumOfArray(float[][] numbers)
    {
        float sum = 0;
        for(int i = 0; i<numbers.length; i++)
        {
            for(int j = 0; j<numbers.length; i++)
            {
                sum+= numbers[i][j];
            }
        }
        return sum;
    }
    
    public int NumberOfStringsWithA(String[][] words)
    {
        int NumberOfA = 0;
          for(int i = 0; i<words.length; i++)
        {
            for(int j = 0; j<words.length; i++)
            {
                if(words[i][j].substring(i,j).equals("a"))
                {
                    NumberOfA+=1;
                }
            }
        }
        return NumberOfA;
        
    }
}
