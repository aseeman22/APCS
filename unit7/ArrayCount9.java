public class ArrayCount9{
public int ArrayCount9(int[] nums) {
  int countOfOccurences = 0;
  for(int i = 0; i <nums.length; i++)
  {
    if (nums[i] == 9)
    {
      countOfOccurences += 1;
    }
  }
  return countOfOccurences;
}
      public static void testArrayCount9(int[] nums, int expected)
    {
        int result = ArrayCount9(nums);

        for (int Numbers : nums)
            System.out.println(Numbers + " ");

        System.out.println(" expected: " + expected +
                           " result: " + result + " ");

        if (result == expected)
            System.out.println("Yippee!!!");
        else
            System.out.println("Ugh!!!");
    }

    public static void main(String[] args)
    {
        int[] nums = {9, 10, 9};
        int[] nums2 = {5,6,7};
        int[] nums3 = {9, 9, 9};
        int[] nums4 = {2, 7, 9};
        
        testArrayCount9(nums, 2);
        testArrayCount9(nums2, 0);
        testArrayCount9(nums3, 3);
        testArrayCount9(nums4, 1);
    }
}
