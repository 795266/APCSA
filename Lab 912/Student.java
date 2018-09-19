
/**
 * Write a description of class Student here.
 *
 * @author NathanBowman
 * @version 816
 */
public class Student extends studentRunner{
    /**
     * Instance variables of class Student
     */
    private double studNumber;
    private String studName;

    /**
     * Constructor for objects of class Student
     */
    public Student(double num, String name){
        // initialise instance variables
        studNumber = num;
        studName = name;
    }

    /**
     * Student Methods
     */
    public void setStudNumber(int sn)    {
        studNumber = sn;
    }
    public void setStudName(String sn2)    {
        studName = sn2;
    }

    public double getStudNumber()    {
        return studNumber;
    }
    
    public String getStudName()    {
        return studName;
    }
}
