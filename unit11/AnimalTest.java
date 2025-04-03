import java.util.*;

public class AnimalTest
{
       public static void main(String[] args)
       {
       
        Human AnniesHuman = new Human("Human", 2, false);
        Cat AnniesCat = new Cat("Cat", 4, true);
        Sponge AnniesSponge = new Sponge("Sponge", 0, false);
        Centipede AnniesCentipede = new Centipede ("Centipede", 100, true);
    
     ArrayList<Animal> Animals = new ArrayList<Animal>();
            Animals.add(AnniesHuman);
            Animals.add(AnniesCat);
            Animals.add(AnniesSponge);
            Animals.add(AnniesCentipede);
   
    for(Animal RandomAnimal : Animals)
        {
            System.out.println(RandomAnimal.getName());
            System.out.println(RandomAnimal.getLegCount());
            System.out.println(RandomAnimal.getFurriness());
            
        }
       }
}