/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }
  
  public static void testKeepOnlyBlue() {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.onlyBlue();
      beach.explore();
    }
    
    public static void testKeepOnlyRed() {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.onlyRed();
      beach.explore();
    }
    
    public static void testKeepOnlyGreen() {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.onlyGreen();
      beach.explore();
    }
    
    public static void testNegate() {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.negate();
        beach.explore();
    }
    
    public static void testGrayscale() {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.grayscale();
        beach.explore();
    }
    
    public static void testFixUnderwater(){
        Picture water = new Picture("water.jpg");
        water.explore();
        water.fishMoreVis();
        water.explore();
    }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
  public static void testMirrorHorizontal()
  {
    Picture redMotorcycle = new Picture("redMotorcycle.jpg");
    redMotorcycle.explore();
    redMotorcycle.mirrorHorizontal();
    redMotorcycle.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.mirrorHorizontalBotToTop();
    beach.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    snowman.mirrorArms(snowman, 153, 100, 193, 170);
    snowman.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testCollage2()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage2();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture p = new Picture("Nathan.jpg");
    p.explore();
    p.edgeDetection(10);
    p.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCollage2();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}