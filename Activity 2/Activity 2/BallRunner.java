
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
    public static void main() {
        BallWorld ballWorld = new BallWorld(400, 100);
        TGPoint entrancepoint = new TGPoint(0,0);
        BallBot[] ballBotArray = new BallBot[10];
        BallRunner ballRunner = new BallRunner();
        
        ballRunner.findFreeBallBotIndex(ballBotArray);
    }

    /**
    public static void activity1(){
        BallWorld ballWorld = new BallWorld(400, 100);
        TGPoint startpoint = new TGPoint(0,0);
        BallBot ballBot = new BallBot(ballWorld, startpoint, 180, 20);
        int i = 0;
        while(i < 1) {
                if(ballBot.canMoveForward(ballWorld) == true){
                    ballBot.moveForward();
                } else{
                    ballBot.setHeading((ballBot.getHeading() + Math.random() * 1000) % 360);
                }
            }
    }
     */
    
    public int findFreeBallBotIndex(BallBot[] x) {
        int ret = x.length;
        for(int i = 0; i < x.length; i = i = 1) {
            if(x[i] == null) {
                ret = i;
            }
        }
        return ret;
    }
}
