import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Arrays;

public class LowestAverage{
    public static void main(String[] args){
        int[][] givenArrayOfArray = {
            {1,2,3,4,5},
            {33,44,66,22},
            {33,22,44}
        };
        int lowestAverageIndex = 0;
        double lowestAverage = 0;
        double arrayAverage = 0;

        for(int j=0; j < givenArrayOfArray.length; j++){
            arrayAverage = averageCalculation(givenArrayOfArray[j]);
            if (j == 0){
                lowestAverage = arrayAverage;
            }
            else if (lowestAverage > arrayAverage){
                lowestAverage = arrayAverage;
                lowestAverageIndex = j;
            }
            
        }
        
        
        System.out.println("The lowest array average is " + lowestAverage + " and the array is " +Arrays.toString(givenArrayOfArray[lowestAverageIndex]));

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