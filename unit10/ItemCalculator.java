public class ItemCalculator
{
    public void NamesAndPrices(ArrayList<Items> objects)
    {
        for(Items curremtItem : objects)
        {
            System.out.println(currentItem.getName());
            System.out.println(currentItem.getPrice());    
        }
    }
    public double AveragePrice(ArrayList<Items> objects)
    {
        double value = 0;
        for(Items currentItem : objects)
        {
            value += currentItem.getPrice();
        }
            value = value/objects.size();
            return value;
    }
    public String MostExpensiveItem(ArrayList<Items> objects)
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