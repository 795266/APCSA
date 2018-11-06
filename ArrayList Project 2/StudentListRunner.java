import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class StudListRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentListRunner
{
    public static void main () {
        StudentList studList = new StudentList();

        System.out.println(getGreeting());
        Scanner in = new Scanner(System.in);
        String statement = getInput();

        while (!statement.equals("Terminate"))
        {
            boolean understood = false;
            //           while (understood == false) {
            if (statement.equals("A")) {
                String middleName;
                String lastName;
                String name = "";
                System.out.println("a " + name);
                System.out.println("What is the name of the student");
                statement = in.nextLine();
                System.out.println("b " + name);       
                if (statement.indexOf(",") == -1) {
                    name = statement;
                } else {
                    name = statement.substring(statement.indexOf(",") + 2) + " " + statement.substring(0, statement.indexOf(","));
                }
                System.out.println("c " + name);
                String firstName = name.substring(0, name.indexOf(" "));
                if ((name.substring(name.indexOf(" ") + 1)).indexOf(" ") != -1) {
                    middleName = name.substring(name.indexOf(firstName) + firstName.length() + 1, name.substring(name.indexOf(firstName) + 1).indexOf(" "));
                    lastName = name.substring(name.indexOf(middleName) + middleName.length() + 1);
                } else {
                    middleName = "";
                    lastName = name.substring(name.indexOf(firstName) + firstName.length() + 1);
                }
                System.out.println("d " + name);

                System.out.println("What is the id number of the student");
                int stuNumber = in.nextInt();
                statement = in.nextLine();
                System.out.println("What is the gpa of the student");
                double gpa = in.nextDouble();
                statement = in.nextLine();
                
                Student stu = new Student(firstName, middleName, lastName, stuNumber, gpa);
                studList.addStudentToList(stu);
                understood = true;
            } else if (statement.equals("B")) {
                //studList.deleteStudentFromList();
                understood = true;
            } else if (statement.equals("C")) {
                //studList.editStudentList();
                understood = true;
            } else if (statement.equals("D")) {
                //studList.clearList();
                understood = true;
            } else if (statement.equals("E")) {
                System.out.println("got into");
                studList.printAll();
                understood = true;
            } else if (statement.equals("F")) {
                //studList.printStudent();
                understood = true;
            } else {
                System.out.println("Not understood, please re-input");
                statement = getInput();
                understood = false;
            }
            //  }
            statement = getInput();
        }
    }

    public static String getGreeting()
    {
        // put your code here
        return "You have entered the teach portal. Press any key to continue";
    }

    public static String getInput() {
        System.out.println ("Do you want to:");
        System.out.println ("A) Add a student");
        System.out.println ("B) Delete a student");
        System.out.println ("C) Edit a student");
        System.out.println ("D) Clear all");
        System.out.println ("E) Print all");
        System.out.println ("F) Print a student");
        Scanner in = new Scanner(System.in);
        String statement = in.nextLine();
        return statement;
        /**
        if(statement.indexOf("1") != -1 || statement.indexOf("2") != -1 || statement.indexOf("3") != -1 || statement.indexOf("4") != -1 || statement.indexOf("5") != -1 
        || statement.indexOf("6") != -1 || statement.indexOf("7") != -1 ||statement.indexOf("8") != -1 ||statement.indexOf("9") != -1 || statement.indexOf("0") != -1 ) {
        if (statement.indexOf(".") != -1) {
        double given = in.nextDouble();
        return given;
        } else {
        int given = in.nextLine(); //use other methods for int and double
        return given;
        }
        } else {
        String given = in.nextLine();
        return given;
        }
         */

    }
}
