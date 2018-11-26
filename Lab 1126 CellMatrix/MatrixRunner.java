
/**
 * 
 * 
 * @author (eettlin) 
 * @version (11-26-18)
 */
public class MatrixRunner{
    
    public static void main(){
      CellMatrix cm = new CellMatrix(3, 4);
      cm.loadMatrix();
      System.out.println("The Matrix:");
      cm.printMatrix();
      System.out.println("");
      System.out.println("Value of the neighbors of each matrix coordinate:");
      cm.loadNeighbors();
      System.out.println("");
      System.out.println("The value of the neighbors of the coordinate:");
      System.out.println(cm.getGreatestNeighbors());
    }
}
