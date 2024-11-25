public int arrayCount9(int[] nums) {
  int countOfOccurences = 0;
  for(int i = 0; i <nums.length; i++)
  {
    if (nums[i] == 9)
    {
      countOfOccurences = countOfOccurences + 1;
    }
  }
  return countOfOccurences;
}
