
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
    private int studNumber;
    private boolean studActive;
    private double studGPA;
    private String studName;

    /**
     * Constructor for objects of class Student
     */
    public Student(){
        // initialise instance variables
        studNumber = 0;
        studActive = true;
        studName = "";
        studGPA = 0.0;
    }

    /**
     * Student Methods
     */
    public void setStudNumber(int sn)    {
        studNumber = sn;
    }
    public void setStudActive(boolean tf) {
        studActive = tf;
    }
    public void setStudName(String nb) {
        studName = nb;
    }
    public void setStudGPA(double xx) {
        studGPA = xx;
    }
    public int getStudNumber()    {
        return studNumber;
    }
    public boolean getStudActive()    {
        return studActive;
    }
    public String getStudName()    {
        return studName;
    }
    public double getStudGPA()    {
        return studGPA;
    }
}
