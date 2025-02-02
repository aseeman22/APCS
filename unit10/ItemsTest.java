import java.util.*;

public class ItemsTest
{
    public static void main(String[] args)
    {
      Items apple = new Items("apple", (float)5.0);
        Items bread = new Items("bread", (float)10.0);
        
        ArrayList<Items> objects = new ArrayList<Items>();
            objects.add(apple);
            objects.add(bread);
    
            
            ItemCalculator.NamesAndPrices(objects);
        
        Items paper = new Items("paper", (float)5.0);
        Items pen = new Items("pen", (float)10.0);
        Items computer = new Items("computer", (float)15.0);
        
        ArrayList<Items> objects2 = new ArrayList<Items>();
            objects2.add(paper);
            objects2.add(pen);
            objects2.add(computer);
       
        float ExpectedAverageValue = (float)10.0;
        
        float ActualAverageValue = ItemCalculator.AveragePrice(objects2);
        
        if(ExpectedAverageValue == ActualAverageValue)
        {
            System.out.println("YAY!");
        }
        else
        {
            System.out.println("NOO!");
        }
        
        
        Items Backpack = new Items("backpack", (float)35.0);
        Items WaterBottle = new Items("WaterBottle", (float)20.0);
        Items Binder = new Items("Binder", (float)15.0);
        
        ArrayList<Items> objects3 = new ArrayList<Items>();
            objects3.add(Backpack);
            objects3.add(WaterBottle);
            objects3.add(Binder);
                
        String ExpectedMostExpensive = "backpack";
        
        String ActualMostExpensive = ItemCalculator.MostExpensiveItem(objects3);
        
        if(ExpectedMostExpensive == ActualMostExpensive)
        {
            System.out.println("YAYYY!");
        }
        else
        {
            System.out.println("BOOO!");
        }
        
        
        
    }
    

}