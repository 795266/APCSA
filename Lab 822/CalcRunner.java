
/**
 * Write a description of class CalcRunner here.
 *
 * @Nathan Bowman
 * @Lab 822: SimpleCalc
 */
public class CalcRunner
{
    public static void main (){
        SimpleCalc sc = new SimpleCalc();
        System.out.println(sc.add(3 , 4));
        System.out.println(sc.subtract(3 , 4));
        System.out.println(sc.multiply(3 , 4));
        System.out.println(sc.divide(3 , 4));
        System.out.println(sc.mod(3 , 4));
    }
}
