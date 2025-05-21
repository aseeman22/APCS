import java.util.*;


public class VehicleTest
{
    public static void main(String[] args)
    {
        Motorcycle AnniesMotorcycle = new Motorcycle("Motorcycle", 2, true);
        Car AnniesCar = new Car("Car", 4, true);
        Tricycle AnniesTricycle = new Tricycle("Tricycle", 3, true);
        
        ArrayList<Vehicle> Cars = new ArrayList<Vehicle>();
            Cars.add(AnniesMotorcycle);
            Cars.add(AnniesCar);
            Cars.add(AnniesTricycle);
        
        for(Vehicle RandomVehicle : Cars)
        {
            System.out.println(RandomVehicle.name());
            System.out.println(RandomVehicle.wheelCount());
            System.out.println(RandomVehicle.isHumanPowered());
        }
            
    }
}