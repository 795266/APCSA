import java.util.Scanner;
/**
 * Write a description of class StudListRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentListRunner
{
    String firstName;
    String middletName;
    String lastName;
    int stuNumber;
    double gpa;

    public static void main () {
        StudentList studList = new StudentList();

        System.out.println(getGreeting());
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();

        while (!statement.equals("Terminate"))
        {
            System.out.println ("Do you want to:");
            System.out.println ("A) Add a student");
            System.out.println ("B) Delete a student");
            System.out.println ("C) Edit a student");
            System.out.println ("D) Clear all");
            System.out.println ("E) Print all");
            System.out.println ("F) Print a student");
            boolean understood = false;
            while (understood == false) {
                if (statement == "A") {
                    studList.addStudentToList();
                    understood = true;
                }
                else if (statement == "B") {
                    studList.deleteStudentFromList();
                    understood = true;
                }
                else if (statement == "C") {
                    studList.editStudentList();
                    understood = true;
                }
                else if (statement == "D") {
                    studList.clearList();
                    understood = true;
                }
                else if (statement == "E") {
                    studList.printAll();
                    understood = true;
                }
                else if (statement == "F") {
                    studList.printStudent();
                    understood = true;
                } 
                else {
                    System.out.println("Not understood");
                    understood = false;
                }
            }
            statement = in.nextLine();
        }
    }

    
}
