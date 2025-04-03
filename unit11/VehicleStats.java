import java.util.*;


public class VehicleStats 
{
   
    public static int TotalNumberOfWheels(ArrayList<Vehicle> Vehicles)
    {
        int totalNumberOfWheels = 0; 
        for(Vehicle vehicle : Vehicles)
        {
            totalNumberOfWheels += vehicle.wheelCount();
        }
        return totalNumberOfWheels;
    }
    
    public static ArrayList<Vehicle> HumanPoweredVehicle(ArrayList<Vehicle> vehicles)
    {
        ArrayList<Vehicle> humanPoweredVehicles = new ArrayList<Vehicle>();
        for(Vehicle vehicle : vehicles)
        {
            if(vehicle.isHumanPowered() == true)
            {
                humanPoweredVehicles.add(vehicle);
            }
        }
        return humanPoweredVehicles;
    }
}