
/**
 * Write a description of class Student here. //Getters in this class
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
    double GPA;
    /**
     * Constructor for objects of class Student
     */
    public Student(String first, String middle, String last, int number, double gpa)
    {
        firstName = first;
        middleName = middle;
        lastName = last;
        stuNumber = number;
        GPA = gpa;
    }
    
    public String getName() {
        return firstName + " " + middleName + " " + lastName;
    }
    
    public int getStuNumber() {
        return stuNumber;
    }
    
    public double getGPA() {
        return GPA;
    }
}
