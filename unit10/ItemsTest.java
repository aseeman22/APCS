import java.util.*;

public class ItemsTest
{
    public static void main(String[] args)
    {
       Items apple = Items("apple", 5.0);
        Items bread = Items("bread", 10.0);
        
        ArrayList<Items> objects = new ArrayList<Items>();
            objects.add(apple);
            objects.add(bread);
    
            
            ItemCalculator.NamesAndPrices(objects);
    }

}