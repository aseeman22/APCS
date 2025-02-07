import java.util.*;

public class PersonTest
{
    public static void main(String[] args)
    {
        Person Annie = new Person("Annie", (int)4.0);
        Person fnsey = new Person("fnsey", (int)3.0);
        Person nndifn = new Person("nndifn", (int)2.0);
        PersonStats calculator = new PersonStats();
        
        ArrayList<Person> people = new ArrayList<Person>();
            people.add(Annie);
            people.add(fnsey);
            people.add(nndifn);
        
        
        double ExpectedAverageValue = 3;
        double ActualAverageValue = calculator.AverageNumberOfPets(people);
        
        if(ExpectedAverageValue == ActualAverageValue)
        {
            System.out.println("YAYYYY!");
        }
        else
        {
            System.out.println("NOOO!");
        }
        
        Person diofj = new Person("diofj", (int)4);
        Person vnds = new Person("vnds", (int)3);
        Person fjned = new Person("fjned", (int)2);
        
         ArrayList<Person> people2 = new ArrayList<Person>();
            people2.add(diofj);
            people2.add(vnds);
            people2.add(fjned);
        
        String ExpectedPersonWithMostPets = "diofj";
        String ActualPersonWithMostPets = PersonStats.PersonWithMostPets(people2);
        
        if(ExpectedPersonWithMostPets == ActualPersonWithMostPets)
        {
            System.out.println("Yayy!");
        }
        else
        {
            System.out.println("Noooo");
        }
        
        Person dfiea = new person("dfiea", (int)4);
        Person fneih = new person("fneih", (int)2);
        Person njejij = new person("njejij", (int)1);
        
        ArrayList<String> People = new ArrayList<String>();
            //People.add("Annie", 4);
            //People.add("fneih", 2);
           // People.add("njejij", 1);
        
        for(Person name: People)
        {
            if(name.getNumberOfPets()>1)
            {
                return People2.add(name); 
            }
        }
        
        
        
    }
    

}
