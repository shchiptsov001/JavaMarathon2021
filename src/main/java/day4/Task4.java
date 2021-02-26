package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] myMatrix = new int[100];
        Random random = new Random();
        int sum = 0, bestSum = 0, bestInd = 0;

        for (int i = 0; i < myMatrix.length; i++) {
            myMatrix[i] = random.nextInt(10000) + 1;
        }

//        for (int i = 0; i < myMatrix.length; i++) {
//            System.out.print(myMatrix[i] + " ");
//        }
//        System.out.println();

        for (int k = 0; k < myMatrix.length - 2; k++) {
            sum = myMatrix[k] + myMatrix[k + 1] + myMatrix[k + 2];
            if (sum >= bestSum) {
                bestSum = sum;
                bestInd = k;
            }
        }
        System.out.println(bestSum);
        System.out.println(bestInd);
    }
}
