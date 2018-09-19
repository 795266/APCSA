
/**
 * Write a description of class studentRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class studentRunner
{
       public static void main(){
        String[] names = {"S1", "S2","S3","S4","S5"};
        double[] stuNums;
        stuNums = new double[5];
        for (int i = 0; i < stuNums.length; i = i + 1) {
        stuNums[i] = (double)(Math.random() * 1000000 / 1);
    }
        Student[] pupil = new Student[5];  
        for(int i = 0; i < 5; i = i + 1) {    
        pupil[i] = new Student(stuNums[i], names[i]);
}
        for(int i = 0; i < names.length; i = i + 1) {
            System.out.println(pupil[i].getStudName);
    }
}
}