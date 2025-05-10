import java.util.*;

public class AnimalCalculatorTest
{
  public static void main(String[] args)
  {
       
      //FurryOrNotFurry Test
        Human AnniesHuman3 = new Human("Human", 2, false);
        Cat AnniesCat3 = new Cat("Cat", 4, true);
        Sponge AnniesSponge3 = new Sponge("Sponge", 0, false);
        Centipede AnniesCentipede3 = new Centipede("Centipede", 100, true);
        
        ArrayList<Animal> animals = new ArrayList<Animal>();
            animals.add(AnniesHuman3);
            animals.add(AnniesCat3);
            animals.add(AnniesSponge3);
            animals.add(AnniesCentipede3);
      
       
           System.out.println("expected:\nHuman\n2\nnot Furry\n\nCat\n4\nFurry\n\nSponge\n0\nnot Furry\n\nCentipede\n100\nFurry\n ");

      System.out.println("result: ");
      AnimalCalculator.FurryOrNotFurry(animals);
      
      
      //System.out.println("Human: " + AnniesHuman3.FurryOrNotFurry() + "Cat: " + AnniesCat3.FurryOrNotFurry() + "Sponge: " + AnniesSponge3.FurryOrNotFurry() + "Centipede: " + AnniesCentipede3.FurryOrNotFurry());
            
      

      
      
      //AverageNumberOfLegs Test
        Human AnniesHuman = new Human("Human", 2, false);
        Cat AnniesCat = new Cat("Cat", 4, true);
        Sponge AnniesSponge = new Sponge("Sponge", 0, false);
        Centipede AnniesCentipede = new Centipede("Centipede", 100, true);
      
        ArrayList<Animal> animal = new ArrayList<Animal>();
      
        animal.add(AnniesHuman);
        animal.add(AnniesCat);
        animal.add(AnniesSponge);
        animal.add(AnniesCentipede);
      
        double ExpectedAverage = (2.0 + 4.0 + 0.0 + 100.0)/4.0;
        double ReturnValue = AnimalCalculator.AverageNumberOfLegs(animal);
      
        System.out.println("Average Number Of Animal Legs");
        System.out.println("Expected Value: " + ExpectedAverage);
        System.out.println("Return Value: " + ReturnValue);
      
        
        // FewestNumberOfLegs Test
        Human AnniesHuman2 = new Human("Human", 2, false);
        Cat AnniesCat2 = new Cat("Cat", 4, true);
        Sponge AnniesSponge2 = new Sponge("Sponge", 0, false);
        Centipede AnniesCentipede2 = new Centipede("Centipede", 100, true);
      
        ArrayList<Animal> animal2 = new ArrayList<Animal>();
      
        animal2.add(AnniesHuman2);
        animal2.add(AnniesCat2);
        animal2.add(AnniesSponge2);
        animal2.add(AnniesCentipede2);
      
        Animal ExpectedAnimal = AnniesSponge2;
        Animal ReturnAnimal = AnimalCalculator.FewestNumberOfLegs(animal2);
      
        System.out.println("Fewest Number Of Legs");
      System.out.println("ExpectedAnimal: " + ExpectedAnimal.getName());
        System.out.println("ReturnAnimal: " + ReturnAnimal.getName());
  }
}