public class Gibberish
{
    String sourceString = ""; //creates empty string to add the new parts of string to
    public Gibberish()
    {
        Template template = new Template(); //creates the crazy string
        sourceString = template.getSourceString();
    }
    
    public String makeGibberish(WordList5000 wordList5000){
        String resultString = "";
        int currentSourceIndex = 0;
        while(currentSourceIndex < sourceString.length()) {

            if ((sourceString.substring(currentSourceIndex)).indexOf("<") == -1) {
                resultString = resultString + sourceString.substring(currentSourceIndex);
                currentSourceIndex = sourceString.length();
            } else {
                int nextRight = sourceString.indexOf("<", currentSourceIndex) + 1;
                int nextLeft = sourceString.indexOf(">", currentSourceIndex);
                String placeHolderString = sourceString.substring(nextRight, nextLeft);
                String replacementString = wordList5000.getRandomWordString(placeHolderString);
                if (replacementString != null) {
                    resultString = resultString + sourceString.substring(currentSourceIndex, nextRight - 2) + " " + replacementString;
                }
                currentSourceIndex = sourceString.indexOf("</>", currentSourceIndex) + 3;
            }
        }
        return resultString;
    }
}
