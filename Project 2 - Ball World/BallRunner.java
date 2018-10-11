
/**
 * Write a description of class BallRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BallRunner
{
    public static void main() {
        BallWorld ballWorld = new BallWorld(200, 200); //Creates window
        TGPoint entrancePoint = new TGPoint(0,0); //Declares where balls start
        BallBot[] ballBotArray = new BallBot[10]; //Creates a list of balls
        BallRunner ballRunner = new BallRunner();
        boolean i = true;
        while(i == true) {
            if(ballRunner.entranceClear(ballBotArray, entrancePoint) == true) { //If there isn't another ball at the sntrancepoint than new ball can appear
                int freeBallBotIndex;
                freeBallBotIndex = ballRunner.findFreeBallBotIndex(ballBotArray); //Finds a space in the array to put the new ball
                if (freeBallBotIndex < ballBotArray.length) {
                    BallBot ballBot = new BallBot(ballWorld, entrancePoint, (int)(Math.random() * 360), 20); //Creates new ball
                    ballBotArray[freeBallBotIndex] = ballBot; //Puts new ball in array
                }
            }
            for(int index = 0; index < ballBotArray.length; index++) {
                if (ballBotArray[index] != null) { //Tests whether there is a ball to control
                    if(ballBotArray[index].canMoveForward(ballWorld) == true && ballRunner.ballBotToBounceOff(ballBotArray[index], ballBotArray) == null){ //Test whether the ball can move forward without hitting another ball
                        ballBotArray[index].moveForward();
                    } else {
                        ballBotArray[index].setHeading((Math.random() * 360)); //Changes heading to random direction if ball hits another ball
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

    public int findFreeBallBotIndex(BallBot[] array) { //Determines if there is space in array to fit another ball and returns the index if there is a space, else returns array length
        for(int i = 0; i < array.length; i = i + 1) {
            if(array[i] == null) {
                return i;
            }
        }
        return array.length;
    }
    
    public double distanceBetweenPoints(TGPoint point1, TGPoint point2) { //Determines the distance between two ball's centers
        return Math.sqrt((point1.x - point2.x)*(point1.x - point2.x) + (point1.y - point2.y)*(point1.y - point2.y));
    }
    
    public boolean entranceClear(BallBot[] array, TGPoint coord) { //Determines if there re no other balls blocking the entrance
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
    public BallBot ballBotToBounceOff(BallBot ballBot, BallBot[] array) { //Determines if two balls will bump into each other
        TGPoint firstPoint = ballBot.getPoint();
        TGPoint nextPoint = ballBot.forwardPoint();
        boolean returned = false;
        for(int i = 0; i < array.length; i = i + 1) {
            boolean c1 = false;
            boolean c2 = false;
            BallBot otherBallBot = array[i];
            if (otherBallBot != null && otherBallBot != ballBot) {
                double currentDistance = distanceBetweenPoints(firstPoint, array[i].getPoint());
                if(currentDistance <= (ballBot.getRadius() + otherBallBot.getRadius())) {            
                    c1 = true;
                }
                double nextDistance = distanceBetweenPoints(nextPoint, array[i].getPoint());
                if(nextDistance <= (ballBot.getRadius() + otherBallBot.getRadius())) {            
                    c2 = true;
                }
            }
            if (c1 == true && c2 == true) { //FINISH THIS
                returned = true;
                return otherBallBot;
            }
        }
        return null;
    }
}
