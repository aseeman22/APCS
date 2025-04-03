import java.util.*;
public class VehicleStatsTest

{
    public static void main(String[] args)
  {
       
    //Total Number Of Wheels Test
    Motorcycle AnniesMotorcycle = new Motorcycle("Motorcycle", 2, true);
    Tricycle AnniesTricycle = new Tricycle("Tricycle", 3, true);
    Car AnniesCar = new Car("Car", 4, true);
    
    ArrayList<Vehicle> Vehicles = new ArrayList<Vehicle>();
        Vehicles.add(AnniesMotorcycle);
        Vehicles.add(AnniesTricycle);
        Vehicles.add(AnniesCar);
    
    int ExpectedTotalNumberOfWheels = 9;
    int result = VehicleStats.TotalNumberOfWheels(Vehicles);
    
    System.out.println("Expected: " + ExpectedTotalNumberOfWheels);
    System.out.println("result: " + result);
    
    //Human Powered Vehicle Test
    Motorcycle AnniesMotorcycle2 = new Motorcycle("Motorcycle", 2, true);
    Tricycle AnniesTricycle2 = new Tricycle("Tricycle", 3, true);
    Car AnniesCar2 = new Car("Car", 4, true);
    
     ArrayList<Vehicle> Vehicles2 = new ArrayList<Vehicle>();
        Vehicles2.add(AnniesMotorcycle2);
        Vehicles2.add(AnniesTricycle2);
        Vehicles2.add(AnniesCar2);
    
    
    ArrayList<Vehicle> expected = new ArrayList<Vehicle>();
         expected.add(AnniesMotorcycle2);
         expected.add(AnniesTricycle2);
         expected.add(AnniesCar2);
        
        
        
        //(AnniesMotorcycle2.isHumanPowered() == true && AnniesTricycle2.isHumanPowered() == true && AnniesCar2.isHumanPowered() == true);
    ArrayList<Vehicle> result2 = VehicleStats.HumanPoweredVehicle(Vehicles2);
    
    System.out.println("Expected: " + expected);
    System.out.println("Result: " + result2);
    }
    
    
    
    
}