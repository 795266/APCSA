
/**
 * Write a description of class BallRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BallRunner
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;

    /**
     * Constructor for objects of class BallRunner
     */
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main()
    {
        BallWorld ballWorld = new BallWorld(200, 200);
        TGPoint startpoint = new TGPoint(0,0);
        BallBot ballBot = new BallBot(ballWorld, startpoint, 180, 20);
        int i = 0;
        while(i < 1) {
            if(ballBot.canMoveForward(ballWorld) == true){
                ballBot.moveForward();
            } else{
            ballBot.setHeading((ballBot.getHeading() + 90) % 360);
        }
        }
    }
}
