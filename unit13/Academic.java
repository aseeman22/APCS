import java.util.*;

public class Academic
{
    private Teacher teacher;
    private ArrayList<Student> students = new ArrayList<Student>();
    
    public Academic(Teacher teacher, ArrayList<Student> students)
    {
        this.teacher = teacher;
        this.students = students;
    }
     
    public void addNewStudent(Student person)
    {
        students.add(person);
    }
    
    public void classInfo()
    {
        for(Student student: students)
        {
            System.out.println(student.getName());
        }
        System.out.println(teacher.getName());
    }
    
    public ArrayList<Student> favoriteNumber(int n)
    {
       ArrayList<Student> favoriteNumberN = new ArrayList<Student>(); 
        
        for(Student student: students)
        {
            if(student.getFavoriteNumber() == n)
            {
                student.getName();
                favoriteNumberN.add(student);
            }
        }
        
        return favoriteNumberN;
    }
    
    public ArrayList<Student> favoriteNumberOdd(Student person)
}