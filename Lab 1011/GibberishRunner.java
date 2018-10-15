
/**
 * Write a description of class GibberishRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GibberishRunner
{
    public static void main(){
        WordList5000 wordList5000 = new WordList5000(); //defines wordList5000 object
        Gibberish gibberish = new Gibberish(); //gets crazy string and defines it to gibberish
        String x = gibberish.makeGibberish(wordList5000); //runs the method makeGibberish
        System.out.println(x); //prints the good string
    }
}
