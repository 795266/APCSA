
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    String firstName;
    String middleName;
    String lastName;
    int stuNumber;
    double gpa;

    /**
     * Constructor for objects of class Student
     */
    public Student(String first, String middle, String last, int number, double gpa)
    {
        Student stu = new Student(first, middle, last, number, gpa);
    }
}