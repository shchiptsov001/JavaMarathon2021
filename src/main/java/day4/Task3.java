package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] myMatrix = new int[12][8];
        Random random = new Random();
        int sum = 0, bestSum = 0, bestInd = 0;

        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
                myMatrix[i][j] = random.nextInt(50) + 1;
            }
        }

        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
//                System.out.print(myMatrix[i][j] + " ");
                sum = sum + myMatrix[i][j];
            }
//            System.out.println();
            if (sum >= bestSum) {
                bestSum = sum;
                bestInd = i;
            }
            sum = 0;
        }
        System.out.println(bestInd);
    }
}
