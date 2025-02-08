import java.util.*;

public class PersonTest
{
    public static void main(String[] args)
    {
        //testing PeopleStats.AverageNumberOfPets
        Person Annie = new Person("Annie", (int)4.0);
        Person fnsey = new Person("fnsey", (int)3.0);
        Person nndifn = new Person("nndifn", (int)2.0);
        PersonStats calculator = new PersonStats();
        
        ArrayList<Person> people = new ArrayList<Person>();
            people.add(Annie);
            people.add(fnsey);
            people.add(nndifn);
        
        
        double ExpectedAverageValue = 3.0;
        double ActualAverageValue = calculator.AverageNumberOfPets(people);
        
        if(ExpectedAverageValue == ActualAverageValue)
        {
            System.out.println("YAYYYY!");
        }
        else
        {
            System.out.println("NOOO!");
        }
        
        //Testing PeopleStats.PersonWithMostPets
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
        
        //testing PeopleStats.MoreThan2Pets
        System.out.println("testing More than 2 pets");
        Person dfiea = new Person("dfiea", (int)4);
        Person fneih = new Person("fneih", (int)2);
        Person njejij = new Person("njejij", (int)1);
        
        ArrayList<Person> People = new ArrayList<Person>();
            People.add(dfiea);
            People.add(fneih);
            People.add(njejij);
        
         ArrayList<Person> ExpectedArrayList = new ArrayList<Person>();
            ExpectedArrayList.add(dfiea);
            ExpectedArrayList.add(fneih);
        
        ArrayList<Person> FinalArrayList = PersonStats.MoreThan2Pets(People);
        
        for(Person randomPerson: FinalArrayList)
        {
           boolean HasBeenFound= false;
            for(Person MaybeSamePerson: ExpectedArrayList)
            {
                if(randomPerson.getNumberOfPets() == MaybeSamePerson.getNumberOfPets())
                {
                    if(randomPerson.getName()== MaybeSamePerson.getName())
                    {
                        HasBeenFound = true;
                    }
                }
            }
            if(HasBeenFound == false)
            {
                System.out.println("Noooo");
            }
            else
            {
                System.out.println("Yayy!");
            }
        }
          
        
        
    }
    

}
