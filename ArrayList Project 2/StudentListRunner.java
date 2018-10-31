import java.util.Scanner;
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
        String statement = in.nextLine();
        double statementd = in.nextLine();
        int statementi = in.nextLine();

        while (!statement.equals("Terminate"))
        {
            String input = StudentListRunner.getInput();
            boolean understood = false;
            while (understood == false) {
                if (statement.equals("A")) {
                    String name = "";
                    System.out.println("What is the name of the student");
                    statement = in.nextLine();
                    if (statement.indexOf(",") == -1) {
                        name = statement;
                    } else {
                        name = statement.substring(statement.indexOf(",") + 2) + " " + statement.substring(0, statement.indexOf(" "));
                    }
                    String firstName = name.substring(0, name.indexOf(" "));
                    if ((name.substring(name.indexOf(" ") + 1)).indexOf(" ") != -1) {
                        String middleName = name.substring(name.indexOf(firstName) + firstName.length() + 1, name.substring(name.indexOf(firstName) + 1).indexOf(" "));
                        String lastName = name.substring(name.indexOf(middleName) + middleName.length() + 1);
                    } else {
                        String middleName = "";
                        String lastName = name.substring(name.indexOf(firstName) + firstName.length() + 1);
                    }
                    
                    System.out.println("What is the name of the student");
                    statement = in.nextLine();
                    int stuNumber = statementi;
                    
                    System.out.println("What is the gpa of the student");
                    statement = in.nextLine();
                    double gpa = statementd;
                    
                    studList.addStudentToList(studList, firstName, middleName, lastName, stuNumber, gpa);
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
                    studList.printAll(studList);
                    understood = true;
                } else if (statement.equals("F")) {
                    //studList.printStudent();
                    understood = true;
                } else {
                    System.out.println("Not understood, please re-input");

                    understood = true;
                }
            }
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
        if(statement.indexOf("1") != -1 || statement.indexOf("2") != -1 || statement.indexOf("3") != -1 || statement.indexOf("4") != -1 || statement.indexOf("5") != -1 
        || statement.indexOf("6") != -1 || statement.indexOf("7") != -1 ||statement.indexOf("8") != -1 ||statement.indexOf("9") != -1 || statement.indexOf("0") != -1 ) {
            if (statement.indexOf(".") != -1) {
                double given = in.nextLine();
            } else {
                int given = in.nextLine();
            }
        } else {
            String given = in.nextLine();
        }
        return given;
    }
}
