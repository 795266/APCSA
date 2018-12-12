import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 * 
 * Nathan Bowman
 */
public class Picture extends SimplePicture 
{
    ///////////////////// constructors //////////////////////////////////

    /**
     * Constructor that takes no arguments 
     */
    public Picture ()
    {
        /* not needed but use it to show students the implicit call to super()
         * child constructors always call a parent constructor 
         */
        super();  
    }

    /**
     * Constructor that takes a file name and creates the picture 
     * @param fileName the name of the file to create the picture from
     */
    public Picture(String fileName)
    {
        // let the parent class handle this fileName
        super(fileName);
    }

    /**
     * Constructor that takes the width and height
     * @param height the height of the desired picture
     * @param width the width of the desired picture
     */
    public Picture(int height, int width)
    {
        // let the parent class handle this width and height
        super(width,height);
    }

    /**
     * Constructor that takes a picture and creates a 
     * copy of that picture
     * @param copyPicture the picture to copy
     */
    public Picture(Picture copyPicture)
    {
        // let the parent class do the copy
        super(copyPicture);
    }

    /**
     * Constructor that takes a buffered image
     * @param image the buffered image to use
     */
    public Picture(BufferedImage image)
    {
        super(image);
    }

    ////////////////////// methods ///////////////////////////////////////

    /**
     * Method to return a string with information about this picture.
     * @return a string with information about the picture such as fileName,
     * height and width.
     */
    public String toString()
    {
        String output = "Picture, filename " + getFileName() + 
            " height " + getHeight() 
            + " width " + getWidth();
        return output;

    }

