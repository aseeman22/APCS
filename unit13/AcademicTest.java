import java.util.*;

public class AcademicTest
{
     public static void main(String[] args)
  {
    //addNewStudent test
         Student person1 = new Student("Annie", 7);
         ArrayList<Student> people = new ArrayList<Student>();
         
         Teacher teacher3 = new Teacher("teacher", "math");
         Academic academic4 = new Academic(teacher3, people);
         
         
         System.out.print("expected: \n" + person1.getName()+ "\n" + person1.getFavoriteNumber());
         System.out.print("\nresult:\n");
         academic4.addNewStudent(person1);
         academic4.getStudents();
         
         
    //class info test
         Teacher person = new Teacher("teacher", "Math");
         Student person2 = new Student("student", 20);
         
         ArrayList<Student> students10 = new ArrayList<Student>();
            students10.add(person2);
         
         Academic academic2 = new Academic(person, students10);
         
         System.out.println("\n\nexpected:\n" + person.getName() + "\n" + person2.getName());
         System.out.print("result:\n");
         academic2.classInfo();
         System.out.print("\n");
         
    //favorite number n test
         Teacher teacher = new Teacher("Annie", "Math");
         ArrayList<Student> students = new ArrayList<Student>();
         Student student = new Student("student", 1);
         Student student1 = new Student("student1", 2);
         Student student2 = new Student("student2", 3);
         
        students.add(student);
        students.add(student1);
        students.add(student2);
         
         Academic academic = new Academic(teacher, students);
           ArrayList<Student> favoriteNumberN = new ArrayList<Student>();
            favoriteNumberN.add(student);
        
         System.out.print("\nexpected: \n" + favoriteNumberN ); 
      
         
         ArrayList<Student> result =  academic.favoriteNumber(1);
         System.out.print("\nresult: \n" + result);
         
      
         
    //favoriteNumberOdd test
         Teacher teacher2 = new Teacher("teacher", "math");
         ArrayList<Student> students1 = new ArrayList<Student>();
         Student student3 = new Student("student3", 16);
         Student student4 = new Student("student4", 3);
         Student student5 = new Student("student5", 5);
         
         students1.add(student3);
         students1.add(student4);
         students1.add(student5);
         
         
         Academic academic3 = new Academic(teacher2, students1);
         
         
         ArrayList<Student> oddNumber = new ArrayList<Student>();
         
         oddNumber.add(student4);
         oddNumber.add(student5);
         
         System.out.print("\n\nexpected: \n" + oddNumber);
         System.out.print("\nresult: \n" + academic3.FavoriteNumberOdd());
         System.out.print("\n");
         
         
         
         
  }
}