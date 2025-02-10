import java.util.*;


public class CarTest
{
    public static void main(String[] args)
    {
        Motorcycle AnniesMotorcycle = new Motorcycle("Motorcycle");
        Car AnniesCar = new Car("Car");
        Tricycle AnniesTricycle = new Tricycle("Tricycle");
        
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