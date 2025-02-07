public class CarTest
{
    public static void main(String[] args)
    {
        Vehicle Motorcycle = new Motorcyle("Motorcycle", 2, true);
        Vehicle Bus = new Bus("Bus", 4, true);
        Vehicle Tricycle = new Tricycle("Tricycle", 3, true);
        
        ArrayList<Vehicle> Cars = new ArrayList<Vehicle>();
            Cars.add(Motorcycle);
            Cars.add(Bus);
            Cars.add(Tricycle);
            
    }
}