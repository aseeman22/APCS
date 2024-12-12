public class MaximumValue{
    public static double MaximumValue(ArrayList<Double> numbers){
        double BiggestNumber = Double.MIN_VALUE;
        for(double MaybeBiggestNumber: numbers)
        {
            if(MaybeBiggestNumber > BiggestNumber)
            {
                BiggestNumber = MaybeBiggestNumber;
            }
        }
        return BiggestNumber;
    }
}