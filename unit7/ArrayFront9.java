public class ArrayFront9{

public boolean arrayFront9(int[] nums) {
  int LengthOfArray = nums.length;
  if (LengthOfArray > 4)
  {
    LengthOfArray= 4;
  }
  
  for (int i=0; i<LengthOfArray; i++) {
    if (nums[i] == 9) 
    {
      return true;
    }
  }
  
  
  return false;

 }
}