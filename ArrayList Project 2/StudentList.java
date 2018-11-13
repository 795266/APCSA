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
            System.out.println("Name: " + (arrayList.get(i)).getName());
            System.out.println("Student Number: " + (arrayList.get(i)).getStuNumber());
            System.out.println("GPA: " + (arrayList.get(i)).getGPA());
            System.out.println("");
        }
    }
    
    public void deleteStudent(String f) {
        for(int i = 0; i < arrayList.size(); i = i + 1) {
            if(arrayList.get(i).substring(0, arrayList.get(i).getName().indexOf(" ")) == f) { //FINISH
                arrayList.remove(arrayList.get(i));
            }
        }
    }
}
