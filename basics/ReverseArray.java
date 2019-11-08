import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Arrays;

// the class name must be capitalized and the same as the file name
public class ReverseArray {
    // running a file in java means running the main method
    // the main method always look exactly like this
    public static void main(String[] args){
       

        String[] actualArray = new String[]{"vishnu","srini","ranjit","vinay","varada","senthil"};
        int arrayLength = actualArray.length;
        String[] reversedArray = reverseArrayList(actualArray);

        //for(int k = 0; k < arrayLength; k++){
        //    System.out.println(reversedArray[k]);
        //};

        System.out.println(Arrays.toString(reversedArray));
    }
    
    

    public static String[] reverseArrayList(String[] arrayList){
        String[] reverseArray = new String[arrayList.length];
        int j = arrayList.length - 1;
        //System.out.println("J value is"+ j);
        int i = 0;
        while(true){
            reverseArray[i] = arrayList[j];
            reverseArray[j] = arrayList[i];
            //System.out.println(reverseArray[i] +" "+ reverseArray[j]);
            i = i + 1;
            j = j - 1;
            if ( i > j){
                break;
            }
        }
        
        return reverseArray;
        
    }


}