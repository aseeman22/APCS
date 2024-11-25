public class Array667{
public int array667(int[] nums) {
  int countOfOccurences = 0;
  for(int i = 0; i < nums.length - 1; i++)
  {
    if(nums[0 +i] == 6 && nums[1 + i] == 6)
    {
      countOfOccurences = countOfOccurences + 1;
    } 
    else if(nums[0 + i] == 6 && nums[1 + i] == 7)
    {
      countOfOccurences = countOfOccurences + 1;
    }
  }
  return countOfOccurences;
}
}