import java.util.*;

public class AnimalCalculator
{
   public static void FurryOrNotFurry(ArrayList<Animal> animals)
   {
       
       for(Animal animal:animals)
       {
           
             System.out.println(animal.getName());
           if(animal.getFurriness() == true)
           {
               System.out.println("furry");
           }
           else
           {
               System.out.println("not Furry");
           }
          
           System.out.println(animal.getLegCount());
            System.out.println(" ");
           
           
          
    
       }
   }
    
    public static double AverageNumberOfLegs (ArrayList <Animal> animals)
    {
        double average = 0;
        for(Animal animal: animals){
        average += animal.getLegCount();
        }
        return average = average/animals.size();
    }
    
    public static Animal FewestNumberOfLegs (ArrayList <Animal> animals)

    {
        Animal LeastNumberOfAnimalLegs = animals.get(0);
        int SmallestNumberOfLegs = 100;
        for(Animal currentAnimal: animals)
        {
            if(currentAnimal.getLegCount()< SmallestNumberOfLegs)
            {
                SmallestNumberOfLegs = currentAnimal.getLegCount();
                LeastNumberOfAnimalLegs = currentAnimal;
            }
        }
        return LeastNumberOfAnimalLegs;
    }

}