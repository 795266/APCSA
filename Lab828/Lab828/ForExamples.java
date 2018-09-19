
/**
 * Write a description of class ForExamples here.
 *
 * @author (Nathan Bowman)
 * @version (a version number or a date)
 */

import static java.lang.System.*;
public class ForExamples
{
    public static void main(String args[])
    {
               //Start    Stop      Increment
               for(int  run=1;   run<=5;   run=run+1)
        {
           String stars = "*";
           for(int run2 = 1; run2 <= 2; run = run +1){
               if (stars.length() < run){
               stars = stars + "*";
            }
        }
           out.println(stars);
   }
}
}