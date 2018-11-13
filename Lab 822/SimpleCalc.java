
/**
 * Write a description of class SimpleCalc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SimpleCalc{

    /**
     * Constructor for objects of class SimpleCalc
     */
    public SimpleCalc()
    {

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double add(int x, int y)
    {
        // put your code here
        return x + y;
    }

    public double subtract(int x, int y)
    {
        // put your code here
        return x - y;
    }

    public double multiply(int x, int y)
    {
        // put your code here
        return x * y;
    }

    public double divide(int x, int y){
        // put your code here
        if (y > 0) {
            return x / y;
        }
        return 0;
    }
    public double mod(int x, int y){
        // put your code here
        return x % y;
    }
}