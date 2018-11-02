import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class StudList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentList
{
    ArrayList<Student> arrayList;
    public StudentList()
    {
        arrayList = new ArrayList<Student> ();
    }

    public void addStudentToList(Student y){
         arrayList.add(y);
    }
    
    public void printAll() {
        for(int i = 0; i < arrayList.size(); i = i + 1) {
            System.out.print(arrayList.get(i));
        }
    }
}
