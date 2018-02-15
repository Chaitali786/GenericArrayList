import java.util.*;
import java.util.Comparator;
public class Student
{
      String studName;
      int studRollNo;
      int studAge;

     public Student(String name,int rollNo , int age)
     {
       this.studName = name;
       this.studRollNo = rollNo;
       this.studAge = age;
     }

     /*Comparator for sorting the list by Student Name*/
    public static Comparator<Student> StuNameComparator = new Comparator<Student>()
    {

	     public int compare(Student s1, Student s2)
       {
         String StudentName1 = s1.studName.toUpperCase();
         String StudentName2 = s2.studName.toUpperCase();

         //ascending order
        // return StudentName1.compareTo(StudentName2);

         //descending order
         return StudentName2.compareTo(StudentName1);
       }
  };





}
