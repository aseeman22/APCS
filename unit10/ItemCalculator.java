import java.util.*;

public class ItemCalculator
{
    public static void NamesAndPrices(ArrayList<Items> objects)
    {
        for(Items currentItem : objects)
        {
            System.out.println(currentItem.getName());
            System.out.println(currentItem.getPrice());    
        }
    }
    public static float AveragePrice(ArrayList<Items> objects)
    {
        float value = 0;
        for(Items currentItem : objects)
        {
            value += currentItem.getPrice();
        }
            value = value/objects.size();
            return value;
    }
    public static String MostExpensiveItem(ArrayList<Items> objects)
    {
        float MaxValue = 0;
        String name = " ";
        for(Items currentItem : objects)
        {
           
            if(currentItem.getPrice()>MaxValue)
            {
                MaxValue = currentItem.getPrice();
                name = currentItem.getName();
            }
            
        }
        return name;
    }
}