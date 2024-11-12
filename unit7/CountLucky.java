public class CountLucky{
    public static int countLucky(int[] numbers)
    {
        int luckyNumbers = 0;
        for(int i = 0; i < numbers.length; i++)
        {
          if(numbers[0 + i] % 7 == 0 || numbers[0+i] % 10 == 7) 
          {
              luckyNumbers = luckyNumbers + 1;
          }
        }
    }
    return luckyNumbers;
}