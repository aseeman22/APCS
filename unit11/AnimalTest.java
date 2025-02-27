public class AnimalTest
{
        Human AnniesHuman = new Human("Human");
        Cat AnniesCat = new Cat("Cat");
        Sponge AnniesSponge = new Sponge("Sponge");
        Centipede AnniesCentipede = new Centipede ("Centipede");
    
     ArrayList<Animal> Animals = new ArrayList<Animal>();
            Animal.add(AnniesHuman);
            Animal.add(AnniesCat);
            Animal.add(AnniesSponge);
            Animal.add(AnniesCentipede);
   
    for(Animal RandomAnimal : Animals)
        {
            System.out.println(RandomAnimal.name());
            System.out.println(RandomAnimal.legCount());
            
        }
            
}