
/**
 * Write a description of class Scanner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scanner
{
    public static void main () {
       String str1 = "ee";
       String str2 = "This week is homecoming wEEk";
       int numOfStr = strOccurs(str1, str2);
       System.out.println(numOfStr);
    }
    
    public static int strOccurs(String s1, String s2) {
        String newS2 = s2.toLowerCase();
        int num = 0;
        for(int i = 0; i < newS2.length(); i = i + 1) {
            if ((newS2.substring(i, i + s1.length())).equals(s1) == true) {
                num = num + 1;
                i = i + s1.length() - 1;
            }
        }
        return num;
    }
}
