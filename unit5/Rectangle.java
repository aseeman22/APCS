public class Rectangle{
    private double base;
    private double height;
    public Rectangle(double baseInput, double heightInput)
   {
       base = baseInput; 
       height = heightInput;
   }
     
    public double getBase()
    {
       return base;
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public double area(){
       return base*height;
    }
    
    public double perimeter(){
      return base + base + height + height;
    }
    
    public double diagonal(){
       return Math.sqrt((base * base) + (height * height));
    }
    
}