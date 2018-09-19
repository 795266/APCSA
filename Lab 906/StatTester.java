
/**
 * StatTester finds loads an Array of int
 * and finds the sum, mean, median, and mode.
 * 
 * @author Nathan Bowman
 * @version 9/6/2018
 */

// imports go here
import java.util.Arrays;
public class StatTester{
    //  Instance variables
    int[] nums;
    
    // Constructor
    public StatTester(){
        nums = new int[100];
    }
    
    
    //  Methods
    public void loadArray(){
        for (int i = 0; i < 100; i = i + 1) {
            nums[i] = Math.random()*10 +1;
        }
    }
}
