
/**
 * Write a description of class BallRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BallRunner
{
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
        BallWorld ballWorld = new BallWorld(200, 200);
        TGPoint entrancePoint = new TGPoint(0,0);
        BallBot[] ballBotArray = new BallBot[10];
        BallRunner ballRunner = new BallRunner();
        int i = 0;
        while(i < 1) {
            int freeBallBotIndex;
            freeBallBotIndex = ballRunner.findFreeBallBotIndex(ballBotArray);
            if (freeBallBotIndex < ballBotArray.length) {
                BallBot ballBot = new BallBot(ballWorld, entrancePoint, (int)(Math.random() * 360), 20);
                ballBotArray[freeBallBotIndex] = ballBot;
            }
            for(int index = 0; index < ballBotArray.length; index++) {
                if (ballBotArray[index] != null) {
                    if(ballBotArray[index].canMoveForward(ballWorld) == true){
                        ballBotArray[index].moveForward();
                    } else {
                        ballBotArray[index].setHeading((ballBotArray[index].getHeading() + Math.random() * 1000) % 360);
                    }
                }
            }
        }
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
    public static void run(BallBot[] x) {

    }

    public int findFreeBallBotIndex(BallBot[] x) {
        for(int i = 0; i < x.length; i = i = 1) {
            if(x[i] == null) {
                return i;
            }
        }
        return x.length;
    }
}
