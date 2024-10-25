



public class Person{
   private String name;
   private int pets;
   public Person(String nameInput, int petsInput)
   {
       name = nameInput; 
       pets = petsInput;
   }
    
    public String getName()
    {
       return name;
    }
    
    public int getPets()
    {
        return pets;
    }
    
    public String greeting() 
    {
        return "Hello, my name is " + name + " and I have " + pets + " pets.";
    }
}
 

