
/**
 * Write a description of class studentRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class studentRunner
{
       public static void main(){
        Student s1 = new Student();
        Student s2 = new Student();
        
        s1.setStudNumber(795266);
        s1.setStudActive(true);
        s1.setStudGPA(4.0);
        s1.setStudName("Nathan Bowman");
        
        System.out.println(s1.getStudNumber());
        System.out.println(s1.getStudActive());
        System.out.println(s1.getStudGPA());
        System.out.println(s1.getStudName());
        System.out.println("");
    }
}
