
/**
 * Write a description of class BallRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BallRunner
{
    public static void main() {
        BallWorld ballWorld = new BallWorld(200, 200);
        TGPoint entrancePoint = new TGPoint(0,0);
        BallBot[] ballBotArray = new BallBot[10];
        BallRunner ballRunner = new BallRunner();
        boolean i = true;
        while(i == true) {
            if(ballRunner.entranceClear(ballBotArray, entrancePoint) == true) {
                int freeBallBotIndex;
                freeBallBotIndex = ballRunner.findFreeBallBotIndex(ballBotArray);
                if (freeBallBotIndex < ballBotArray.length) {
                    BallBot ballBot = new BallBot(ballWorld, entrancePoint, (int)(Math.random() * 360), 20);
                    ballBotArray[freeBallBotIndex] = ballBot;
                }
            }
            for(int index = 0; index < ballBotArray.length; index++) {
                if (ballBotArray[index] != null) {
                    if(ballBotArray[index].canMoveForward(ballWorld) == true){
                        ballBotArray[index].moveForward();
                    } else {
                        ballBotArray[index].setHeading((Math.random() * 360));
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

    public int findFreeBallBotIndex(BallBot[] array) {
        for(int i = 0; i < array.length; i = i + 1) {
            if(array[i] == null) {
                return i;
            }
        }
        return x.length;
    }
    
    public double distanceBetweenPoints(TGPoint point1, TGPoint point2) {
        return Math.sqrt((point1.x - point2.x)*(point1.x - point2.x) + (point1.y - point2.y)*(point1.y - point2.y));
    }
    
    public boolean entranceClear(BallBot[] array, TGPoint coord) {
        boolean ableToForm = true;
        for(int index = 0; index < array.length; index++) {
                if (array[index] != null) {
                    TGPoint entrancePoint = new TGPoint(0,0);
                    if(distanceBetweenPoints(array[index].getPoint(), coord) < array[index].getRadius() * 2){
                        ableToForm = false;
                    }
                }
            }
        return ableToForm;
    }
    ///** 
    public BallBot ballBotToBounceOff(BallBot ballBot, BallBot[] array) {
        TGPoint firstPoint = ballBot.getPoint();
        TGPoint nextPoint = ballBot.forwardPoint();
        for(int i = 0; i < array.length; i = i + 1) {
            BallBot otherBallBot = array[i];
            if (otherBallBot != null && otherBallBot != ballbot) {
                int currentDistance = distanceBetweenPoints(firstpoint, array[i].getPoint);
                if(currentDistance <= (ballBot.getRadius() + otherBallBot.getRadius())) {            
                    boolean c1 = true;
                }
                int nextDistance = distanceBetweenPoints(nextpoint, array[i].getpoint);
                if(nextDistance <= (ballBot.getRadius() + otherBallBot.getRadius())) {            
                    boolean c2 = true;
                }
            }
            if (c1 == true && c2 = true) { //FINISH THIS
                
            }
        }
    }
    // */
    
}
