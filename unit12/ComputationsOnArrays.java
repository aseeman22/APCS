
public class ComputationsOnArrays{

    public static int SmallestInteger(int[][] numbers)
    {
        int SmallestNumber = 100;
        for(int i = 0; i<numbers.length; i++)
        {
            for(int j = 0; j<numbers[0].length; j++)
            {
                if(numbers[i][j] < SmallestNumber)
                {
                    SmallestNumber = numbers[i][j];
                }
            }
        }
          return SmallestNumber;
    }
    
    
    public static float SumOfArray(float[][] numbers)
    {
        float sum = 0;
        for(int i = 0; i<numbers.length; i++)
        {
            for(int j = 0; j<numbers[0].length; j++)
            {
                sum+= numbers[i][j];
            }
        }
        return sum;
    }
    
    public static int NumberOfStringsWithA(String[][] words)
    {
        int NumberOfA = 0;
          for(int i = 0; i<words.length; i++)
        {
            for(int j = 0; j<words[0].length; j++)
            {
                for(int k = 0; k<words[i][j].length(); k++)
                {
                    if(words[i][j].substring(k,k+1).equals("a"))
                    {
                        NumberOfA+=1;
                    }
                }
            }
        }
        return NumberOfA;
        
    }
}
