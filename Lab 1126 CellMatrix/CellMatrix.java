
/**
 * 
 * CellMatrix
 * @author (eettlin) 
 * @version (11-26-18)
 */
public class CellMatrix{
    /**
     * +++++++++++++++++++++Instance variables
     */

    private Cell[][] cells;
    int[] neighbors;

    /**
     * +++++++++++++++++++++Constructor for objects of class NumberMatrix
     */
    public CellMatrix(int a, int b){
        cells = new Cell[a][b];

    }

    /**
     * +++++++++++++++++++++++++++++++++++++++++++++++++++++++methods
     */
    //Print each row and column of nums to the console
    public void printMatrix(){
        for (int i = 0; i < cells.length; i = i + 1) {
            for (int j = 0; j < cells[i].length; j = j + 1) {
                System.out.print(cells[i][j].getInt() + " ");
            }
            System.out.println("");
        }
    }
    //  load nums with random with numbers between 1 and 10 inclusive
    public void loadMatrix(){
        for (int i = 0; i < cells.length; i = i + 1) {
            for (int j = 0; j < cells[i].length; j = j + 1) {
                cells[i][j] = new Cell((int)(Math.random() * 9 + 1));
            }
        }
    }
    //  Load neighbor cells into the neighbors array
    public void loadNeighbors(){
        for (int i = 0; i < cells.length; i = i + 1) {
            for (int j = 0; j < cells[i].length; j = j + 1) {
               int greatest = 0;
                if (i == 0) {
                    if (j == 0) {
                        Cell e = cells[i][j + 1];
                        Cell s = cells[i + 1][j];
                        greatest = e.getInt() + s.getInt();
                    }
                    else if (j == cells[i].length - 1) {
                        Cell w = cells[i][j - 1];
                        Cell s = cells[i + 1][j];
                        greatest = w.getInt() + s.getInt();
                    }
                    else {
                        Cell e = cells[i][j + 1];
                        Cell w = cells[i][j - 1];
                        Cell s = cells[i + 1][j];
                        greatest = e.getInt() + s.getInt() + w.getInt();
                    }
                }
               else if (i == cells.length - 1) {
                    if (j == 0) {
                        Cell e = cells[i][j + 1];
                        Cell n = cells[i - 1][j];
                        greatest = e.getInt() + n.getInt();
                    }
                    else if (j == cells[i].length - 1) {
                        Cell w = cells[i][j - 1];
                        Cell n = cells[i - 1][j];
                        greatest = w.getInt() + n.getInt();
                    }
                    else {
                        Cell e = cells[i][j + 1];
                        Cell w = cells[i][j - 1];
                        Cell n = cells[i - 1][j];
                        greatest = e.getInt() + n.getInt() + w.getInt();
                    }
                }
               else {
                    if (j == 0) {
                        Cell e = cells[i][j + 1];
                        Cell n = cells[i - 1][j];
                        Cell s = cells[i + 1][j];
                        greatest = e.getInt() + s.getInt() + n.getInt();
                    }
                    else if (j == cells[i].length - 1) {
                        Cell w = cells[i][j - 1];
                        Cell n = cells[i - 1][j];
                        Cell s = cells[i + 1][j];
                        greatest = n.getInt() + s.getInt() + w.getInt();
                    }
                    else {
                        Cell e = cells[i][j + 1];
                        Cell w = cells[i][j - 1];
                        Cell n = cells[i - 1][j];
                        Cell s = cells[i + 1][j];
                        greatest = e.getInt() + s.getInt() + w.getInt() + n.getInt();
                    }
                }
               System.out.print(greatest + " ");
           }
           System.out.println("");
        }
    }
    //  Findis the sum of each of the neighbors and returns the greatest 
    // neighbor value
    public int getGreatestNeighbors(){
        int greatest = 0;
        int maxGreatest = 0;
        Cell nucleus;

        for (int i = 0; i < cells.length; i = i + 1) {
            for (int j = 0; j < cells[i].length; j = j + 1) {
               if (i == 0) {
                    if (j == 0) {
                        Cell e = cells[i][j + 1];
                        Cell s = cells[i + 1][j];
                        greatest = e.getInt() + s.getInt();
                    }
                    else if (j == cells[i].length - 1) {
                        Cell w = cells[i][j - 1];
                        Cell s = cells[i + 1][j];
                        greatest = w.getInt() + s.getInt();
                    }
                    else {
                        Cell e = cells[i][j + 1];
                        Cell w = cells[i][j - 1];
                        Cell s = cells[i + 1][j];
                        greatest = e.getInt() + s.getInt() + w.getInt();
                    }
                }
               else if (i == cells.length - 1) {
                    if (j == 0) {
                        Cell e = cells[i][j + 1];
                        Cell n = cells[i - 1][j];
                        greatest = e.getInt() + n.getInt();
                    }
                    else if (j == cells[i].length - 1) {
                        Cell w = cells[i][j - 1];
                        Cell n = cells[i - 1][j];
                        greatest = w.getInt() + n.getInt();
                    }
                    else {
                        Cell e = cells[i][j + 1];
                        Cell w = cells[i][j - 1];
                        Cell n = cells[i - 1][j];
                        greatest = e.getInt() + n.getInt() + w.getInt();
                    }
                }
               else {
                    if (j == 0) {
                        Cell e = cells[i][j + 1];
                        Cell n = cells[i - 1][j];
                        Cell s = cells[i + 1][j];
                        greatest = e.getInt() + s.getInt() + n.getInt();
                    }
                    else if (j == cells[i].length - 1) {
                        Cell w = cells[i][j - 1];
                        Cell n = cells[i - 1][j];
                        Cell s = cells[i + 1][j];
                        greatest = n.getInt() + s.getInt() + w.getInt();
                    }
                    else {
                        Cell e = cells[i][j + 1];
                        Cell w = cells[i][j - 1];
                        Cell n = cells[i - 1][j];
                        Cell s = cells[i + 1][j];
                        greatest = e.getInt() + s.getInt() + w.getInt() + n.getInt();
                    }
                }
               if (greatest > maxGreatest) {
                   maxGreatest = greatest;
                }
           }
        }
        return maxGreatest;
    }
}