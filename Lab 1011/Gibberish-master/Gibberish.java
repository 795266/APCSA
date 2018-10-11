
/**
 * Write a description of class Gibberish here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gibberish
{
    // instance variables - replace the example below with your own
    private String sourceString;
    /**
     * Constructor for objects of class Gibberish
     */
    public Gibberish()
    {
        Template template = new Template();
        sourceString = template.getSourceString();
    }
    
    public String makeGibberish(WordList5000 wordList5000){
        String resultString = "";
        int currentSourceIndex = 0;
        while(currentSourceIndex < sourceString.length()) {
            int nextRight = sourceString.indexOf("<");
            if (nextRight == -1) {
                resultString = resultString + sourceString.substring(0, nextRight);
                currentSourceIndex = sourceString.length();
            } else {
                int nextLeft = sourceString.indexOf(">");
            }
        }
    }
}
