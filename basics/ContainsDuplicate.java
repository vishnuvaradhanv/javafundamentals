import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Arrays;

public class ContainsDuplicate{
    public static void main(String[] args){
        String[] givenArray = new String[]{"a","b","c","d","d"};
        boolean checkedArray = duplicateCheck(givenArray);
        System.out.println("Is array " + Arrays.toString(givenArray) + " contains duplicate values: " + checkedArray);
    }

    public static boolean duplicateCheck(String[] checkArray){
        boolean checkDuplicate = false;
        for(int i = 0; i < checkArray.length - 1; i++){
            //System.out.println("outerArray " + checkArray[i]);
            for(int j = i+1; j < checkArray.length ; j++){
                //System.out.println("innerArray " + checkArray[j]);
                if(checkArray[j] == checkArray[i]){
                    checkDuplicate = true;
                    break;
                }
            }
        }
        return checkDuplicate;
    }

}
