import java.util.*;

public class AcademicTest
{
     public static void main(String[] args)
  {
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
         
        ArrayList<Student> result =  academic.favoriteNumber(1);
         System.out.print("result: " + result);
         
         ArrayList<Student> favoriteNumberN = new ArrayList<Student>();
            favoriteNumberN.add(student);
        
         System.out.print("expected: " + favoriteNumberN );
         
         
         
  }
}