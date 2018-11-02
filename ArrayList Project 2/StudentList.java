
/**
 * Write a description of class StudList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentList
{
    public StudentList(StudentList x, String first, String middle, String last, int number, double gpa)
    {
        // initialise instance variables
        x = 0;
    }

    public void addStudentToList(StudentList[] x, Student y){
         x.add(y);
    }
    
    public String printAll(StudentList x) {
        System.out.println(x);
        return "asrfg";
    }
}
