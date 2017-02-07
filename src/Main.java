import java.util.*;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static int getNumBatters() {
        System.out.println("Enter number of batters: ");
        int numBatters = scan.nextInt();
        return numBatters;
    }

    public static int getAtBat() {
        int atBat = scan.nextInt();
        return atBat;
    }
    public static int getValidInteger(){
        while(!scan.hasNextInt()){
            //scan.nextLine();
            System.out.println("Please enter an integer! ");
        }return scan.nextInt();
    }

    public static boolean checkRange(int input, int min, int max){
        if(input<= min||input>=max) {
            return false;
        }return true;
    }

    public static int getValidInteger(int min, int max){
        int userInput = getValidInteger();
        while(!checkRange(userInput, min, max)) {
            System.out.println("Please provide a number within correct range!");
            userInput = getValidInteger();
        }return userInput;
    }

    public static void main(String[] args) {

        int numBatters = 0;
        int[][] batterStats;
        int count = 0;
        int sum = 0;
        int batCount = 0;
        int hits;
        int noAtBats = getAtBat();

        System.out.println("WELCOME TO THE BATTING AVG CALCULATOR!!");
        batterStats = new int[getNumBatters()][];
        for (int i = 0; i < batterStats.length; i++) {
            System.out.println("Enter number of times At Bat for Player " + (numBatters +1)+": ");
            //This is the code that creates the 2nd array.
            batterStats[i] = new int[noAtBats];
            //This code iterates to print from scanner the array
            for (int j = 0; j < noAtBats; j++) {
                System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");
                System.out.println("Enter hits on bat " +(batCount + 1) + " for Player " + (numBatters +1) + ": ");
                hits = scan.nextInt();
                getValidInteger(-1, 5);
                if(hits < 5 && hits>0){
                    ++count;
                }
                batterStats[i][j] = hits;
                sum = sum + batterStats[i][j];
                ++batCount;
            }
            batCount = 0;
            numBatters++;


           /** double battingAvg = (double)count/(double)noAtBats;
            double slugPerc = (double)sum/(double)noAtBats;
            System.out.println("Batting avg for Player " + (numBatters + 1) + " is: "+ battingAvg);
            System.out.println("and the ");
            System.out.println("Slug Percentage for Player " + (numBatters + 1) + " is: "+ slugPerc);
            numBatters ++;**/
        }
        double battingAvg = (double)count/(double)noAtBats;
        double slugPerc = (double)sum/(double)noAtBats;
        for (int i = 0; i < batterStats.length ; i++){
            System.out.println("Batting avg for Player " + (numBatters + 1) + " is: " + battingAvg);
            System.out.println("and the ");
            System.out.println("Slug Percentage for Player " + (numBatters + 1) + " is: "+ slugPerc);
        }
    }

}

