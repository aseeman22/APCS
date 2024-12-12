public class FilteredList{
    public static ArrayList<Integer> FilteredList(ArrayList<Integer> numbers){
       ArrayList<Integer> FilteredNumbers = new ArrayList<Integer>();
        for(int MaybeGreaterThan90: numbers)
        {
            if(MaybeGreaterThan90>90)
            {
                FilteredList.add(MaybeGreaterThan90);
            }
        }
        return FilteredNumbers;
    }