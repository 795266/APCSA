/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        if (findKeyword(statement, "no", 0) >= 0) {
            response = "Why so negative?";
        } else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your family.";
        } else if (findKeyword(statement, "dog", 0) >= 0 || findKeyword(statement, "cat", 0) >= 0) {
            response = "Tell me more about your pets.";
        } else if (findKeyword(statement, "pizza", 0) >= 0 || findKeyword(statement, "burger", 0) >= 0) {
            response = "I'm hungry.";
        } else if (findKeyword(statement, "truck", 0) >= 0 || findKeyword(statement, "car", 0) >= 0) {
            response = "I drive a monster truck.";
        } else if (findKeyword(statement, "I want", 0) >= 0) {
            response = "Would you be really happy if you had " + statement.substring(statement.indexOf("I want") + 7, statement.length()) + "?";
        } else if (findKeyword(statement, "I", 0) >= 0 && findKeyword(statement, "you", 0) >= 0) {
            response = "Why do you " + statement.substring(statement.indexOf("I") + 2, statement.indexOf("you")) + "me?";
        } else if ((statement.trim()).length() < 1) {
            response = "Please say something.";
        } else if (findKeyword(statement, "Mr.", 0) >= 0) {
            response = "He sounds like a good teacher";
        } else {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if (whichResponse == 4)
        {
            response = "That's crazy.";
        }
        else if (whichResponse == 5)
        {
            response = "I feel sick.";
        }

        return response;
    }
    
    private int findKeyword(String statement, String goal, int startPos){
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
