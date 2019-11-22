import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.lang.model.util.ElementScanner6;

import java.util.Arrays;

public class InsertArrayElement{
    public static void main(String[] args){
        String[] currentArray = new String[]{"a","b","c"};
        String newElement = "e";
        String[] addedArray = addElement(currentArray, newElement);
        System.out.println(Arrays.toString(addedArray));
    }

    public static String[] addElement(String[] newArray, String newchar){
        int arrayLength = newArray.length;
        String[] formArray = new String[arrayLength+1];

        for(int i=0; i < arrayLength; i++){
            if( i < arrayLength/2){
                formArray[i] = newArray[i];
            } 
            else if(i >= arrayLength/2){
                formArray[i+1] = newArray[i];
            } 
        }

        
            formArray[(int)arrayLength/2] = newchar;
        

        return formArray;


    }
}