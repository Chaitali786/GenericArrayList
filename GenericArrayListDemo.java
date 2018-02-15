import java.util.*;
import java.util.Comparator;
public class GenericArrayListDemo
{

    ArrayList<Student> studentList = new ArrayList<Student>();//creating arraylist
    public static void main(String[] args) {
      GenericArrayListDemo arraylistdemo = new GenericArrayListDemo();

      Student student1 = new Student ("zzz" , 11 , 31);
      Student student2 = new Student ("aaa" , 12 , 30);
      Student student3 = new Student ("ccc" , 13, 29);
      arraylistdemo.addElements(student1,student2,student3);
      arraylistdemo.addElementsAtIndex();
      arraylistdemo.removeElements();
      arraylistdemo.sortArraylist();
      //arraylistdemo.showElements();
    }//End of main function

    public void addElements(Student student1, Student student2 , Student student3)
    {
       //Creating user-defined class objects


      studentList.add(student1);
      studentList.add(student2);
      studentList.add(student3);

      showElements();


    }  //End of while


      public void addElementsAtIndex()
      {
        Student student4 = new Student ("dddd" , 16 , 38);
        studentList.add(2,student4);
        System.out.println("Insert item into specific index!!!!!");
        showElements();
      }

      public void showElements()
      {
        Iterator itr=studentList.iterator();
        //traversing elements of ArrayList object
        //hasNext() is boolean method ... Run while loop till hasNext() is true.
        while(itr.hasNext()){
        Student st=(Student)itr.next();
        System.out.println(st.studRollNo+" "+st.studName+" "+st.studAge);
         }
      }
      public void removeElements()
      {
        studentList.remove(2);
        System.out.println("Elemets Remove Succesfully!!!!!");
        showElements();
      }

      public void sortArraylist()
      {
         //System.out.println(counter);
         /*Sorting based on Student Name*/
 	       System.out.println("Student Name Sorting:");
 	       Collections.sort(studentList, Student.StuNameComparator);
         showElements();

      } // End of sort array

}//End of Class





















//-----------------
