public class ComputationsOnArraysTest
{
     public static void main(String[] args)
  {
         //smallest integer test
         int[][] numbers = {
                           {1,2,3,4},
                           {5,6,7,8},
                           {9,1,2,3}
                                    };
         
         int[][] numbers2 = {
                           {3,5,1,8,6,2},
                           {5,3,7,2,5,0}
                                        };
         
         
         int result = ComputationsOnArrays.SmallestInteger(numbers);
        int result2 = ComputationsOnArrays.SmallestInteger(numbers2);
         
         System.out.print("\nresult:\n" + result + "\n" + result2);
         
         System.out.print("\nexpected:\n1\n0");
         
         
         
         
         //sum of array test
         //numbers are float, not ints
         float[][] numbers3 = {
                           {1,2,3,4},
                           {5,6,7,8},
                           {9,1,2,3}
                                    };
         
         float[][] numbers4 = {
                           {3,5,1,8,6,2},
                           {5,3,7,2,5,0}
                                        };
         
         float result3 = ComputationsOnArrays.SumOfArray(numbers3);
         float result4 = ComputationsOnArrays.SumOfArray(numbers4);
         System.out.print("\nresult:\n" + result3 + "\n" + result4);
         
         System.out.print("\nexpected:\n51.0\n47.0");
         
         //number of strings with "a" test
         
          String[][] words = {
                           {"gjhia","akjao","gojk"},
                           {"kmgi","nir","anruh"},
                           {"kngir","kr","angri"}
                                    };
         
         String[][] words1 = {
                           {"ianife","nanien"},
                           {"aknf","annfue"}
                                        };
         int result5 = ComputationsOnArrays.NumberOfStringsWithA(words);
         int result6 = ComputationsOnArrays.NumberOfStringsWithA(words1);
         
          System.out.print("\nresult:\n" + result5 + "\n" + result6);
         
         System.out.print("\nexpected:\n5\n4\n");
  }
}