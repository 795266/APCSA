
/**
 * Write a description of class GridTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GridTester
{
    public static void main() {
        int[][] mat = loadArray();
        System.out.println("Sum: " + sumAll(mat));
        System.out.println("Max: " + findGreatest(mat));
        System.out.println("Max appears " + numOfGreatest(mat) + " times");
        
        System.out.println("Average: " + findAverage(mat));
    }
    
    public static int[][] loadArray() {
        int[][] loading = new int[10][10];
        for (int i = 0; i < loading.length; i = i + 1) {
            for (int j = 0; j < loading[i].length; j = j + 1) {
                loading[i][j] = (int) (Math.random() * 100);
            } 
        }
        return loading;
    }
    
    public static int sumAll(int[][] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i = i + 1) {
            for (int j = 0; j < x[i].length; j = j + 1) {
                sum = sum + x[i][j];
            } 
        }
        return sum;
    }
    
    public static int findGreatest(int[][] x) {
        int max = 0;
        for (int i = 0; i < x.length; i = i + 1) {
            for (int j = 0; j < x[i].length; j = j + 1) {
                if (max < x[i][j]) {
                    max = x[i][j];
                }
            } 
        }
        return max;
    }
    
    public static int numOfGreatest(int[][] x) {
        int max = 0;
        for (int i = 0; i < x.length; i = i + 1) {
            for (int j = 0; j < x[i].length; j = j + 1) {
                if (max < x[i][j]) {
                    max = x[i][j];
                }
            } 
        }
        int numOfMax = 0;
        for (int i = 0; i < x.length; i = i + 1) {
            for (int j = 0; j < x[i].length; j = j + 1) {
                if (max == x[i][j]) {
                    numOfMax = numOfMax + 1;
                }
            } 
        }
        return numOfMax;
    }
    
    public static int findAverage(int[][] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i = i + 1) {
            for (int j = 0; j < x[i].length; j = j + 1) {
                sum = sum + x[i][j];
            } 
        }
        return sum / 100;
    }
}
