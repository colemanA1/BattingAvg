import java.util.*;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static int getNumBatters() {
        System.out.println("Enter number of batters: ");
        int numBatters = scan.nextInt();
        return numBatters;
    }

    public static int getAtBat() {
        System.out.println("Enter number of times At Bat: ");
        int atBat = scan.nextInt();
        return atBat;
    }


    public static void main(String[] args) {
        System.out.println("WELCOME TO THE BATTING AVG CALCULATOR!!");
        System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");

        int numBatters = 0;
        int[][] batterStats;
        int count = 0;
        int sum = 0;
        int batCount = 0;
        int hits = 0;

        batterStats = new int[getNumBatters()][];
        for (int i = 0; i < batterStats.length; i++) {
            int noAtBats = getAtBat();
            //This code creates the 2nd array.
            batterStats[i] = new int[noAtBats];
            //This code iterates to print from scanner the array
            for (int j = 0; j < noAtBats; j++) {
                System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");
                System.out.println("Enter hits on bat " +(batCount + 1) + " for Player " + (numBatters +1) + ": ");
                hits = scan.nextInt();
                if(hits < 5 && hits>0){
                    ++count;
                }
                batterStats[i][j] = hits;
                sum = sum + batterStats[i][j];
                ++batCount;
            }
            batCount = 0;


            double battingAvg = (double)count/(double)noAtBats;
            double slugPerc = (double)sum/(double)noAtBats;
            System.out.println("Batting avg for Player " + (numBatters + 1) + " is: "+ battingAvg);
            System.out.println("and the ");
            System.out.println("Slug Percentage for Player " + (numBatters + 1) + " is: "+ slugPerc);
            numBatters ++;
        }

    }

}

