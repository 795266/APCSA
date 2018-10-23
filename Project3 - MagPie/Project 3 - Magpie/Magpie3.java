
/**
 * Write a description of class Magpie3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Magpie3
{
    // instance variables - replace the example below with your own
    private int findKeyword(String statement, String goal, int startPos)
    {
        String phrase = statement.trim().toLowerCase();
        goal = goal.toLowerCase();
        int psn = phrase.indexOf(goal, startPos);
        while (psn >= 0)
        {
            String before = " ", after = " ";
            if (psn > 0)
            {
                before = phrase.substring(psn - 1, psn);
            }
            if (psn + goal.length() < phrase.length())
            {
                after = phrase.substring(psn + goal.length(),psn + goal.length() + 1);
            }
            /* determine the values of psn, before, and after at this point in the method. */
            if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))
            &&
            ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))
            {
                return psn;
            }
            psn = phrase.indexOf(goal, psn + 1);
        }
        return -1;
    }
}
