import java.util.*;

public class FilteredList{
    public static ArrayList<Integer> filteredList(ArrayList<Integer> numbers){
       ArrayList<Integer> FilteredNumbers = new ArrayList<Integer>();
        for(int MaybeGreaterThan90: numbers)
        {
            if(MaybeGreaterThan90>90)
            {
                FilteredNumbers.add(MaybeGreaterThan90);
            }
        }
        return FilteredNumbers;
     }
        
         public static void main(String[] args)
         
     {  
         ArrayList<Integer> MixedList = new ArrayList<Integer>();
                MixedList.add(50);
                MixedList.add(102);
                MixedList.add(200);
      
        ArrayList<Integer> Above90 = filteredList(MixedList);
        for(int a: Above90){
            System.out.println(a);
        }
            
        
        ArrayList<Integer> MixedList2 = new ArrayList<Integer>();
              MixedList2.add(61);
              MixedList2.add(111);
              MixedList2.add(39);
      
        ArrayList<Integer> Above902 = filteredList(MixedList2);
        for(int a: Above902){
            System.out.println(a);
        }
            
            
        ArrayList<Integer> MixedList3 = new ArrayList<Integer>();
                MixedList3.add(95);
                MixedList3.add(107);
                MixedList3.add(176);
      
        ArrayList<Integer> Above903 = filteredList(MixedList3);
        for(int a: Above903){
            System.out.println(a);
        }
      }
      
    }
    
    