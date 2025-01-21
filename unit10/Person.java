public class Person
{
    private String name;
    private int NumberOfPets;
    public Person(String nameInput, int NumberOfPetsInput)
    {
        name = nameInput;
        NumberOfPets = NumberOfPetsInput;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getNumberOfPets()
    {
        return NumberOfPets;
    }
}