import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Arrays;

public class RollDice{

    public static void main(String[] args){
        int noOfTime = 4;
        //System.out.println(rollingDice(noOfTime));
        System.out.println(Arrays.toString(rollingDice(noOfTime)));

    }



    public static int[] rollingDice(int totalIteration){
        int[] rolledDice = new int[totalIteration];
        int noIteration = 0;

        while(true){
            double diceValue = Math.random();
        
            
            if (diceValue <= 0.1){
                rolledDice[noIteration] = 1;
                noIteration++;

            } else if(diceValue <= 0.2){
                rolledDice[noIteration] = 2;
                noIteration++;
            } else if(diceValue <= 0.3){
                rolledDice[noIteration] = 3;
                noIteration++;
            } else if(diceValue <= 0.4){
                rolledDice[noIteration] = 4;
                noIteration++;
            } else if(diceValue <= 0.5){
                rolledDice[noIteration] = 5;
                noIteration++;
            } else if(diceValue <= 0.6){
                rolledDice[noIteration] = 6;
                noIteration++;
            } 

            if (noIteration == totalIteration){
                break;
            }
        }

        return rolledDice;

    }

}