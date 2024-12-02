import java.util.*;

public class CountLucky{
    public static int CountLucky(ArrayList<Integer> numbers)
    {
        
        int luckyNumbers = 0;
        for(int i = 0; i < numbers.size(); i++)
        {
            int number = numbers.get(i);
          if(number % 7 == 0 || number % 10 == 7) 
          {
              luckyNumbers = luckyNumbers + 1;
          }
        }
         return luckyNumbers;
    }
    public static void testCountLucky(ArrayList<Integer> numbers, int expected)
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
        ArrayList<Integer> numbers = new ArrayList<Integer>(); 
            numbers.add(37);
            numbers.add(2);
            numbers.add(21);
        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
            numbers2.add(1);
            numbers2.add(7);
            numbers2.add(9);
            numbers2.add(25);
        ArrayList<Integer> numbers3 = new ArrayList<Integer>();
            numbers3.add(49);
            numbers3.add(14);
            numbers3.add(56);

        
        testCountLucky(numbers, 2);
        testCountLucky(numbers2, 1);
        testCountLucky(numbers3, 3);
    }
}