    /** Method to set the blue to 0 */
    public void zeroBlue()
    {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setBlue(0);
            }
        }
    }

    public void onlyBlue()
    {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setRed(0);
                pixelObj.setGreen(0);
            }
        }
    }

    public void onlyRed()
    {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setBlue(0);
                pixelObj.setGreen(0);
            }
        }
    }

    public void onlyGreen()
    {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setRed(0);
                pixelObj.setBlue(0);
            }
        }
    }

    public void negate() {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setRed(255 - pixelObj.getRed());
                pixelObj.setBlue(255 - pixelObj.getBlue());
                pixelObj.setGreen(255 - pixelObj.getGreen());
            }
        }
    }

    public void grayscale() {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setRed((pixelObj.getRed() + pixelObj.getBlue() + pixelObj.getGreen())/3);
                pixelObj.setBlue((pixelObj.getRed() + pixelObj.getBlue() + pixelObj.getGreen())/3);
                pixelObj.setGreen((pixelObj.getRed() + pixelObj.getBlue() + pixelObj.getGreen())/3);
            }
        }
    }

    public void fishMoreVis() {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setRed(pixelObj.getRed() + 100);
            }
        }
    }

    /** Method that mirrors the picture around a 
     * vertical mirror in the center of the picture
     * from left to right */
    public void mirrorVertical()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; col < width / 2; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][width - 1 - col];
                rightPixel.setColor(leftPixel.getColor());
            }
        } 
    }

    public void mirrorVerticalRightToLeft()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = width - 1; col > width / 2; col = col - 1)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][width - 1 - col];
                rightPixel.setColor(leftPixel.getColor());
            }
        } 
    }

    public void mirrorHorizontal()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        int height = pixels.length;
        for (int row = 0; row < pixels.length / 2; row++)
        {
            for (int col = 0; col < pixels[row].length; col++)
            {
                topPixel = pixels[row][col];
                bottomPixel = pixels[height - 1 - row][col];
                Color x = topPixel.getColor();
                bottomPixel.setColor(topPixel.getColor());
            }
        } 
    }

    public void mirrorHorizontalBotToTop()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        int height = pixels.length;
        for (int row = 0; row < pixels.length / 2; row++)
        {
            for (int col = 0; col < pixels[row].length; col++)
            {
                topPixel = pixels[row][col];
                bottomPixel = pixels[height - 1 - row][col];
                Color x = topPixel.getColor();
                topPixel.setColor(bottomPixel.getColor());
            }
        } 
    }

    /** Mirror just part of a picture of a temple */
    public void mirrorTemple()
    {
        int mirrorPoint = 276;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int count = 0;
        Pixel[][] pixels = this.getPixels2D();

        // loop through the rows
        for (int row = 27; row < 97; row++)
        {
            // loop from 13 to just before the mirror point
            for (int col = 13; col < mirrorPoint; col++)
            {

                leftPixel = pixels[row][col];      
                rightPixel = pixels[row]                       
                [mirrorPoint - col + mirrorPoint];
                rightPixel.setColor(leftPixel.getColor());
            }
        }
    }

    /** copy from the passed fromPic to the
     * specified startRow and startCol in the
     * current picture
     * @param fromPic the picture to copy from
     * @param startRow the start row to copy to
     * @param startCol the start col to copy to
     */
    public void copy(Picture fromPic, 
    int startRow, int startCol)
    {
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] toPixels = this.getPixels2D();
        Pixel[][] fromPixels = fromPic.getPixels2D();
        for (int fromRow = 0, toRow = startRow; 
        fromRow < fromPixels.length &&
        toRow < toPixels.length; 
        fromRow++, toRow++)
        {
            for (int fromCol = 0, toCol = startCol; 
            fromCol < fromPixels[0].length &&
            toCol < toPixels[0].length;  
            fromCol++, toCol++)
            {
                fromPixel = fromPixels[fromRow][fromCol];
                toPixel = toPixels[toRow][toCol];
                toPixel.setColor(fromPixel.getColor());
            }
        }   
    }

    public void mirrorArms(Picture fromPic, int startRow, int startCol, int endRow, int endCol) //153, 100, 193, 170
    {
        int mirrorPoint = endRow;
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        Pixel[][] pixels = this.getPixels2D();
        for (int row = startRow; row < mirrorPoint; row++){
            for (int col = startCol; col < endCol; col++)
            {
                topPixel = pixels[row][col];
                bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
                bottomPixel.setColor(topPixel.getColor());
            }
        }
        int mirrorPoint2 = 210;
        for (int row = startRow; row < endRow + (endRow - startRow); row++){
            for (int col = startCol; col < mirrorPoint2; col++)
            {
                leftPixel = pixels[row][col];      
                rightPixel = pixels[row][mirrorPoint - col + mirrorPoint2];
                rightPixel.setColor(leftPixel.getColor());
            }
        }
    }

    public void mirrorGull(Picture fromPic, int startRow, int startCol, int endRow, int endCol) //234, 234, 325, 345
    {
        int mirrorPoint = endRow;
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        Pixel[][] pixels = this.getPixels2D();
        for (int row = startRow; row < endRow + (endRow - startRow); row++){
            for (int col = startCol; col < mirrorPoint; col++)
            {
                leftPixel = pixels[row][col];      
                rightPixel = pixels[row][col - (endCol - startCol)];
                rightPixel.setColor(leftPixel.getColor());
            }
        }
    }
    
    /** Method to create a collage of several pictures */
    public void createCollage()
    {
        Picture flower1 = new Picture("flower1.jpg");
        Picture flower2 = new Picture("flower2.jpg");
        this.copy(flower1,0,0);
        this.copy(flower2,100,0);
        this.copy(flower1,200,0);
        Picture flowerNoBlue = new Picture(flower2);
        flowerNoBlue.zeroBlue();
        this.copy(flowerNoBlue,300,0);
        this.copy(flower1,400,0);
        this.copy(flower2,500,0);
        this.mirrorVertical();
        this.write("collage.jpg");
    }
    
    public void createCollage2()
    {
        Picture robot = new Picture("robot.jpg");
        Picture dove = new Picture("dove2.jpg");
        Picture hawk = new Picture("hawk2.jpg");
        this.copy(robot,0,0);
        robot.negate();
        this.copy(robot,100,0);
        this.copy(hawk,200,0);
        Picture robotNoBlue = new Picture(robot);
        robotNoBlue.zeroBlue();
        this.copy(robotNoBlue,300,0);
        this.copy(hawk,400,0);
        this.mirrorVertical();
        this.write("collage.jpg");
    }

    /** Method to show large changes in color 
     * @param edgeDist the distance for finding edges
     */
    public void edgeDetection(int edgeDist)
    {
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        Pixel[][] pixels = this.getPixels2D();
        Color rightColor = null;
        Color bottomColor = null;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; 
            col < pixels[0].length-1; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][col+1];
                rightColor = rightPixel.getColor();
                int x = (int)(row / 100);
                if (leftPixel.colorDistance(rightColor) > 
                edgeDist) {
                    if (x == 0 || x == 3 || x == 6 || x == 9 || x == 12) {
                        leftPixel.setColor(Color.ORANGE);
                    }
                     else if (x == 1 || x == 4 || x == 7 || x == 10 || x == 13) {
                        leftPixel.setColor(Color.BLUE);
                    }
                     else {
                        leftPixel.setColor(Color.RED);
                    }
                } else {
                    leftPixel.setBlue(255);
                    leftPixel.setRed(255);
                    leftPixel.setGreen(255);
                    
                }
            }
        }
        for (int col = 0; col < pixels[0].length; col++)
        {
            for (int row = 0; 
            row < pixels.length-1; row++)
            {
                topPixel = pixels[row][col];
                bottomPixel = pixels[row + 1][col];
                bottomColor = bottomPixel.getColor();
                int x = (int)(row / 100);
                if (topPixel.colorDistance(bottomColor) > 
                edgeDist)
                    if (x == 0 || x == 3 || x == 6 || x == 9 || x == 12) {
                        leftPixel.setColor(Color.ORANGE);
                    }
                     else if (x == 1 || x == 4 || x == 7 || x == 10 || x == 13) {
                        leftPixel.setColor(Color.BLUE);
                    }
                     else {
                        leftPixel.setColor(Color.RED);
                    }
                }
            
        }
    }
    
    public void edgeDetection2(int edgeDist)
    {
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        Pixel[][] pixels = this.getPixels2D();
        Color rightColor = null;
        Color bottomColor = null;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; 
            col < pixels[0].length-1; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][col+1];
                rightColor = rightPixel.getColor();
                int x = (int)(Math.sqrt(row * row + col * col));
                if (leftPixel.colorDistance(rightColor) > 
                edgeDist) {
                    if (x == 0 || x == 3 || x == 6 || x == 9 || x == 12) {
                        leftPixel.setColor(Color.ORANGE);
                    }
                     else if (x == 1 || x == 4 || x == 7 || x == 10 || x == 13) {
                        leftPixel.setColor(Color.BLUE);
                    }
                     else {
                        leftPixel.setColor(Color.RED);
                    }
                } else {
                    leftPixel.setBlue(255);
                    leftPixel.setRed(255);
                    leftPixel.setGreen(255);
                    
                }
            }
        }
        for (int col = 0; col < pixels[0].length; col++)
        {
            for (int row = 0; 
            row < pixels.length-1; row++)
            {
                topPixel = pixels[row][col];
                bottomPixel = pixels[row + 1][col];
                bottomColor = bottomPixel.getColor();
                int x = (int)(Math.sqrt(row * row + col * col) / 100);
                //System.out.println(x);
                if (topPixel.colorDistance(bottomColor) > 
                edgeDist)
                    if (x == 0 || x == 3 || x == 6 || x == 9 || x == 12) {
                        leftPixel.setColor(Color.ORANGE);
                    }
                     else if (x == 1 || x == 4 || x == 7 || x == 10 || x == 13) {
                        leftPixel.setColor(Color.BLUE);
                    }
                     else {
                        leftPixel.setColor(Color.RED);
                    }
                }
            
        }
    }
    
    public void edgeDetection3(int edgeDist)
    {
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        Pixel[][] pixels = this.getPixels2D();
        Color rightColor = null;
        Color bottomColor = null;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; 
            col < pixels[0].length-1; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][col+1];
                rightColor = rightPixel.getColor();
                int x = (int)(Math.sqrt(row * row + col * col) / 100);
                if (leftPixel.colorDistance(rightColor) > 
                edgeDist) {
                    if (x == 0 || x == 3 || x == 6 || x == 9 || x == 12) {
                        leftPixel.setColor(Color.ORANGE);
                    }
                     else if (x == 1 || x == 4 || x == 7 || x == 10 || x == 13) {
                        leftPixel.setColor(Color.BLUE);
                    }
                     else {
                        leftPixel.setColor(Color.RED);
                    }
                } else {
                    leftPixel.setBlue(255);
                    leftPixel.setRed(255);
                    leftPixel.setGreen(255);
                    
                }
            }
        }
        for (int col = 0; col < pixels[0].length; col++)
        {
            for (int row = 0; 
            row < pixels.length-1; row++)
            {
                topPixel = pixels[row][col];
                bottomPixel = pixels[row + 1][col];
                bottomColor = bottomPixel.getColor();
                int x = (int)(Math.sqrt(row * row + col * col) / 100);
                //System.out.println(x);
                if (topPixel.colorDistance(bottomColor) > 
                edgeDist)
                    if (x == 0 || x == 3 || x == 6 || x == 9 || x == 12) {
                        leftPixel.setColor(Color.ORANGE);
                    }
                     else if (x == 1 || x == 4 || x == 7 || x == 10 || x == 13) {
                        leftPixel.setColor(Color.BLUE);
                    }
                     else {
                        leftPixel.setColor(Color.RED);
                    }
                }
        }
    }

    /* Main method for testing - each class in Java can have a main 
     * method 
     */
    public static void main(String[] args) 
    {
        Picture snowman = new Picture("seagull.jpg");
        snowman.explore();
        //snowman.fishMoreVis();
        //snowman.explore();

    }
} // this } is the end of class Picture, put all new methods before this
