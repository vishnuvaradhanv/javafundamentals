import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Arrays;

public class CalculateAverage{
    public static void main(String[] args){
        int[] givenArray = new int[]{1,2,3,4,5,6};
        double arrayAverage = averageCalculation(givenArray);

        System.out.println("Average of an array" + Arrays.toString(givenArray) + " is " + arrayAverage);

    }

    public static double averageCalculation(int[] calculateArray){
        int sumOfArray = 0;
        double average = 0;
        for(int i = 0; i < calculateArray.length; i++){
            sumOfArray = calculateArray[i] + sumOfArray;
        }
        //System.out.println(sumOfArray);
        //System.out.println(calculateArray.length);
        average = (double)sumOfArray/ (double)calculateArray.length;
        //System.out.println(average);
        return average;
    }
}