public class Items{
    private String name;
    private float price;
    public Items(String nameInput, float priceInput)
    {
        name = nameInput;
        price = priceInput;
    }
    
    public String getName()
    {
        return name;
    }
    
    public float getPrice()
    {
        return price;
    }
}