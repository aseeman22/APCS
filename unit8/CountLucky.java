import java.util.*;

public class CountLucky{
    public static int CountLucky(ArrayList<Int> numbers)
    {
        
        int luckyNumbers = 0;
        for(int i = 0; i < numbers.length; i++)
        {
          if(numbers[0 + i] % 7 == 0 || numbers[0+i] % 10 == 7) 
          {
              luckyNumbers = luckyNumbers + 1;
          }
        }
         return luckyNumbers;
    }
    public static void testCountLucky(int[] numbers, int expected)
    {
        int result = CountLucky(numbers);

        for (int Lucky : numbers)
            System.out.println(Lucky + " ");

        System.out.println(" expected: " + expected +
                           " result: " + result + " ");

        if (result == expected)
            System.out.println("Yippee!!!");
        else
            System.out.println("Ugh!!!");
    }

    public static void main(String[] args)
    {
        int[] numbers = {37, 2, 21};
        int[] numbers2 = {1, 7, 9, 25};
        int[] numbers3 = {49, 14, 56};
        
        testCountLucky(numbers, 2);
        testCountLucky(numbers2, 1);
        testCountLucky(numbers3, 3);
    }
}

