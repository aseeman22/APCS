import java.util.*;

public class PersonTest
{
    public static void main(String[] args)
    {
        Person Annie = new Person("Annie", (double)4.0);
        Person fnsey = new Person("fnsey", (double)3.0);
        Person nndifn = new Person("nndifn", (double)2.0);
        
        ArrayList<Person> people = new ArrayList<Person>();
            people.add(Annie);
            people.add(fnsey);
            people.add(nndifn);
        
        
        double ExpectedAverageValue = 3;
        double ActualAverageValue = PersonStats.AverageNumberOfPets(people);
        
        if(ExpectedAverageValue == ActualAverageValue)
        {
            System.out.println("YAYYYY!");
        }
        else
        {
            System.out.println("NOOO!");
        }
        
        Person diofj = new Person("diofj", (double)4.0);
        Person vnds = new Person("vnds", (double)3.0);
        Person fjned = new Person("fjned", (double)2.0);
        
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
        
        
        
        
    }
    

}
