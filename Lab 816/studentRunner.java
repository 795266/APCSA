
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
        s2.setStudNumber(123456);
        System.out.println(s1.getStudNumber());
        System.out.println(s2.getStudNumber());
    }
}
