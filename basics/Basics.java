import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Arrays;

// the class name must be capitalized and the same as the file name
public class Basics{
    // running a file in java means running the main method
    // the main method always look exactly like this
    public static void main(String[] args){
        System.out.println("-----------------------------------");
        System.out.println("Is Ginger cold program");
        System.out.println("Hellow everyone it is such a nice morning");

        if(isGingerCold()){
            System.out.println("get ginger a sweater");
        } else {
            System.out.println("maybe we should shage ginger");
        }


        System.out.println("-----------------------------------");
        System.out.println("Pluralize program");
        int animalCount = 5;
        String animalName = "cat";
        if(pluralize(animalCount)){
            System.out.println("I have "+ animalCount + " " + animalName+"s");
        }else{
            System.out.println("I have "+ animalCount + " " + animalName);
        }

        int coinFlipCount = 4;

        System.out.println("-----------------------------------");
        System.out.println("No of Flips");
        flipCoins(coinFlipCount);

        System.out.println("-----------------------------------");
        System.out.println("No of Heads in a row");
        flipCoinsInRow(coinFlipCount);

        
    }
    
    //public static Type nameOFMethod()
    // make a calendar instance
    public static boolean isGingerCold(){
        Calendar cal = Calendar.getInstance();
        String currentMonth = new SimpleDateFormat("MMM").format(cal.getTime());
        if(currentMonth.equals("Nov")||currentMonth.equals("Dec")||currentMonth.equals("Jan")||currentMonth.equals("Feb")){
            return true;
        } else{
            return false;
        }
        
    }

    public static boolean pluralize(int objectCount){
        if(objectCount == 0 || objectCount > 1){
            return true;
        } else {
            return false;
        }
    }

    public static void flipCoins(int flipCount){
        String heads = "Heads";
        String tails = "Tails";
        int headcount = 0;
        for(int i=0; i<flipCount; i++){
            if(Math.random() < 0.5){
                System.out.println(heads);

                //return(heads);
            } else{

                //return(tails);
                System.out.println(tails);
            }
            
        }
        //return "you must enter count more than zero";
    }

    public static void flipCoinsInRow(int flipCount){
        String heads = "Heads";
        String tails = "Tails";
        int headcount = 0;
        int iteration = 0;
        while(true){
            iteration++;
            if(Math.random() < 0.5){
                System.out.println(heads);
                headcount++;
                //return(heads);
            } else{
                headcount = 0;
                //return(tails);
                System.out.println(tails);
            }

            if ( headcount == flipCount){
                break;
            }

        }
        //return "you must enter count more than zero";
        System.out.println("It took "+ iteration +" flips to flip " + flipCount + " heads in a row.");
    }





}