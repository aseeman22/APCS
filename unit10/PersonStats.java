import java.util.*;

public class PersonStats
{
    
    
    public static float AverageNumberOfPets(ArrayList<Person> people)
    {
        float value = 0;
       // value += currentPerson.getNumberOfPets();
        for (Person currentPerson:people)
        {
            value += currentPerson.getNumberOfPets();
            
        }
        value = value/people.size();
        return value;
    }
    public static String PersonWithMostPets(ArrayList<Person> people)
    {
        String name = " "; //store the name of person with greatest number of pets
        int GreatestPets = 0; // store greatest number of pets seen so far
        for(Person currentPerson: people)
        {
            if(currentPerson.getNumberOfPets()>GreatestPets)
            {
               GreatestPets = currentPerson.getNumberOfPets(); //update what the greatest amoount of pets is
                name = currentPerson.getName(); // updating the name of person with greatest number of pets
            }
        }
        return name;
    }
    public static ArrayList<Person> MoreThan2Pets(ArrayList<Person> InputPeople)
    {
        ArrayList<Person> AtLeast2Pets = new ArrayList<Person>();
        for(Person currentPerson : InputPeople)
        {
            if(currentPerson.getNumberOfPets()>1)
            {
                AtLeast2Pets.add(currentPerson);
            }
        }
        return AtLeast2Pets;
        
        
    }
}