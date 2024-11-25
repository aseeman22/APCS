public class SumOfSquares{
    public static double SumOfSquares(double[] numbers){
        double sum = 0;
        for(double originalNumbers: numbers)
        {
           sum += originalNumbers * originalNumbers; 
        }
        return sum;
    }
     public static void testSumOfSquares(double[] numbers, double expected)
    {
        double result = SumOfSquares(numbers);

        for (double Squares : numbers)
            System.out.println(Squares + " ");

        System.out.println(" expected: " + expected +
                           " result: " + result + " ");

        if (result - expected< 1e-6)
            System.out.println("Yippee!!!");
        else
            System.out.println("Ugh!!!");
    }

    public static void main(String[] args)
    {
        double[] numbers = {2.0, 4.0, 6.0};
        double[] numbers2 = {1.0,7.0,3.0};
        double[] numbers3 = {5.0, 3.0, 2.0};
        double[] numbers4 = {6.6, 2.4, 3.9};
        
        testSumOfSquares(numbers, 56.0);
        testSumOfSquares(numbers2, 59.0);
        testSumOfSquares(numbers3, 38.0);
        testSumOfSquares(numbers4, 64.53);
    }
}