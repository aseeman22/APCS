import java.util.*;


public class MaximumValue{
    public static double MaximumValue(ArrayList<Double> numbers){
    
        double result = numbers.get(0);
        for(double MaybeBiggestNumber: numbers)
        {
            if(MaybeBiggestNumber > result)
            {
                result = MaybeBiggestNumber;
            }
        }
        return result;
    }
    
         public static void main(String[] args)
         
     {  
        
        ArrayList<Double> possibleBiggestNumbers = new ArrayList<Double>();
             possibleBiggestNumbers.add(13.0);
             possibleBiggestNumbers.add(30.0);
             possibleBiggestNumbers.add(62.0);
             possibleBiggestNumbers.add(1.0);
             
            System.out.println(MaximumValue(possibleBiggestNumbers));
             
        ArrayList<Double> possibleBiggestNumbers2 = new ArrayList<Double>();
             possibleBiggestNumbers2.add(15.0);
             possibleBiggestNumbers2.add(27.0);
             possibleBiggestNumbers2.add(86.0);
             possibleBiggestNumbers2.add(102.0);
             
              System.out.println(MaximumValue(possibleBiggestNumbers2));
        
        ArrayList<Double> possibleBiggestNumbers3 = new ArrayList<Double>();
             possibleBiggestNumbers3.add(47.0);
             possibleBiggestNumbers3.add(99.0);
             possibleBiggestNumbers3.add(23.0);
             possibleBiggestNumbers3.add(4.0);
             
              System.out.println(MaximumValue(possibleBiggestNumbers3));
      
        }
}