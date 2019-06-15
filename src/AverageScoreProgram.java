import java.util.Scanner;

public class AverageScoreProgram {
    public static void main (String [] args){

    Scanner keyboard = new Scanner(System.in);

        double examScore = 0;

        System.out.println("How many scores  would you like to average?");
        int numberOfScores = keyboard.nextInt();

    for (int i=1; i < (numberOfScores + 1); i++) {
        System.out.println("Enter score" + i);
        examScore += keyboard.nextInt();

    }
        System.out.println(examScore / numberOfScores);
    }
}
